package owr.d3.generator.pulley.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtil {

	private static final int BSIZE = 1024;

	public static String writeToFile(StringBuilder sb, String fileName) {

		File f = new File(fileName);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

			int lenght = sb.length();

			char[] buff = new char[BSIZE];
			int posEnd;

			for (int posStart = 0; posStart < lenght; posStart += BSIZE) {

				posEnd = Math.min(posStart + BSIZE, lenght);
				sb.getChars(posStart, posEnd, buff, 0);
				bw.write(buff, 0, posEnd - posStart);

			}

			bw.flush();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return f.getAbsolutePath();

	}
}
