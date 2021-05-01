/*
 *Gurpreet Singh
 *2021-01-04
 * This class runs a MULTIPLAYER word guess game
*/
import java.io.*;
import java.util.Scanner;
public class Phase3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//OBJECTS 
		Scanner input = new Scanner (System.in);						//Creates a Scanner object
		WordGuess wg = new WordGuess ();								//Creates a WordGuess object
		
		//TITLE
		wg.AsciiArtReader();											//Outputs the title
		
		//VARIABLES
		String secretWord;												//Stores the secret word to be guessed
		int option = 0;													//Stores user options												
		
		//OPTIONS
		do {															//Do loop that runs until user enters a valid option															
			System.out.println("Options");								//Outputs Options
			System.out.println("1 - Single player Mode");				//Option to play single player mode
			System.out.println("2 - Multiplayer Mode");					//Option to play double player mode
			option = input.nextInt();									//Stores user option
			if (option!=1 && option!=2) {								//Runs if user enters an invalid option
				System.out.println("Invalid option, try again!");		//Outputs an error
			}
		}
		while (option!=1 && option!=2);									//Checks weather user input is valid or not
		
		//GAME SEQUENCE
		if (option==1) {												//Runs if user picks option 1 to play single player mode
			while (wg.Win()==true) {									//While loop that runs until win = true in the WordGuess class
				secretWord = wg.RandomWord();			   				//Stores a secret word generated in the method RandomWord()
				wg.Singleplayer(secretWord);			   				//Runs the single player game operation in the WordGuess class
				wg.Option1();											//Once the game is over the options are prompted to the user
			}
		}
		else if (option==2) {											//Runs if user picks option 1 to play multiplayer mode
			//VARIABLES
			String player1;												//Stores player 1 name
			String player2;												//Stores player 2 name
			//USER INPUT				
			System.out.println("Enter player 1 name:");					//Prompts player 1 name
			player1 = input.next();										//Inputs player 1 name
			System.out.println("Enter player 2 name:");					//Prompts player 2 name
			player2 = input.next();										//Inputs player 2 name
			//GAME SEQUENCE
			while (wg.Win()==true) {									//While loop that runs until win = true in the WordGuess class
				secretWord = wg.RandomWord();							//Stores a secret word generated in the method RandomWord()
				wg.Multiplayer(secretWord, player1, player2);			//Runs the multiplayer game operation in the WordGuess class
				wg.Option2();											//Once the game is over the options are prompted to both players
			}
			
		}
	}

}
