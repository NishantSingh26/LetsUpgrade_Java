package com.second;

public class Main {

    public static void main(String[] args) {
	engineer e=new engineer();
	e.getDetails();
	e.displayDetails();
	e.electrical();
	e.nanosystem();
	e.leave();

	doctor d=new doctor();
	d.getDetails();
	d.displayDetails();
	d.diagnose();
	d.injury();
	d.leave();

	pilot p=new pilot();
	p.getDetails();
	p.displayDetails();
	p.workplace();
	p.leave();
    }
}
