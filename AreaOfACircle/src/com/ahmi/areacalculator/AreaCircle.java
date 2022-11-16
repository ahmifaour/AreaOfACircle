package com.ahmi.areacalculator;

public class AreaCircle {

	static double radius=9;
	static double pi=3.14;
	static double area1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	calcAreaOfCircle(radius,pi);
	displayArea1(area1);
	}
	private static void displayArea1(double area1) {
		// TODO Auto-generated method stub
		
	}
	private static void calcAreaOfCircle(double radius, double pi) {
		// TODO Auto-generated method stub
		area1 = pi * (radius*radius);
		
			System.out.println(area1);
		}
	
}
