package com.second;

public class Main {

    public static void main(String[] args) {
	permanent p=new permanent();
	p.getDetails();
	p.displayDetails();
	p.standard_day();

	casual c=new casual();
	c.getDetails();
	c.displayDetails();
	c.no_regular_hrs();
	c.terminate();
    }
}
