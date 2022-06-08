package com.fdmgroupStrings;

public class Wrappers {
	public static void main(String[] args) {
		
		//Convert string to int
		String number1 = "5";
		String number2 = "3";
		
		int int1 = Integer.parseInt(number1);
		int int2 = Integer.parseInt(number2);
		
		System.out.println(int1 + int2);
		
		//Convert Strings to doubles
		String number3 = "5.3";
		String number4 = "3.2";
		
		double double1 = Double.parseDouble(number3);
		double double2 = Double.parseDouble(number4);
		
		System.out.println(double1 + double2);
		
		//Extracting numbers from Strings
		String string1 = "abc11";
		String string2 = "9xyz";
		String string3 = "abc7xyz";
		
		String string1Digits = string1.substring(3);
		String string2Digits = string2.substring(0, 1);
		String string3Digits = string3.substring(3, 4);
		
		int num1 = Integer.parseInt(string1Digits);
		int num2 = Integer.parseInt(string2Digits);
		int num3 = Integer.parseInt(string3Digits);
						
		System.out.println(num1+num2+num3);

		
		
	}

}
