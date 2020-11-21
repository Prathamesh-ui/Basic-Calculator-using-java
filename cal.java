package Biginner;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args)
	{
		double x, y;
		double answer;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		x= scan.nextDouble();
		y= scan.nextDouble();
		answer = x+y;
		System.out.println("Addition is " + answer);
		answer = x-y;
		System.out.println("Substraction is " + answer);
		answer = x*y;
		System.out.println("Multiplication " + answer);
		answer = x/y;
		System.out.println("Division is " + answer);
		answer = x%y;
		System.out.println("Modul is " + answer);
		
		
	}
	
}
	



