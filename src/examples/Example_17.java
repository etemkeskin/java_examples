package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

/**
 * Read the Transaction CSV data
 *
 */
public class Example_17 {

	public static void main(String[] args) {

		readCsvFile();
	}

	public static void readCsvFile() {
		String CSV_FILE_PATH = System.getProperty("user.dir") + File.separator + "src" + File.separator + "examples"
				+ File.separator + "transaction.csv";
		System.out.println(CSV_FILE_PATH);
		Path p1 = Path.of(CSV_FILE_PATH);

		try {
			if (Files.exists(p1)) {
				int initialCapacity = (int) Files.lines(p1).count();
				System.out.println("Iitial csv line number: " + initialCapacity);
				BufferedReader reader = Files.newBufferedReader(p1);
				String line;
				while ((line = reader.readLine()) != null) {
					String[] values = line.split(",");
					System.out.println(Arrays.asList(values));
				}
			} else {
				System.out.println("File is not exist");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
