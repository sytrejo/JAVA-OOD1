package com.fdmgroupStrings;

public class chars {
	
	public static void main(String[] args) {
		
		char letter = 'a';
		int code = 98;
		
		//Display the value of the letter variable cast to an int
		System.out.println((int) letter);
		
		//Display the value of the code variable cast to a char
		System.out.println((char) code);
		
		//Display the value of the number 36 cast to a char
		System.out.println((char) 36);
		
		//Display the value of 'c' minus 'a'
		System.out.println('c' - 'a');
		
		//Display the value of 'z' minus 'a'
		System.out.println('z' - 'a');
		
		char char1 = 'x';
		char char2 = 'y';
		char char3 = 'z';
		
		String string1 = "z";
		String string2 = "y";
		
		System.out.println(char1+char2+char3);
		
		System.out.println(char1+char2+string1);
		
		System.out.println(char1+string2+char3);
		
	
	}

}
