package com.capgemini;

import java.io.*;
import java.util.Scanner;

public class FileIOGrep {
	public static void main(String args[]) throws IOException {
		System.out.println("Enter the path of the File: ");
		// Taking input
		Scanner sc = new Scanner(System.in);

		String line;
		int lineCount = 0;

		FileInputStream fileInputStream;
		InputStreamReader inputStreamReader;
		BufferedReader bufferedReader = null;

		try {
			fileInputStream = new FileInputStream(sc.nextLine());
			inputStreamReader = new InputStreamReader(fileInputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
		} catch (Exception e) {
			e.printStackTrace();
		}

		while ((line = bufferedReader.readLine()) != null) {
			lineCount++; // Lines gets read one by one

			if (line.contains("Hello")) {
				System.out.println(line); // Prints the line where it gets"Hello":
				System.out.println(lineCount);

			} else
				System.out.println("The String was not found");
		}

	}
}
