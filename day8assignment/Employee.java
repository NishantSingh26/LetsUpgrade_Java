package com.second;
import java.util.Scanner;
public class Employee {

    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    double salary;
    String designation;

    public void getDetails()
    {
        System.out.println("Enter the Name Age Salary and Designation of Employee");
        name=sc.next();
        age=sc.nextInt();
        salary=sc.nextDouble();
        designation=sc.next();
    }
    public void displayDetails()
    {
        System.out.println(name+ "");
        System.out.println(age+  "" );
        System.out.println(salary+ "" );
        System.out.println(designation+ "");
    }
}
