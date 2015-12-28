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
 * $Id: TranslatorHelper.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package i18n;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

class TranslatorHelper {

	private ResourceBundle bundle;

	public TranslatorHelper(ResourceBundle bundle) {
		this.bundle = bundle;
	}

	public void setBundle(ResourceBundle bundle) {
		this.bundle = bundle;
	}

	public String i18n(String in) {
		try {
			return bundle.getString(in);
		} catch (NullPointerException e) {
			return in;
		} catch (MissingResourceException e) {
			return in;
		}
	}

	/**
	 * In Qt the '&amp;' in front of a character represents a mnemonic; but
	 * should not be visible on buttons; this method returns the string sans the
	 * '&amp;'.
	 */
	public String getButtonText(String in) {
		String out = i18n(in);
		// remove all occurences of &
		int i = out.indexOf("&");
		while (i > -1) {
			out = out.substring(0, i) + out.substring(i + 1, out.length());
			i = out.indexOf("&", i);
		}

		return out;
	}

	/**
	 * In Qt the '&amp;' in front of a character represents a mnemonic; but
	 * should not be visible on buttons; this method returns the first character
	 * that follows the '&amp; char.
	 */
	public char getMnemonic(String in) {
		String out = i18n(in);
		int index = out.indexOf("&");
		if (index >= 0 && out.length() - 1 > index)
			return out.charAt(index + 1);

		return 0;
	}
}
