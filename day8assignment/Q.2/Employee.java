package com.second;
import java.util.Scanner;
public class Employee {

    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    String designation;

    public void getDetails()
    {
        System.out.println("Enter the Name Age and Designation of Person");
        name=sc.next();
        age=sc.nextInt();
        designation=sc.next();
    }
    public void displayDetails()
    {
        System.out.println(name+ "");
        System.out.println(age+  "" );
        System.out.println(designation+ "");
    }
    public void leave(){
        System.out.println("You have leave of 2 Days");
    }
}
