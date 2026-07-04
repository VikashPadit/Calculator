package com.info.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		//creating a input objects
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first numbers:-");
		int a=sc.nextInt();
		System.out.println("Enter the second numbers:-");
		int b=sc.nextInt();
		//creating a objects
		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		Division divide = new Division();
		Multiplication multiply = new Multiplication();
		// call the methods
	     int addResult=add.Add(a,b);
		 int subResult=sub.sub(a,b);
		 int multiResult=multiply.multiply(a,b);
		 int DivisionResult=divide.divide(a,b);
		 System.out.println("Addition :"+addResult);
		System.out.println("Subtraction :"+subResult);
		System.out.println("Multiplication :"+multiResult);
		System.out.println("Division :"+DivisionResult);


	}

}
