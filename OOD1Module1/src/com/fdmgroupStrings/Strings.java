package com.fdmgroupStrings;

public class Strings {
	
	public static void main(String[] args) {
		
		// This will print out the message but it will not store the message in memory.
		System.out.println("this is a message");
		
		//Storing my first name in a String Variable 
		String firstName = "Silvia";
		
		//Storing my last name in a String Variable
		String lastName = "Trejo";
		
		//Concat my first and last name to create my full name
		String fullName = firstName + " " + lastName;
		
		//printing out my fullName
		System.out.println(fullName);
		
		//creating a random person's name to add to a message
		String name = "Tony";
		
		//Printing a message with the person's name
		System.out.println("Hello" + name + " would you like to learn Java?");
		
		//Using name operations
//		String name = "Silvia";
		
		//print out the length of my name
		System.out.println(name.length());
		
		// print out my name in upper case letters
		System.out.println(name.toUpperCase());
		
		
		//print out the first character of my name
		System.out.println(name.charAt(0));
		
		//print out the last letter of my name
		//Remember that index starts at zero
		System.out.println(name.charAt(3));
		
		//Creating a string with a sentence
		String sentence = "this is a sentence";
		
		//Display the position of the first Space or index 4
		System.out.println(sentence.indexOf(' '));
		
		//Display the position of the LAST Space or index 9
		System.out.println(sentence.lastIndexOf(' '));
		
		//Display the position of the first Letter x
		System.out.println(sentence.indexOf('x'));
		
		//Display the first 4 characters of the String
		System.out.println(sentence.substring(0,4));
		
		//Display the characters of the String from position 10 onwards
		System.out.println(sentence.substring(10));
		
		//Display the characters in positions 5,6,7,8
		System.out.println(sentence.substring(5,9));
		
		//Check to see if the sentence contains the letter a...Display true or false
		System.out.println(sentence.contains("a"));
		
		//Check to see if the sentence contains the letter x...Display true or false
		System.out.println(sentence.contains("x"));
		
		//add the text "is" to the start and "?" to the end of string sentence
		sentence = "is " + sentence + "?";
		System.out.println(sentence);
		
		//Replace the first letter "t" with the letter "T"	
		sentence = sentence.replaceFirst("t", "T");
		System.out.println(sentence);
	
		
	}
}

