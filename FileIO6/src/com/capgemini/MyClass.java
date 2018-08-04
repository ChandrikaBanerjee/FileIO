/*Creating an arraylist of objects stored in a file*/
package com.capgemini;

import java.io.Serializable;

public class MyClass implements Serializable {
	private String name;
	private int roll;
	private String favSub;

	public MyClass(String name, int roll, String favSub) {
		super();
		this.name = name;
		this.roll = roll;
		this.favSub = favSub;
	}

	/**
	 * @return the name
	 */
	// Getters
	public String getName() {
		return name;
	}

	/**
	 * @return the roll
	 */
	public int getRoll() {
		return roll;
	}

	/**
	 * @return the favSub
	 */
	public String getFavSub() {
		return favSub;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyClass [name=" + name + ", roll=" + roll + ", favSub=" + favSub + "]";
	}

}