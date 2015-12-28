package br.ufam.ezrealtime.cde.ui.wizards;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Manifest;

public class Test {

	private void generateJarManifestFile() {
		try {

			// Generating a string version of a manifest
			StringBuffer sbuf = new StringBuffer();
			sbuf.append("Manifest-Version: 1.0 \n");
			sbuf.append("EmbeddedBundle-SymbolicName: \n");
			sbuf.append("EmbeddedBundle-Name: \n");
			sbuf.append("EmbeddedBundle-Version: \n");
			sbuf.append("EmbeddedBundle-Vendor: \n");
			sbuf.append("EmbeddedBundle-Date: \n");
			sbuf.append("EmbeddedBundle-Activator: \n");

			// string is converted to an input stream
			InputStream is = new ByteArrayInputStream(sbuf.toString().getBytes(
					"UTF-8"));

			// Generating the manifest for the input stream
			Manifest manifest = new Manifest(is);

			FileOutputStream fos = new FileOutputStream(new File("MANIFEST.MF"));
			manifest.write(fos);

		} catch (IOException e) {
		}

	}

	public static void main(String[] args) {
		Test test = new Test();
		test.generateJarManifestFile();
	}
}
