/*Program to count number of lines in a text file*/
package com.capgemini;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class FileNumberOfLinesCount {

	public static void main(String args[]) throws IOException {
		int lines = 0; // Initializing
		System.out.println("Enter the path: ");

		Scanner sc = new Scanner(System.in);
		File file = new File(sc.nextLine());
		if (file.exists()) {
			FileReader fileread = new FileReader(file); // Creating new filereader

			LineNumberReader ln = new LineNumberReader(fileread);

			while (ln.readLine() != null) {
				lines++; // Logic for reading the file
			}
			fileread.close();// Closing the filereader
		}
		System.out.println("The number of lines is: " + lines);
	}
}
