/**
 * <copyright> 
 *
 * Copyright (c) 2008 Fabiano Cruz (UFAM - Universidade Federal do Amazonas) 
 * and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Fabiano Cruz [fabianoc at acm.org] - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: TranslateManager.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package i18n;

import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import javax.swing.JComponent;

public class TranslateManager implements Translator {

	private static final String DEFAULT = "defaultTranslator";

	private final String section;

	private static HashMap<String, TranslatorHelper> sections;

	private static Locale systemLocale;

	private final TranslatorHelper translator;

	static {
		sections = new HashMap<String, TranslatorHelper>();
	}

	/**
	 * Initialize a new Translate object. This constructor will assume the
	 * DEFAULT section should be used and all calls to this instance will be
	 * directed to that.
	 */
	public TranslateManager() {
		this(DEFAULT);
	}

	/**
	 * Create a new Translate that will get translations from the properties
	 * file named 'section_[lan]_[country].properties
	 * 
	 * @param section
	 *            the section of your application that this translate belongs
	 *            to.
	 */
	public TranslateManager(String section) {
		this(section, null);
	}

	/**
	 * Create a new Translate that will get translations from the properties
	 * file named 'section_[lan]_[country].properties
	 * 
	 * @param section
	 *            the section of your application that this translate belongs
	 *            to.
	 * @param o
	 *            when the translations have not been loaded by this application
	 *            before, Translate will use the Object o to find a classloader
	 *            to load the properties file from.
	 */
	public TranslateManager(String section, Object o) {
		this.section = section;
		if (!sections.containsKey(section))
			createTranslator(section, o);
		translator = (TranslatorHelper) sections.get(section);
	}

	/**
	 * To change the key that this Translate object can be fetched with set a
	 * new one. Subsequent Translate objects that are instanciated with the
	 * section key will find the resources this object carries with it.
	 */
	public void setSection(String newSection) {
		sections.remove(section);
		sections.put(newSection, translator);
	}

	/**
	 * To do internationalisation you call this method. Note that
	 * internationalisation is too long and all the industry has now conformed
	 * to the i18n naming (where i18n is a count of characters).
	 * 
	 * @param in
	 *            the input string you want translated
	 * @return the translated string, or the input when no translation is
	 *         available.
	 */
	public String i18n(String in) {
		return translator.i18n(in);
	}

	/**
	 * In Qt the '&amp;' in front of a character represents a mnemonic; but
	 * should not be visible on buttons; this method returns the string sans the
	 * '&amp;'.
	 */
	public String getButtonText(String in) {
		return translator.getButtonText(in);
	}

	/**
	 * In Qt the '&amp;' in front of a character represents a mnemonic; but
	 * should not be visible on buttons; this method returns the first character
	 * that follows the '&amp; char.
	 */
	public char getMnemonic(String in) {
		return translator.getMnemonic(in);
	}

	/**
	 * Set one time per application, all following calls to createTranslator
	 * will look for translations in the given Locale. For the language code you
	 * have to use ISO 639; You can find a full list of these codes at a number
	 * of sites, such as:
	 * http://www.ics.uci.edu/pub/ietf/http/related/iso639.txt
	 * <p>
	 * For the country code you have to use ISO 3166; You can find a full list
	 * of these codes at a number of sites, such as:
	 * http://www.chemie.fu-berlin.de/diverse/doc/ISO_3166.html
	 * 
	 * @param language
	 *            These codes are the lower-case two-letter codes as defined by
	 *            ISO-639.
	 * @param country
	 *            These codes are the upper-case two-letter codes as defined by
	 *            ISO-3166.
	 * @param variant
	 *            the variant of the locale (e.d. EURO)
	 */
	public static void setLocale(String language, String country, String variant) {
		setLocale(new Locale(language, country, variant));
	}

	/** convienience method */
	public static void setLocale(String language, String country) {
		setLocale(new Locale(language, country));
	}

	/** convienience method */
	public static void setLocale(Locale locale) {
		try {
			JComponent.setDefaultLocale(locale);
		} catch (NoSuchMethodError e) {
			systemLocale = locale;
		}
		sections.clear();
	}

	/** @return the set locale; or Locale.getDefault() when none set */
	public static Locale getLocale() {
		try {
			return JComponent.getDefaultLocale();
		} catch (NoSuchMethodError e) {
			if (systemLocale == null)
				systemLocale = Locale.getDefault();
			return systemLocale;
		}
	}

	/** Convinience method */
	public static TranslateManager createTranslator(String section) {
		return createTranslator(section, null);
	}

	/**
	 * Create and initialize a translator.
	 * 
	 * @param section
	 *            the module you are loading; this should correspond to the
	 *            filename of your bundle.
	 * @param o
	 *            object from the same classloader that is to be used to find
	 *            the resourcebundle.
	 * @return an initialized Translate object.
	 */
	public static TranslateManager createTranslator(String section, Object o) {
		ResourceBundle bundle = null;
		try {
			if (o == null)
				bundle = ResourceBundle.getBundle(section, getLocale());
			else
				bundle = ResourceBundle.getBundle(section, getLocale(), o
						.getClass().getClassLoader());
		} catch (MissingResourceException e) {
			System.err.println("Missing resource bundle: '" + section + "'");
			bundle = null;
		}

		if (sections.containsKey(section)) {
			TranslatorHelper translator = (TranslatorHelper) sections
					.get(section);
			translator.setBundle(bundle);
		} else {
			TranslatorHelper translator = new TranslatorHelper(bundle);
			sections.put(section, translator);
		}
		return new TranslateManager(section);
	}

}
