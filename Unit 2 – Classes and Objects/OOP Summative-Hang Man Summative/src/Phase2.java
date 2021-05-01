/*
 *Gurpreet Singh
 *2021-01-04
 * This class runs a SINGLE PLAYER word guess game
*/

import java.util.*;
import java.io.*;
import java.awt.List;
public class Phase2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//OBJECTS
		Scanner input = new Scanner (System.in);				//Creates a new scanner
		WordGuess wg = new WordGuess ();						//Creates a new object of the class WordGuess
		
		//TITLE
		wg.AsciiArtReader();									//Outputs the title
	
		//VARIABLES
		String secretWord;										//Stores the secret word to be guessed
		int option;												//Stores user options
		int userOption;											//Determines if used decides to play again or stop playing after one round
		
		//OPTIONS
		do {													//Do loop that runs until user enters a valid option
			System.out.println("\tOptions:");					//Outputs options
			System.out.println ("\t1 - Play");					//Option to start the game and play
			System.out.println ("\t2 - Instruction");			//Option to read the instructions
			option = input.nextInt(); 							//Stores user option 
			if (option!=1 && option!=2) {						//Runs if user enters an invalid option
				System.out.println("Invalid option, try again!");//Outputs an error
			}
		}
		while (option!=1 && option!=2);							//Checks weather user input is valid or not
		 
		//GAME SEQUENCE
		if (option==1) {										//Runs if user picks option 1 to play the game
			while (wg.Win()==true) {							//While loop that runs until win = true in the WordGuess class
				secretWord = wg.RandomWord();			   		//Stores a secret word generated in the method RandomWord()
				wg.Singleplayer(secretWord);			   		//Runs the single player game operation in the WordGuess class
				wg.Option1();									//Once the game is over the options are prompted to the user 
			}
		}
		else if (option==2) {							  		//Runs if user picks option 2 to read the instructions
			wg.Instructions();									//Outputs instructions from the WordGuess class
		}
	}
}

