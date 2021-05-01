/*
 *Gurpreet Singh
 *2021-01-04
 * This class runs a COMPUTER VS PLAYER word guess game
*/
import java.io.IOException;
import java.util.*;

public class Phase4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//OBJECTS 
		Scanner input = new Scanner (System.in);									//Creates a scanner for user input
		WordGuess wg = new WordGuess ();											//Creates an object for WordGuess class
		Game game = new Game ();													//Creates an object for Game class
		
		//TITLE
		wg.AsciiArtReader();														//Displays title
		
		//VARIABLES
		String secretWord;															//Stores the secret word to be guessed
		String player;																//Stores players name
		System.out.println("Enter player name:");									//Prompts player name
		player = input.next();														//Inputs player name 
		game.Player(player);														//Mutates player name in the game class
		//GAME SEQUENCE
		while (game.Win()==true) {													//While loop that runs until win = true in the Game class
			secretWord = wg.RandomWord();											//Stores a secret word generated in the method RandomWord()
			game.Computer(secretWord);												//Runs the computer  game operation in the Game class
			game.Option();															////Once the game is over the options are prompted to user
		}
		
	}

}


class Game {
	//VARIABLES
	static Scanner input = new Scanner (System.in); 									//Declares a scanner for input
	static StringBuffer sb = new StringBuffer();										//Declares a string buffer
	private static boolean win = true;													//Keeps track of the winner
	private static String player1 = "";													//Stores player 1 name
	public static String player2 = "Computer";											//Stores player 2 name
	public static String progress;														//Keeps track of the progress both player have made
	public static char guess1;															//Stores player 1 guess
	public static char guess2;															//Stores player 2 guess
	public static char score1=0;														//Keeps tracks of the correct guesses that player 1 has made
	public static int score2=0;															//Keeps tracks of the correct guesses that player 2 has made
	public static int finalScore1 = 0;													//Keeps overall score in the end for player 1
	public static int finalScore2 = 0;													//Keeps overall score in the end for player 2 
	public static boolean turn1 = true;													//Keeps track of player 1 turn
	public static boolean turn2 = true;													//Keeps track of player 2 turn														//
	
