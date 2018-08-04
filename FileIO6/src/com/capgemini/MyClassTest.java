package com.capgemini;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MyClassTest {

	public static void main(String[] args) {
		// Creating objects
		MyClass m1 = new MyClass("Moulima", 9, "Maths");
		MyClass m2 = new MyClass("Urmika", 29, "Geography");
		MyClass m3 = new MyClass("Ishika", 11, "Biology");
		MyClass m4 = new MyClass("Sahana", 50, "Maths");
		MyClass m5 = new MyClass("Chandrika", 39, "Maths");

		List<MyClass> list = new ArrayList<MyClass>();
		// Adding the objects in the arraylist
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
//writes the list in the file named arraylist.ser
		try (FileOutputStream fos = new FileOutputStream("ArrayList.ser");
				ObjectOutputStream os = new ObjectOutputStream(fos)) {
			os.writeObject(list);
			System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

}
