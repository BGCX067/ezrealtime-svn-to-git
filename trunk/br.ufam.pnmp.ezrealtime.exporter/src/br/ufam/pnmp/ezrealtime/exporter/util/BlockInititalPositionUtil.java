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
 * $Id: BlockInititalPositionUtil.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.exporter.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;

public final class BlockInititalPositionUtil {

	private static final String BLOCK_POSITION_FILE = "BlockInitialPosition.dat";

	private static final String INIT_MARK = "[";

	private static final String FINAL_MARK = "]";

	private static final String EOL = ";";

	private static final String[] FIELD_NAMES = { "mameOffsetX", "mameOffsetY",
			"mkgOffsetX", "mkgOffsetY", "posX", "posY" };

	private static final String[] METHODS = { "setNameOffsetX",
			"setNameOffsetY", "setMarkingOffsetX", "setMarkingOffsetY",
			"setPositionX", "setPositionY" };

	public static void main(String[] args) {
		BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.SENDING_MESSAGE);
	}

	public static PlaceOffsetAndPosition createPlaceOffsetAndPosition(
			BlockType blockType) {

		final String tempDir = System.getProperty("user.home") + "/.ezrealtime";

		try {

			int BUFFER_SIZE = 4096;
			File ezTempDir = new File(tempDir);
			if (!ezTempDir.exists())
				ezTempDir.mkdir();

			File newFile = new File(ezTempDir, BLOCK_POSITION_FILE);
			newFile.deleteOnExit();

			InputStream is = FileHelper.getLocalResource(BLOCK_POSITION_FILE);
			int n;
			byte[] buffer = new byte[BUFFER_SIZE];
			FileOutputStream fileoutputstream = new FileOutputStream(newFile);
			while ((n = is.read(buffer)) > -1) {
				fileoutputstream.write(buffer, 0, n);
			}
			fileoutputstream.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		File file = new File(tempDir + "/" + BLOCK_POSITION_FILE);
		return contentHandler(getContents(file), blockType);

	}

	private static PlaceOffsetAndPosition contentHandler(String contents,
			BlockType blockType) {

		switch (blockType) {
		case TASK_ARRIVAL:
			return parseContent(contents, ContentField.PeriodicTaskArrivalBlock);
		case TASK_STRUCTURE:
			return parseContent(contents,
					ContentField.PreemptiveTaskStructureBlock);
		case DEADLINE_CHECKING:
			return parseContent(contents, ContentField.DeadlineCheckingBlock);
		case SENDING_MESSAGE:
			return parseContent(contents, ContentField.SendingMessageBlock);
		case RESOURCES:
			return parseContent(contents, ContentField.ResourceBlock);
		case FORK:
			return parseContent(contents, ContentField.ForkBlock);
		case JOIN:
			return parseContent(contents, ContentField.JoinBlock);
		case INITIAL_STATE:
			return parseContent(contents, ContentField.InitialStateBlock);
		case END_STATE:
			return parseContent(contents, ContentField.EndStateBlock);
		case DISPACHER_OVERHEAD:
			return parseContent(contents, ContentField.DispatcherOverheadBlock);
		default:
			throw new RuntimeException("Bad place position creation for: "
					+ blockType);
		}

	}

	private static PlaceOffsetAndPosition parseContent(String contents,
			ContentField contentField) {

		String strFind = contentField.name();
		String strContent = contents.replace("\t", "").trim();
		int index = strContent.indexOf(strFind) + strFind.length();
		String strFinalContent = strContent.substring(index, index + 100);
		String plainContent = strFinalContent.trim().replace(INIT_MARK, "")
				.replace(FINAL_MARK, "");

		PlaceOffsetAndPosition pos = new PlaceOffsetAndPosition();

		String line;
		BufferedReader reader = new BufferedReader(new StringReader(
				plainContent));

		try {
			while ((line = reader.readLine()) != null) {
				if (line.length() > 0) {
					for (int i = 0; i < FIELD_NAMES.length; i++) {
						strFind = FIELD_NAMES[i];
						int indexEOL = line.indexOf(EOL);
						if (line.contains(strFind)) {
							index = line.indexOf(strFind) + strFind.length();
							strFinalContent = line.substring(index, indexEOL)
									.trim();
							try {

								Method method = pos.getClass().getMethod(
										METHODS[i], Integer.class);
								method.invoke(pos, Integer
										.parseInt(strFinalContent));

							} catch (NumberFormatException e) {
								e.printStackTrace();
							} catch (IllegalArgumentException e) {
								e.printStackTrace();
							} catch (IllegalAccessException e) {
								e.printStackTrace();
							} catch (InvocationTargetException e) {
								e.printStackTrace();
							} catch (NoSuchMethodException e) {
								e.printStackTrace();
							}

						}
					}
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(pos);

		return pos;
	}

	/**
	 * Fetch the entire contents of a text file, and return it in a String. This
	 * style of implementation does not throw Exceptions to the caller.
	 * 
	 * @param aFile
	 *            is a file which already exists and can be read.
	 */
	private static String getContents(File aFile) {
		// ...checks on aFile are elided
		StringBuffer contents = new StringBuffer();

		// declared here only to make visible to finally clause
		BufferedReader input = null;
		try {
			// use buffering, reading one line at a time
			// FileReader always assumes default encoding is OK!
			input = new BufferedReader(new FileReader(aFile));
			String line = null; // not declared within while loop
			/*
			 * readLine is a bit quirky : it returns the content of a line MINUS
			 * the newline. it returns null only for the END of the stream. it
			 * returns an empty String if two newlines appear in a row.
			 */
			while ((line = input.readLine()) != null) {
				contents.append(line);
				contents.append(System.getProperty("line.separator"));
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (input != null) {
					// flush and close both "input" and its underlying
					// FileReader
					input.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return contents.toString();
	}

	private enum ContentField {
		DeadlineCheckingBlock, EndStateBlock, ForkBlock, InitialStateBlock, JoinBlock, PeriodicTaskArrivalBlock, PreemptiveTaskStructureBlock, ResourceBlock, SendingMessageBlock, DispatcherOverheadBlock
	}

}
