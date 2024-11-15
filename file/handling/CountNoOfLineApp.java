package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CountNoOfLineApp {

	public static void main(String[] args) throws Exception {
		String path = "src//com//file//handling//test1.txt";

		File file = new File(path);

		FileReader fr = new FileReader(file);
		int count = 1;
		int c;
		while ((c = fr.read()) != -1) {
			if ((char) c == '\n') {
				count++;
			}

		}

		System.out.println("No of Lines are : " + count);
		fr.close();
	}
}
