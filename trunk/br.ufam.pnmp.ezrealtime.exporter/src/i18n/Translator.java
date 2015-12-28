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
 * $Id: Translator.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package i18n;

/**
 * Implement this interface on your preferred translator and you are free to
 * return that in the extending class. All you need to do is reimplement the
 * translate() method call.
 * 
 */

public interface Translator {

	/**
	 * To to internationalisation of a string, you call this method. Note that
	 * internationalisation is too long and all the industry has now conformed
	 * to the i18n naming (where i18n is a count of characters).
	 * 
	 * @param in
	 *            the input string you want translated
	 * @return the translated string, or the input when no translation is
	 *         available.
	 */
	public String i18n(String in);

	/**
	 * In Qt the '&amp;' in front of a character represents a mnemonic; but
	 * should not be visible on buttons; this method returns the string sans the
	 * '&amp;'.
	 */
	public String getButtonText(String in);

	/**
	 * In Qt the '&amp;' in front of a character represents a mnemonic; but
	 * should not be visible on buttons; this method returns the first character
	 * that follows the '&amp; char.
	 */
	public char getMnemonic(String in);

}
