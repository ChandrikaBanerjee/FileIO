package com.capgemini;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class TestMyClass {

	public static void main(String[] args) {
		List<MyClass> list = new ArrayList<MyClass>();
		try (FileInputStream fis = new FileInputStream("ArrayList.ser");
				ObjectInputStream os = new ObjectInputStream(fis)) {
			list = (ArrayList) os.readObject();
			System.out.println(list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