	/*
	 *This method is the main game sequence for COMPUTER version of word guess
	 * pre: Secret word
	 * post: None
	*/
	public static void Computer (String secretWord) {									
		HashSet<String> usedLetter = new HashSet<String>();	
		String dashes [] = new String [secretWord.length()];							//Stores dashes for word length until correct letter is guessed																		
		for (int x=0; x<secretWord.length(); x++) {										//For loop that sets up dashes to (-)
			dashes[x] = "-";
			System.out.print(dashes[x]);												//Outputs dashes when game begins
		}
		System.out.println(); 															//Next line
		
		while (win==true) {																//While loop that runs until user guesses the secret word
			//PLAYER 1 TURN
			turn1=true;																	//Player 1 turns 
			while (turn1==true && win==true) {											//While loop that runs until player 1 enters a guess
				System.out.println(player1 + " enter a letter (! to guess entire word):");//Prompts player 1 to enter their guess
				guess1 = Character.toUpperCase(input.next().charAt(0));					//Converts the letter from lower case to upper case
				
				if (guess1 =='!') {														//Runs only when player 1 enters "!"
					System.out.println(player1 + " what is your guess?");				//Prompts player 1 to guess the entire word 
					String wordGuess = input.next();									//Stores player 1 guess of the entire word
					wordGuess = wordGuess.toUpperCase();								//Converts the word guess into capital letters 
					if (wordGuess.equals(secretWord)) {									//Runs when user guesses the entire word right
						System.out.println(player1 + " wins!");							//Outputs player 1 won
						System.out.println(player2 + "lost!");							//Outputs Computer lost
						finalScore1++;													//Increments the final score of player 1 by 1 
						win=false;														//Stops code
						turn1=false;													//Stops turn of player 1 
						turn2=false;													//Stops turn of Computer
					}
					else {																//Runs when player 1 guesses the entire word wrong.
						System.out.println(player1 + " lost!");							//Outputs player 1 lost 
						System.out.println(player2 + " wins!");							//Outputs Computer won
						finalScore2++;													//Increments the final score of Computer by 1 
						win=false;														//Stops code
						turn1=false;													//Stops turn of player 1
						turn2=false;													//Stops turn of Computer 
					}
				}
				else {																	//Runs when player 1  does not enter "!"
					do {																//Runs until player 1 enters a non-used letter
						if (usedLetter.contains(Character.toString(guess1))) {			//Checks if player 1 entered the same letter twice throughout the game.
							System.out.println(guess1 + " was already used, Try again !");	//Outputs letter has already been used to the user 
							System.out.println(progress);
							System.out.println(player1 + " enter a letter (! to guess entire word):");//Prompts player 1 to enter their guess
							guess1 = Character.toUpperCase(input.next().charAt(0));					//Converts the letter from lower case to upper case
						}
						if (!usedLetter.contains(Character.toString(guess1))){															//Runs only if user entered a non-used letter
							for (int x=0; x<secretWord.length(); x++) {					//Checks if player 1 guess matches to any letter in secret word
								if (secretWord.charAt(x) == guess1) {					//Runs if player 1 guess matches to any letter in secret word
									dashes[x] = Character.toString(guess1);				//Adds guess at the index where the letter belongs in secret word
									score1++;											//Increments player 1 score by 1
									turn1=false;										//Stops turn of player 1 
								}
							}
							for (int x=0; x<secretWord.length(); x++) {					//Inserts the string representation of the char array
								 sb.insert(x,dashes[x]);
							}
							progress = sb.substring(0,secretWord.length());				//Stores the string representation of the char array
							System.out.println(progress);								//Outputs progress that player 1 made so far
							
							if (progress.equals(secretWord)) {							//Checks if player 1 guessed the entire word
								if (score1>score2) {									//Runs when player 1 score is higher than Computer
									System.out.println(player1 + " won!");				//Outputs player 1 won
									System.out.println(player2 + " lost!");				//Outputs Computer lost
									finalScore1++;										//Increments the final score of player 1 by 1
								}
								else if (score1<score2) {								//Runs if player 2 score is higher than player 1
									System.out.println(player2 + " won!");				//Outputs Computer won
									System.out.println(player1 + " lost!");				//Outputs player 1 lost
									finalScore2++;										//Increments the final score of Computer by 1
								}
								else if (score1==score2) {								//Runs if both players scores are equal
									System.out.println(player1 + " and " + player2 + " tied up");//Outputs that both player tied up 
									finalScore1++;										//Increments the final score of player 1 by 1
									finalScore2++;										//Increments the final score of Computer by 1
								}
								win=false;												//Stops code
								turn1=false;											//Stops turn of player 1
								turn2=false;											//Stops turn of Computer
							}
						}
					}
					while (usedLetter.contains(Character.toString(guess1)));			//Checks if player 1 has entered an used letter
				}
				usedLetter.add(Character.toString(guess1));								//Adds the guessed letter of player 1 to the array of usedLetter
				turn1 = false;															//Stops turn of player 1
			}
			
			//COMPUTER TURN
			turn2=true;																	//Player 2 turn
			while (turn2==true && win==true) {											//While loop that runs until player 1 enters a guess
				String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				do {
				int random = (int) ((int) 1 + (Math.random() * 25));
				guess2 = alphabet.charAt(random);
				}
				while (usedLetter.contains(Character.toString(guess2)));
				System.out.println("Computer guessed " + guess2);
				
				for (int x=0; x<secretWord.length(); x++) {								//Checks if Computer guess matches to any letter in secret word
					if (secretWord.charAt(x) == guess2) {								//Runs if Computer guess matches to any letter in secret word
						dashes[x] = Character.toString(guess2);							//Adds guess at the index where the letter belongs in secret word
						score2++;														//Increments Computer score by 1
					}
				}
				for (int x=0; x<secretWord.length(); x++) {								//Inserts the string representation of the char array
					 sb.insert(x,dashes[x]);
				}
				progress = sb.substring(0,secretWord.length());							//Stores the string representation of the char array
				System.out.println(progress);											//Outputs progress that Computer made so far
				
				if (progress.equals(secretWord)) {										//Checks if player 1 guessed the entire word
					if (score1>score2) {												//Runs when player 1 score is higher than Computer
						System.out.println(player1 + " won!");							//Outputs player 1 won
						System.out.println(player2 + " lost!");							//Outputs Computer lost 
						finalScore1++;													//Increments the final score of player 1 by 1 
					}
					else if (score1<score2) {											//Runs when Computer score is higher than player 1
						System.out.println(player2 + " won!");							//Outputs Computer won
						System.out.println(player1 + " lost!");							//Outputs player 1 lost
						finalScore2++;													//Increments the final score of player 1 by 1 
					}
					else if (score1==score2) {											//Runs if both players scores are equal
						System.out.println(player1 + " and " + player2 + " tied up"); 	//Outputs both players tied up
						finalScore1++;													//Increments the final score of player 1 by 1
						finalScore2++;													//Increments the final score of Computer by 1
					}
					win=false;															//Stops code 
					turn1=false;														//Stops turn of player 1
					turn2=false;														//Stops turn of Computer
				}
			usedLetter.add(Character.toString(guess2));									//Adds the guessed letter of player 2 to the array of usedLetter
			turn2=false;														    	//Stops turn of Computer
		}
	}
}
	
	/*
	 * This method is for COMPUTER options
	 * This method prompts user for options when the game is over 
	 * The options are to either play again or stop playing
	 * If user decides to play again the game re starts again keeping track user guesses
	 * if user decides to stop playing the game ends
	 * pre: none
	 * post: re starts the game or ends the game
	*/
	public void Option () {
		if (win == false) {
			System.out.println("Options:");											  //Outputs user the option to play again or stop playing
			System.out.println("1 - Play again");									  //Option to play again
			System.out.println("2 - Stop playing");									  //Option to quit playing
			int userOption = input.nextInt();										  //Stores players option
			if (userOption == 1) {													  //Runs if players pick option 1
				win = true;															  //Runs the game one more time
			}
			else {												  					  //Runs if players pick options 2
				if (finalScore1>finalScore2) {									      //Runs if final score of player 1 is higher than the final score of player 2
					System.out.println(player1 + " is the final winner");			  //Outputs player 1 won the entire game
				}
				else if (finalScore1<finalScore2) {									  //Runs if final score of Computer is higher than the final score of player 1
					System.out.println(player2 + " is the final winner");			  //Outputs Computer won the entire game
				}
				else if (finalScore1==finalScore2) {								  //Runs if the final score of both players are equal
					System.out.println(player1 + " and " + player2 + " tied up");     //Outputs that both player tied up.
				}
				System.out.println("Game over");									  //Outputs game over 
			}
		}
	}
	
	/*
	 * This is a mutator method to set the value of player1 to name
	 * pre: name of player 1
	 * post: none
	 */
	public void Player (String name1) {
		player1 = name1;															 //Sets player1 = name1
	}

	/*
	 * This is an accessor method to access win
	 * pre: none
	 * pst: returns the status of win (true/false)
	 */
	public static boolean Win () {
		return win;																	//Returns win
	}
	
	
}

