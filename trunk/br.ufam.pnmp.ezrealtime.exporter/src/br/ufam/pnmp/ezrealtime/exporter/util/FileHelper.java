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
 * $Id: FileHelper.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.exporter.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.jface.viewers.StructuredSelection;

public final class FileHelper {

	public static String getPnmlFileSelected(StructuredSelection selection) {
		org.eclipse.core.internal.resources.File file = (org.eclipse.core.internal.resources.File) selection
				.getFirstElement();

		String pathToFile = file.getLocation().toFile().getAbsolutePath();

		String fileExt = file.getLocation().getFileExtension();

		int index = pathToFile.lastIndexOf(fileExt);

		final String PNML_FILE_NAME = pathToFile.substring(0, index) + "pnml";

		System.out.println("pathToFile: " + pathToFile);

		return PNML_FILE_NAME;
	}

	public static void extract(File zipFile, File destDir) throws Exception {
		ZipInputStream zipinputstream = new ZipInputStream(new FileInputStream(
				zipFile));
		ZipEntry zipentry = zipinputstream.getNextEntry();
		int BUFFER_SIZE = 4096;

		while (zipentry != null) {
			// for each entry to be extracted
			String entryName = zipentry.getName();
			System.out.println("Extracting: " + zipentry.getName());
			File newFile = new File(destDir, entryName);
			if (zipentry.isDirectory()) {
				newFile.mkdirs();
			} else {
				ByteBuffer buffer = ByteBuffer.allocate(BUFFER_SIZE);
				byte[] bufferArray = buffer.array(); // get the backing byte
				// array
				FileChannel destinationChannel = new FileOutputStream(newFile)
						.getChannel();
				while (true) {
					buffer.clear(); // Prepare buffer for use, sets position to
					// 0 and limit at capacity
					int lim = zipinputstream.read(bufferArray);
					if (lim == -1)
						break; // No more bytes to transfer
					buffer.flip(); // prepare for write, set position to 0
					buffer.limit(lim); // set the limit to what was read in
					// from the stream
					destinationChannel.write(buffer);
				}
				destinationChannel.close();
				zipinputstream.closeEntry();
			}
			zipentry = zipinputstream.getNextEntry();
		}
		zipinputstream.close();
	}

	/**
	 * Opens a resource of any type in the local package directory as
	 * <B>InputStream</B>.
	 * 
	 * @param filename
	 *            name of the resource file, relative of this class.
	 * @return a stream or null on failure.
	 */
	public static InputStream getLocalResource(String filename) {
		return (FileHelper.class.getResourceAsStream(filename));
	}
}
