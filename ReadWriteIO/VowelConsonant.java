package questions.exam.java;
import java.util.Scanner;
import java.io.FileWriter;

import java.io.*;
public class VowelConsonant {
	
public static void main( String[] args) {

	Scanner take = new Scanner(System.in);
	String vowel = "" ;
	String consonant = "";
	System.out.println("Enter any String");
	String text = take.nextLine();
	text = text.toLowerCase();
//    text= text.replaceAll("aeiou","");
	for(int i=0; i< text.length() ; i++) {
		char chr = text.charAt(i); //builtin method -- useful for this kind of operation
		if( chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr =='u') {
		vowel += chr; // vowel = vowel+char	
		}
		else if (chr >='a' && chr<='z' ) {
			consonant = consonant + chr; // consonant += chr
		}
	}
	
	try {
		FileWriter vow = new FileWriter("Vowel.txt");
		FileWriter 	cons = new FileWriter("Consonant.txt");		
		vow.write(vowel);
		cons.write(consonant);
		vow.close();
		cons.close();
	}
	
	catch(IOException e) {
		System.out.print("Throwing IO Exception");
		}
	
	System.out.print("Vowels = " + vowel);
	System.out.print("\n ");
	
	System.out.print("Consonants = " + consonant);

	}	
}
