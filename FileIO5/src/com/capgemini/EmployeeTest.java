package com.capgemini;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee(100, "Jim", 10000.00);
		try (FileOutputStream fos = new FileOutputStream("Employee.txt"); // Writes into the file and sends
				ObjectOutputStream os = new ObjectOutputStream(fos)) {
			os.writeObject(employee); //Writes
			System.out.println("Done Successfully..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
