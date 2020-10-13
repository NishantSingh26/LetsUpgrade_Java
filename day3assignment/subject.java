package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int CN;
        int DBMS;
        int DS;
        int Maths;
        int Python;
        float total,percentage;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of the subject ");
        System.out.println("Enter Marks for Computer Network:");
        CN=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Marks for Data Base:");
        DBMS=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Marks for Data Structure:");
        DS=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Marks for Maths:");
        Maths=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Marks for Python:");
        Python=sc.nextInt();

        total=CN+DBMS+DS+Maths+Python;
        percentage=(total/500)*100;
        System.out.println("Percentage="+percentage);

        if(percentage<100 && percentage>=80)
        {
            System.out.println("You have A Grade");
        }
        if(percentage<80 && percentage>=65)
        {
            System.out.println("You have B Grade");
        }
        if(percentage<65 && percentage>=55)
        {
            System.out.println("You have C Grade");
        }
        if(percentage<55 && percentage>=35)
        {
            System.out.println("You have D Grade");
        }
        if(percentage<35 && percentage>=0)
        {
            System.out.println("You Are fail");
        }
    }
}
