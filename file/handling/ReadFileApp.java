package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileApp {
	public static void main(String[] args) throws IOException {

		File file = new File("src/com/file/handling/test1.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		int c;
		while ((c = br.read()) != -1) {
			System.out.print((char) c);
		}

//		char ch=(char) fr.read();     //this fun return the single char of the file.
//		System.out.println(ch);

		br.close();
		fr.close();
		System.out.println("\nDone ! ");

	}

}
