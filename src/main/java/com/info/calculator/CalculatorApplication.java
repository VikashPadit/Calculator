package com.info.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
x
	public static void main(String[] args)
	{
		SpringApplication.run(CalculatorApplication.class, args);
		Add twosum=new Add();
		System.out.println("Result of sum: "+twosum.addTwoNumber(2,3));

	}

}
