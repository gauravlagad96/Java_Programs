package com.file.handling;

import java.io.*;
import java.util.Scanner;

public class FileWriterApp {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		String path = "src//com//file//handling//write.txt";

		File file = new File(path);

		FileWriter fw = new FileWriter(file, true);// if true, then bytes will be written to the end of the file rather
													// than the beginning
		BufferedWriter bw = new BufferedWriter(fw);

//		write data in file
		System.out.println("Enter data to wirte in file ! ");
		String data = sc.nextLine();
		bw.write(data);

		bw.close();
		fw.close();
		System.out.println("file created and Write successfully ! ");

	}

}
