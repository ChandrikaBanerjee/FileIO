package com.capgemini;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCountNumberOfWords {

	public static void main(String[] args) throws IOException {
	
		System.out.println("Enter file path");

		Scanner sc = new Scanner(System.in);
		File file = new File(sc.nextLine());
	
		Scanner scread = new Scanner(new FileInputStream(file));
		int wordCount = 0;
		while (scread.hasNext()) {
			scread.next();
			wordCount++;
		}
		System.out.println("No. of words in file are: " + wordCount);
	}

}
