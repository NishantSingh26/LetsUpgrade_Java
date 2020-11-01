package com.second;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList();
		names.add("Nishant");
		names.add("Vishal");
		names.add("Divya");

		for(String name :names)
		{
			System.out.println(name);
		}
	}
}
