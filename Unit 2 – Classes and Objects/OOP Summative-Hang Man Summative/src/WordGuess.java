import java.io.*;
import java.util.*;
import javax.sound.sampled.*;


public class WordGuess {
	//VARIABLES
	static HashSet<String> usedWord = new HashSet<String>();							//Stores the words that are already used				
	static ArrayList<String> wordsList = new ArrayList<>();								//Stores all the words form the file and compares with usedWord
	static Scanner input = new Scanner (System.in); 									//Declares a scanner for input
	static StringBuffer sb = new StringBuffer();										//Declares a string buffer
	public static boolean win = true;													//Keeps track of the winner
	public static String player1 = "";													//Stores player 1 name
	public static String player2 = "";													//Stores player 2 name
	public static String progress;														//Keeps track of the progress both player have made
	public static char guess1;															//Stores player 1 guess
	public static char guess2;															//Stores player 2 guess
	public static char score1 = 0;														//Keeps tracks of the correct guesses that player 1 has made
	public static int score2 = 0;														//Keeps tracks of the correct guesses that player 2 has made
	public static int finalScore1 = 0;													//Keeps overall score in the end for player 1
	public static int finalScore2 = 0;													//Keeps overall score in the end for player 2 
	public static boolean turn1 = true;													//Keeps track of player 1 turn
	public static boolean turn2 = true;													//Keeps track of player 2 turn
	public static int tries = 0;														//Keeps track of user tries for single player game
	public static int guessAmount = 0;													//Keeps track of amount of guesses user makes per game
	public static boolean guessCheck = false;
	
	
	/*
	 * This method reads the title stored in AsciiArt.txt
	 * pre: none
	 * post: Outputs the title on the monitor when the game begins
	*/
	public static void AsciiArtReader () throws IOException {
		FileReader fr = new FileReader ("./Hang Man File/AsciiArt.txt");				//Creates a file reader			
		BufferedReader br = new BufferedReader(fr);   // 2) BufferedReader				//Creates a buffered reader
		String read;																	//Stores the title from the file
		for (int x=1; x<=4; x++) {														//For loop that helps to store the title in the variable read
			read = br.readLine();
			System.out.println(read);													//Outputs the title on the monitor
		}
		br.close();																		//Closes the text file "AsciiArt.txt"
	}
	
	/*
	 * This method generates a random words in the text file "Words.txt"
	 * that contains a bunch of words that the user has to guess.
	 * pre: none
	 * post: returns the secret word that is randomly generated
	*/
	public static String RandomWord() throws IOException {		
		FileReader fr = new FileReader ("./Hang Man File/Words.txt");					//Creates a file reader
		BufferedReader br = new BufferedReader(fr);   									//Creates a buffered reader
		tries = 0;
		int random = 0;																	//Stores a random integer
		String secretWord =" ";															//Stores the secret word randomly generated from word file
		String word= " ";																//Reads all the words from file.
		do {																			//Do loop to read all words from the file
			word = br.readLine();														//Reads word from file
			if (word != null) {															//Runs only if word is not null
				wordsList.add(word);													//Adds the word to wordList array 
			}
		} 
		while (word != null);															//Exits loop 

		do {																    		//Do loop that runs until a non-used word is generated 
			random = (int) ((int) 1 + (Math.random() * 46));							//Generates a random index
			secretWord = wordsList.get(random - 1); 									//Gets the word from the list at the index of random
		} 
		while (usedWord.contains(secretWord));											//Exists loop		

		usedWord.add(secretWord);														//Adds secretWord to usedWord array
		return secretWord;																//Returns secretWord
	}
	
