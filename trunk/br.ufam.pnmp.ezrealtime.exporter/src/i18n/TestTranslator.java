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
 * $Id: TestTranslator.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package i18n;

public class TestTranslator {

	private static String BUNDLE = "i18n.bundle";

	public static void main(String[] args) {
		System.out.println(translate().i18n("sample.key"));
	}

	public static Translator translate() {
		return new TranslateManager(BUNDLE);
	}
}
