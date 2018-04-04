package com.revature.Homework.ProblemFourty;

import java.math.BigInteger;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 System.out.println("Iterative");
		 BigInteger prev=new BigInteger("1"),prevPrev=new BigInteger("1");
		 for(int i=0;i<98;i++) {
			 BigInteger currentFib=prev.add(prevPrev);
			 prevPrev=prev;
			 prev=currentFib;
			 System.out.println(currentFib);
		 }
		 System.out.println("Recursivve");
		 for(int i=0;i<=100;i++)
			 System.out.println(fibonacciRercursive(new BigInteger(i+"")));
	 }
	 public static BigInteger fibonacciRercursive(BigInteger number) {
		BigInteger result = null;
		if(number.longValue()<1)
			return new BigInteger("1");
		BigInteger tempOne=new BigInteger(number.subtract(one)+"");
		BigInteger tempTwo=new BigInteger(number.subtract(two)+"");
		BigInteger fib = fibonacciRercursive(tempOne).add(fibonacciRercursive(tempTwo));
		return fib; 
	 }
	static final BigInteger one = new BigInteger("1");
	static final BigInteger two = new BigInteger("2");
		
}
