/*Program to check whether a file exists or not*/
package com.capgemini;

import java.io.File;
import java.util.Scanner;

class FileTestExist {
	public static void main(String args[]) {
		System.out.println("Enter the path: ");

		Scanner sc = new Scanner(System.in);

		File file = new File(sc.nextLine()); // Creating new file

		boolean exist = file.exists(); // Returns true or false

		System.out.println("The file exists : " + exist);
	}
}
