package com.second;

public class Main {

	public static void main(String[] args) {
		Employee[] Emp = new Employee[3];
		int i;

		for(i=0;i<3;i++)
			Emp[i] =  new Employee();   // Allocating memory to each object

		for(i=0;i<3;i++)
		{
			System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
			Emp[i].getDetails();
		}

		System.out.print("\nDetails of Employees\n");
		for(i=0;i<3;i++)
			Emp[i].displayDetails();
	}
}