	/*
	 * * This method is the main game sequence for SINGLEPLAYER version of word guess
	 * pre: secret word
	 * post: none
	*/
	public static void Singleplayer (String secretWord) {						
		Scanner input = new Scanner (System.in); 										//Creates a Scanner for input
		StringBuffer sb = new StringBuffer();											//Creates a String Buffer
		//VARIABLES
		String progress = "";															//Keeps track of the progress that the user made to guess the word
		char guess = ' ';																//Prompts user for their guess
		guessAmount = 0;																//Keeps track of guesses the user takes to guess the secret word
		HashSet<String> usedLetter = new HashSet<String>();								//Stores used letters
		String dashes [] = new String [secretWord.length()];							//Stores dashes for word length until correct letter is guessed
		
		for (int x=0; x<secretWord.length(); x++) {										//For loop that sets up dashes to (-)
			dashes[x] = "-";
			System.out.print(dashes[x]);												//Outputs dashes when game begins
		}
		System.out.println(); 															//Next line
		
		while (win==true && tries<7) {													//While loop that runs until user guesses the secret word
			System.out.println("Enter a letter (! to guess entire word):");	    		//Prompts user to enter their guess
			guess = Character.toUpperCase(input.next().charAt(0));						//Converts the letter from lower case to upper case
			guessAmount++;																//Increments guessAmount by 1 each time user takes a guess
			if (guess =='!') {															//Runs only when user enters "!"
				System.out.println("What is your guess?");								//Prompts user to guess the entire word
				String wordGuess = input.next();										//Stores users entire word guess
				wordGuess = wordGuess.toUpperCase();									//Converts the word guess into capital letters 
				if (wordGuess.equals(secretWord)) {										//Runs when user guesses the entire word right
					System.out.println("You won!");										//Outputs user won
					System.out.println("The secret word is " + secretWord);	    		//Outputs the secret word
					System.out.println("You made " + guessAmount + " guesses");	 		//Outputs the number of guesses user took
					win=false;															//Stops code
					try {
						WinSound();														//Outputs win sound
					} 
					catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();											//Prints an error if sound does not play
					}
				}
				else {																	//Runs when user guesses the entire word wrong.
					System.out.println("You lost!");						    		//Outputs user lost 
					System.out.println("The secret word is " + secretWord);	    		//Outputs the secret word
					System.out.println("You made " + guessAmount + " guesses"); 		//Outputs the number of guesses user took
					win=false;															//Stops code
					try {
						LossSound();													//Outputs loss sound
					} 
					catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();											//Prints an error if sound does not play
					}
				}
			}
			else {																		//Runs when user does not enter "!"
				do {																	//Runs until user enters a non-used letter
				if (usedLetter.contains(Character.toString(guess))) {		    		//Checks if user entered the same letter twice throughout the game.
						try {
							UsedLetterSound();											//Outputs used letter sound
						} 
						catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();										//Prints an error if sound does not play
						}
						System.out.println(guess + " was already used ");				//Outputs letter has already been used to the user 
					}
				else {																	//Runs only if user entered a non-used letter 
					for (int x=0; x<secretWord.length(); x++) {							//Checks if user guess matches to any letter in secret word
						if (secretWord.charAt(x) == guess) {							//Runs if user guess matches to any letter in secret word
							try {
								RightSound();											//Output right sound
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();									//Prints an error if sound does not play
							}
							dashes[x] = Character.toString(guess);						//Adds guess at the index where the letter belongs in secret word
							guessCheck = true;
						}
					}
					if (guessCheck==false) {
						tries++;
						Hangman(secretWord);
					}
					guessCheck= false;
					for (int x=0; x<secretWord.length(); x++) {		        			//Inserts the string representation of the char array
						 sb.insert(x,dashes[x]);
					}
					if(win==true) {
						progress = sb.substring(0,secretWord.length());					//Stores the string representation of the char array
						System.out.println(progress);									//Outputs the progress that user has made so far.
					}
					if (progress.equals(secretWord)) {									//Checks if user guessed the entire word
						System.out.println("You won!");									//Outputs the user that it won
						System.out.println("The secret word is " + secretWord);    	 	//Outputs the secret word
						System.out.println("You made " + guessAmount + " guesses"+"\n");//Outputs the number of guesses user took
						win=false;														//Stops code
						try {
							WinSound();													//Outputs win sound
						} 
						catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();										//Prints an error if sound does not play
						}
					}
				}
				}
				while(usedLetter.contains(guess));							  			//Checks if user has entered an used letter
				usedLetter.add(Character.toString(guess));				      			//Adds the guessed letter to the array of usedLetter
			}
		}
	}
	
	/*
	 * This method is the main game sequence for MULTIPLAYER version of word guess
	 * pre: secret word, name of player 1, name of player 2
	 * post: none
	*/
	public static void Multiplayer (String secretWord, String name1, String name2) {
		//VARIABLES
		player1 = name1;																//Stores player 1 name 
		player2 = name2;																//Stores player 2 name
		int guessAmount1=0;																//Keeps track of the amount of guesses player 1 makes per game
		int guessAmount2 =0;															//Keeps track of the amount of guesses player 2 makes per game
		HashSet<String> usedLetter = new HashSet<String>();								//Stores used letters
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
				guessAmount1++;															//Increments guess amount for player 1 by 1
				if (guess1 =='!') {														//Runs only when player 1 enters "!"
					System.out.println(player1 + " what is your guess?");				//Prompts player 1 to guess the entire word 
					String wordGuess = input.next();									//Stores player 1 guess of the entire word
					wordGuess = wordGuess.toUpperCase();								//Converts the word guess into capital letters 
					if (wordGuess.equals(secretWord)) {									//Runs when user guesses the entire word right
						System.out.println(player1 + " wins!");							//Outputs player 1 won
						System.out.println(player2 + " lost!");							//Outputs player 2 lost
						System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
						System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
						finalScore1++;													//Increments the final score of player 1 by 1 
						win=false;														//Stops code
						turn1=false;													//Stops turn of player 1 
						turn2=false;													//Stops turn of player 2
						try {
							WinSound();													//Outputs Win Sound
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();										//Prints an error if sound does not play
						}
					}
					else {																//Runs when player 1 guesses the entire word wrong.
						System.out.println(player1 + " lost!");							//Outputs player 1 lost 
						System.out.println(player2 + " wins!");							//Outputs player 2 won
						System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
						System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
						finalScore2++;													//Increments the final score of player 2 by 1 
						win=false;														//Stops code
						turn1=false;													//Stops turn of player 1
						turn2=false;													//Stops turn of player 2 
						try {
							LossSound();												//Outputs loss sound
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();										//Prints an error if sound does not play
						}
					}
				}
				else {																	//Runs when player 1  does not enter "!"
					do {																//Runs until player 1 enters a non-used letter
						if (usedLetter.contains(Character.toString(guess1))) {			//Checks if player 1 entered the same letter twice throughout the game.
							try {
								UsedLetterSound();										//Outputs Used Letter Sound
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();									//Prints an error if sound does not play
							}
							System.out.println(guess1 + " was already used ");			//Outputs letter has already been used to the user 
							System.out.println(progress);								//Outputs user progress that it made so far
						}
						else {															//Runs only if user entered a non-used letter
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
								if (score1>score2) {									//Runs when player 1 score is higher than player 2
									System.out.println(player1 + " won!");				//Outputs player 1 won
									System.out.println(player2 + " lost!");				//Outputs player 2 lost
									System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
									System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
									finalScore1++;										//Increments the final score of player 1 by 1
									win=false;											//Stops code
									turn1=false;										//Stops turn of player 1
									turn2=false;										//Stops turn of player 2
									try {
										WinSound();										//Outputs Win Sound
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();							//Prints an error if sound does not play					
									}
								}
								else if (score1<score2) {								//Runs if player 2 score is higher than player 1
									System.out.println(player2 + " won!");				//Outputs player 2 won
									System.out.println(player1 + " lost!");				//Outputs player 1 lost
									System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
									System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
									finalScore2++;										//Increments the final score of player 2 by 1
									win=false;											//Stops code
									turn1=false;										//Stops turn of player 1
									turn2=false;										//Stops turn of player 2
									try {
										LossSound();									//Outputs Loss Sound
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();							//Prints an error if sound does not play					
									}
								}
								else if (score1==score2) {								//Runs if both players scores are equal
									System.out.println(player1 + " and " + player2 + " tied up");//Outputs that both player tied up 
									System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
									System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
									finalScore1++;										//Increments the final score of player 1 by 1
									finalScore2++;										//Increments the final score of player 2 by 1
									win=false;											//Stops code
									turn1=false;										//Stops turn of player 1
									turn2=false;										//Stops turn of player 2
									try {
										WinSound();										//Outputs Win Sound
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();							//Prints an error if sound does not play					
									}
								}
							}
						}
					}
					while (usedLetter.contains(guess1));								//Checks if player 1 has entered an used letter
				}
				usedLetter.add(Character.toString(guess1));								//Adds the guessed letter of player 1 to the array of usedLetter
				turn1 = false;															//Stops turn of player 1
			}
			
			//PLAYER 2 TURN
			turn2=true;																	//Player 2 turn
			while (turn2==true && win==true) {											//While loop that runs until player 1 enters a guess
				System.out.println(player2 + " enter a letter (! to guess entire word):");//Prompts player 2 to enter their guess
				guess2 = Character.toUpperCase(input.next().charAt(0));					//Converts the letter from lower case to upper case
				guessAmount2++;															//Increments guess amount for player 2 by 1
				if (guess2 =='!') {														//Runs only when player 2 enters "!"
					System.out.println(player2 + " what is your guess?");				//Prompts player 2 to guess the entire word
					String wordGuess = input.next();									//Stores player 2 entire word guess
					wordGuess = wordGuess.toUpperCase();								//Converts the word guess into capital letters 
					if (wordGuess.equals(secretWord)) {									//Runs when player 2 guesses the entire word right
						System.out.println(player2 + " wins!");							//Outputs player 2 won
						System.out.println(player1 + "lost!");							//Outputs player 1 lost
						System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
						System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
						finalScore2++;													//Increments player 2 score by 1
						win=false;														//Stops code
						turn1=false;													//Stops turn of player 1
						turn2=false;													//Stops turn of player 2
						try {
							WinSound();													//Outputs Win Sound
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();										//Prints an error if sound does not play					
						}
					}
					else {																//Runs when player 2 guesses the entire word wrong.
						System.out.println(player2 + " lost!");							//Outputs player 2 lost
						System.out.println(player1 + " wins!");							//Outputs player 1 won
						System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
						System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
						finalScore1++;													//Increments player 1 score by 1
						win=false;														//Stops code
						turn1=false;													//Stops turn of player 1
						turn2=false;													//Stops turn of player 2
						try {
							LossSound();												//Outputs Loss Sound
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();										//Prints an error if sound does not play					
						}
					}
				}
				else {																	//Runs when player 2  does not enter "!"
					do {																//Runs until player 2 enters a non-used letter
						if (usedLetter.contains(Character.toString(guess2))) {			//Checks if player 2 entered the same letter twice throughout the game.
							try {
								UsedLetterSound();										//Outputs Used Letter Sound
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();									//Prints an error if sound does not play					
							}
							System.out.println(guess2 + " was already used ");			//Outputs letter has already been used to player 2 
							System.out.println(progress);
						}
						else {															//Runs only if user entered a non-used letter
							for (int x=0; x<secretWord.length(); x++) {					//Checks if player 2 guess matches to any letter in secret word
								if (secretWord.charAt(x) == guess2) {					//Runs if player 2 guess matches to any letter in secret word
									dashes[x] = Character.toString(guess2);				//Adds guess at the index where the letter belongs in secret word
									score2++;											//Increments player 2 score by 1
								}
							}
							for (int x=0; x<secretWord.length(); x++) {					//Inserts the string representation of the char array
								 sb.insert(x,dashes[x]);
							}
							progress = sb.substring(0,secretWord.length());				//Stores the string representation of the char array
							System.out.println(progress);								//Outputs progress that player 2 made so far
							
							if (progress.equals(secretWord)) {							//Checks if player 1 guessed the entire word
								if (score1>score2) {									//Runs when player 1 score is higher than player 2
									System.out.println(player1 + " won!");				//Outputs player 1 won
									System.out.println(player2 + " lost!");				//Outputs player 2 lost 
									System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
									System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
									finalScore1++;										//Increments the final score of player 1 by 1 
									win=false;											//Stops code 
									turn1=false;										//Stops turn of player 1
									turn2=false;										//Stops turn of player 2
									try {
										LossSound();									//Outputs Loss Sound
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();							//Prints an error if sound does not play					
									}
									
								}
								else if (score1<score2) {								//Runs when player 2 score is higher than player 1
									System.out.println(player2 + " won!");				//Outputs player 2 won
									System.out.println(player1 + " lost!");				//Outputs player 1 lost
									System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
									System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
									finalScore2++;										//Increments the final score of player 1 by 1 
									win=false;											//Stops code 
									turn1=false;										//Stops turn of player 1
									turn2=false;										//Stops turn of player 2
									try {
										WinSound();													//Outputs Win Sound
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();										//Prints an error if sound does not play					
									}
								}
								else if (score1==score2) {								//Runs if both players scores are equal
									System.out.println(player1 + " and " + player2 + " tied up"); //Outputs both players tied up
									System.out.println(player1 + " made " + guessAmount1 + " guesses"); //Outputs the amount of guesses player 1 took
									System.out.println(player2 + " made " + guessAmount2 + " guesses"); //Outputs the amount of guesses player 2 took
									finalScore1++;										//Increments the final score of player 1 by 1
									finalScore2++;										//Increments the final score of player 2 by 1
									win=false;											//Stops code 
									turn1=false;										//Stops turn of player 1
									turn2=false;										//Stops turn of player 2
									try {
										WinSound();													//Outputs Win Sound
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();										//Prints an error if sound does not play					
									}
								}
							}
						}
					}
					while (usedLetter.contains(guess2));								//Checks if player 2 has entered an used letter
				}
				usedLetter.add(Character.toString(guess2));								//Adds the guessed letter of player 2 to the array of usedLetter
				turn2=false;														    //Stops turn of player 2
			}
		}
	}
	
	/*
	 *This method outputs the instructions on how to play word guess
	 *pre: none
	 *post: Outputs instructions 
	*/
	public static void Instructions () {
		System.out.println("**INSTRUCTIONS**");
		System.out.println("⦿Player has to guess the word provided");
		System.out.println("⦿ Player will be given 15 tries to guess the word");
		System.out.println("⦿ If the player enters ! it has to guess the entire word to WIN or LOOSE");
		System.out.println("⦿ Or the player can enter the letter 15 times to guess the word");
		System.out.println("⦿ At the end of every round, secret word and the number of guesses will be displayed");
		System.out.println("⦿  When game is over, the user can play again or stop playing");
	}
	
	/*
	 * This method is for SINGLEPLAYER options
	 * This method prompts user for options when the game is over 
	 * The options are to either play again or stop playing
	 * If user decides to play again the game re starts again keeping track user guesses
	 * if user decides to stop playing the game ends
	 * pre: none
	 * post: re starts the game or ends the game
	*/
	public static void Option1 () {
		if (win == false) {
			System.out.println("Options:");			   									 //Outputs user the option to play again or stop playing
			System.out.println("1 - Play again");	   									 //Option to play 
			System.out.println("2 - Stop playing");	   									 //Option to quit playing.
			int userOption = input.nextInt();			   								 //Stores user's option
			if (userOption == 1) {														 //Runs if user pick option 1
				win = true;						   										 //Runs the game one more time
			}
			else {																		 //Runs if players pick options 2
				System.out.println("Game over");										 //Outputs game over
			}
		}
	}
	
	/*
	 * This method is for MULTIPLAYER options
	 * This method prompts user for options when the game is over 
	 * The options are to either play again or stop playing
	 * If user decides to play again the game re starts again keeping track of both players final score
	 * if user decides to stop playing the final winner is displayed and the game ends
	 * pre: none
	 * post: re starts the game or outputs the final winner and ends the game 
	*/
	public void Option2 () {
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
				else if (finalScore1<finalScore2) {									  //Runs if final score of player 2 is higher than the final score of player 1
					System.out.println(player2 + " is the final winner");			  //Outputs player 2 won the entire game
				}
				else if (finalScore1==finalScore2) {								  //Runs if the final score of both players are equal
					System.out.println(player1 + " and " + player2 + " tied up");     //Outputs that both player tied up.
				}
				System.out.println("Game over");									  //Outputs game over													  
			}
			try {
				WinSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	/*
	 * This method returns the status of the boolean variable win
	 * pre: none
	 * post: returns win 
	*/
	public static boolean Win () {
		return win;																	   //Returns win
	}
	
	/*
	 * This method is only for SINGLE PLAYER (PAHSE 2)
	 * This method outputs an visual representation of Hangman
	 * pre: secret word
	 * post: none
	 */
	public static void Hangman (String secretWord) {
		if (tries == 1) {
			System.out.println("Wrong guess, try again");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
			try {
				WrongSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tries == 2) {
			System.out.println("Wrong guess, try again");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			System.out.println();
			try {
				WrongSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tries == 3) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
			System.out.println();
			try {
				WrongSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tries == 4) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			System.out.println();
			try {
				WrongSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tries == 5) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
			System.out.println();
			try {
				WrongSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tries == 6) {
			System.out.println("Wrong guess, try again");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println();
			try {
				WrongSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (tries == 7) {
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			System.out.println("You lost");
			System.out.println("The secret word is " + secretWord);	    		//Outputs the secret word
			System.out.println("You made " + guessAmount + " guesses");	 		//Outputs the number of guesses user took
			System.out.println();
			win=false;
			try {
				LossSound();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  
	
	/*
	 * This method outputs the sound from wav file "Win Sound.wav"
	 * This method only outputs when user WINS the round
	 * pre: none
	 * post: Win Sound
	 */
	public static void WinSound () throws UnsupportedAudioFileException, IOException, LineUnavailableException {								//
		File file = new File ("./Hang Man File/Win Sound.wav");						//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		if (win==false) 															//Loop will only run if win = false
			clip.start();															//Clip starts and outputs sound
	}
	
	/*
	 * This method outputs the sound from wav file "Loss Sound.wav"
	 * This method only outputs when user LOOSES the round
	 * pre: none
	 * post: Loss Sound
	 */
	public static void LossSound () throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File ("./Hang Man File/Loss Sound.wav");					//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		if (win==false) 															//Loop will only run if win = false
			clip.start();															//Clip starts and outputs sound
	}
	
	/*
	 * This method outputs the sound from wav file "Right Sound.wav"
	 * This method only outputs when user guesses the letter RIGHT
	 * pre: none
	 * post: Right Sound
	 */
	public static void RightSound () throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File ("./Hang Man File/Right Sound.wav");					//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		if (win==true) 																//Loop will only run if win = true
			clip.start();															//Clip starts and outputs sound
	}
	
	/*
	 * This method outputs the sound from wav file "Wrong Sound.wav"
	 * This method only outputs when user guesses the letter WRONG
	 * pre: none
	 * post: Wrong Sound
	 */
	public static void WrongSound () throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File ("./Hang Man File/Wrong Sound.wav");					//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		if (win==true) 															//Loop will only run if win = true
			clip.start();															//Clip starts and outputs sound
	}
	
	/*
	 * This method outputs the sound from wav file "Used Letter Sound.wav"
	 * This method only outputs when user enters an USED LETTER
	 * pre: none
	 * post: USED LETTER 
	 */
	public static void UsedLetterSound () throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File ("./Hang Man File/Used Letter Sound.wav");				//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		if (win==true) 																//Loop will only run if win = true
			clip.start();															//Clip starts and outputs sound
	}
}
