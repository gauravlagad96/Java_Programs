package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreateApp {

	public static void main(String[] args) throws IOException {

		String path = "src//com//file//handling//test1.txt";

		File file = new File(path);

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);

//		write data in file
		bw.write("hello");

		bw.close();
		fw.close();
		System.out.println("file created and Write successfully ! ");

	}

}
