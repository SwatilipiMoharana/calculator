package com.nt.projects;

import java.util.Scanner;

class Arithmetic {
public double add(double a,double b) {
	return a+b;
}

public double substract(double a, double b) {
	return a-b;
}

public double multiply(double a, double b) {
	return a*b;
	}
public double divide(double a,double b) {
	if(b==0) {
		System.out.println("error:division by zero is not allowed");
		return Double.NaN;
	}
	return a/b;
}

}

public class Calculator{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Arithmetic ac=new Arithmetic();
		
		System.out.println("Enter first number :-");
		double num1=sc.nextDouble();
		
		System.out.println("Enter secound number:-");
		double num2=sc.nextDouble();
		
		System.out.println("Choose operation(+,-,*,/): ");
		char operation =sc.next().charAt(0);
		
		
		double result;
		
		switch(operation) {
		case '+':
			result=ac.add(num1, num2);
			break;
		case '-':
			result=ac.substract(num1, num2);
			break;
			
		case '*':
			result=ac.multiply(num1, num2);
			break;
		case '/':
			result=ac.divide(num1, num2);
			break;
			
			default:
				System.out.println("Invalid operation.");
				sc.close();
				return;
		}
		
		System.out.println("result:"+result);
		sc.close();
	}
}
