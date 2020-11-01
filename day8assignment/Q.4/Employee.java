package com.second;
import java.util.Scanner;
public class Employee {

    int Id;
    String Name;
    int Age;
    long Salary;


    public void getDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Employee Id : ");
        Id = Integer.parseInt(sc.nextLine());

        System.out.print("\nEnter Employee Name : ");
        Name = sc.nextLine();

        System.out.print("\nEnter Employee Age : ");
        Age = Integer.parseInt(sc.nextLine());

        System.out.print("\nEnter Employee Salary : ");
        Salary = Integer.parseInt(sc.nextLine());
    }
    public void displayDetails()
    {
        System.out.print("\n" + Id + "\t" +Name + "\t" +Age + "\t" +Salary);
    }

}
