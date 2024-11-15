package com.file.handling;

import java.io.*;

public class CountWordsApp {
	public static void main(String[] args) throws Exception {
		String path = "src//com//file//handling//test1.txt";
		File file = new File(path);

		// Check if the file exists before proceeding
		if (!file.exists()) {
			System.out.println("File not found: " + path);
			return;
		}

		BufferedReader br = new BufferedReader(new FileReader(file)); // Use BufferedReader for efficient reading
		int count = 0;
		String line;

		// Read the file line by line
		while ((line = br.readLine()) != null) {
			// Split the line into words based on whitespace (using regex)
			String[] words = line.trim().split("\\s+");

			// Add to count if the line is not empty
			if (words.length > 0) {
				count += words.length;
			}
		}

		// Output the word count
		System.out.println("Number of words: " + count);

		br.close();
	}
}
