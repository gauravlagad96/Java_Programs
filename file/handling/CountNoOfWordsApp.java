package com.file.handling;

import java.io.*;

public class CountNoOfWordsApp {
	public static void main(String[] args) throws Exception {
		String path = "src//com//file//handling//test1.txt";

		File file = new File(path);

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);// can't use directly need to add FileReader
		int count =0;
		int c;

		while ((c = br.read()) != -1) {
			if ((char) c == '\n' || (char) c == ' ' ) {
				count++;
			}
		}

		System.out.println("No of words are : " + count);
		br.close();
		fr.close();

	}

}
