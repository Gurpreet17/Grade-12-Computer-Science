/*
 *Gurpreet Singh
 *2021-01-04
 * This class runs a word guess game upon the secret word "BRAIN"
*/

import java.util.Scanner;
import java.util.Arrays;
public class Phase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); 							   //Declares a scanner for input
		StringBuffer sb = new StringBuffer();								   //Declares a String buffer
		System.out.println ("\t" + "♦ WordGuess game ♦"); 					   //Outputs title 
		
		//VARIABLES
		String secretWord = "BRAIN"; 										   //Secret word the user has to guess
		char guess;															   //Stores user guess
		boolean win = false;												   //Determines if user won
		int guessAmount = 0;												   //Keeps track of guesses that user takes to guess the secret word
		String progress = "";												   //Keeps track of the progress that the user made to guess the word
		String dashes [] = new String [secretWord.length()];				   //Stores dashes for word length until correct letter is guessed	
		
		for (int x=0; x<secretWord.length(); x++) {							   //For loop that sets up dashes to (-)
			dashes[x] = "-";
			System.out.print(dashes[x]);									   //Outputs dashes when game begins
		}
		System.out.println();
		
		while (win==false) {												   //While loop that runs until user guesses the secret word
			System.out.println("Enter a letter (! to guess entire word):");	   //Prompts user to enter their guess
			guess = Character.toUpperCase(input.next().charAt(0));		   	   //Converts the letter from lower case to upper case
			guessAmount++;													   //Increments guessAmount by 1 each time user takes a guess
			if (guess =='!') {												   //Runs only when user enters "!"
				System.out.println("What is your guess?");					   //Prompts user to guess the entire word
				String wordGuess = input.next();							   //Stores users entire word guess
				wordGuess = wordGuess.toUpperCase();						   //Converts the word guess into capital letters 
				if (wordGuess.equals(secretWord)) {							   //Runs when user guesses the entire word right
					System.out.println("You won!");							   //Outputs the user that it won
					System.out.println("The secret word is " + secretWord);	   //Outputs the secret word
					System.out.println("You made " + guessAmount + " guesses");//Outputs the number of guesses user took
					win=true;												   //Stops code 
				}
				else {														   //Runs when user guesses the entire word wrong.
					System.out.println("You lost!");						   //Outputs the user that it lost
					System.out.println("The secret word is " + secretWord);	   //Outputs the secret word
					System.out.println("You made " + guessAmount + " guesses");//Outputs the number of guesses user took
					win=true;												   //Stops code 
				}
			}
			else {																//Runs when user does not enter "!"
				for (int x=0; x<secretWord.length(); x++) {						//Checks if user guess matches to any letter in secret word
					if (secretWord.charAt(x) == guess) {						//Runs if user guess matches to any letter in secret word
						dashes[x] = Character.toString(guess);					//Adds guess at the index where the letter belongs in secret word 
					}
				}
				for (int x=0; x<secretWord.length(); x++) {						//Inserts the string representation of the char array
					 sb.insert(x,dashes[x]);
				}
				progress = sb.substring(0,secretWord.length());					//Stores the string representation of the char array
				System.out.println(progress);									//Outputs the progress that user has made so far.
				
				if (progress.equals(secretWord)) {							    //Checks if user guessed the entire word
					System.out.println("You won!");								//Outputs the user that it won
					System.out.println("The secret word is " + secretWord);     //Outputs the secret word
					System.out.println("You made " + guessAmount + " guesses"); //Outputs the number of guesses user took
					win=true;													//Stops code
				}
				else {															//If user has not guessed the entire word
					win=false;													//Continues code
				}
			}
		}
		
		

	}	
	

}


