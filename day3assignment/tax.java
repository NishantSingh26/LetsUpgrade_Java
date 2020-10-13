package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            String name;
            String date_birth;
            String month_birth;
            int year_birth;
            int monthly_sal;
            int age;
            int annual_sal;
            double tax=0;
            double final_amount;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter the details of Employee ");
            System.out.println("Enter the name of Employee:  ");
            name=sc.nextLine();
            System.out.println("Enter the Birth Date: ");
            date_birth=sc.nextLine();
            System.out.println("Enter the Month of Date: ");
            month_birth=sc.nextLine();
            System.out.println("Enter the Year of DOB: ");
            year_birth=sc.nextInt();
            System.out.println("Enter the Monthly Salary of employee: ");
            monthly_sal= sc.nextInt();
            age=2020-year_birth;
            annual_sal=monthly_sal*12;
            if(annual_sal<200000)
                tax=0;
            else if(annual_sal>=200000 && annual_sal<300000)
                tax=0.05*(annual_sal);
            else if(annual_sal>=300000 && annual_sal<400000)
                tax=0.1*(annual_sal);
            else if(annual_sal>=400000 && annual_sal<500000)
                tax=0.15*(annual_sal);
            else
                tax=0.2*(annual_sal);
            final_amount=annual_sal-tax;
        System.out.println("The name of the employee is: "+name);
        System.out.println("The age of the employee is: "+age);
        System.out.println("The annual salary of the employee before tax: "+annual_sal);
        System.out.println("Tax amount: "+tax);
        System.out.println("The annual salary of the employee after tax:  "+final_amount);
    }
}
