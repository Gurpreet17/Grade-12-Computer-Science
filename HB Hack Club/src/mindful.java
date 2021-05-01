import java.io.*;
import java.util.*;
import javax.sound.sampled.*;
import java.util.concurrent.TimeUnit;
public class mindful {
	
	static int mood = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random dice = new Random();
		try {
			//THE BEFORE
			System.out.println("\t\t      -----------------");
			System.out.println("\t\t      | M I N D F U L |");
			System.out.println("\t\t      -----------------");
			System.out.println("------------------------------------------------------------");	
			TimeUnit.SECONDS.sleep(1);
			//MAINPAGE
			System.out.println("Welcome to mindful! This is a safe place where you can relax ");
			System.out.println(" your mind from all the stress you have been dealing with!");
			System.out.println("------------------------------------------------------------");
			System.out.println("Life can be stressful at times, it is important to remember \n\t    the importance of taking care of yourself.");
			System.out.println("\t\tFind a comfortable and safe space\n   - close your eyes and do your best to clear your mind\n   - listen to the voice and do your best to follow along");
			System.out.println("------------------------------------------------------------");
			TimeUnit.SECONDS.sleep(1);
			
			//FEELING PAGE
			System.out.println("  Hi, I'm Allysa, your mindful assistant! I will be guiding \nyou towards the journey of de-stressing and pure relaxation ");
			System.out.println("------------------------------------------------------------");
			TimeUnit.SECONDS.sleep(1);
			
			//FEELINGS
			int moodk;
			System.out.println("On a scale of 1 - 10 how was your day today?\nEnter the number based on the scale provided");
			System.out.println("1 - DEPRESSED");
			System.out.println("2 - SAD STATE");
			System.out.println("3 - MIND NOT AT PEACE");
			System.out.println("4 - STRUGGLED");
			System.out.println("5 - MEH");
			System.out.println("6 - DOING BETTER");
			System.out.println("7 - OK");
			System.out.println("8 - GREAT");
			System.out.println("9 - AMAZING");
			System.out.println("10 - BEST DAY EVER!");
			System.out.println("------------------------------------------------------------");
			moodk=in.nextInt();
			System.out.println("------------------------------------------------------------");
			
			if(moodk==1) {
				System.out.println("Your emotions shouldn’t paralyze you. 'They shouldn’t defend \nthemselves. They shouldn’t stop you from being everything you \nwant to be' ~ Wayne Dyer");}
			else if(moodk==2) {
				System.out.println("'Man is fond of counting his troubles, but he does not count \nhis joys. If he counted them up as he ought to, he would see \nthat every lot has enough happiness provided for it.'\n ~ Fyodor Dostoevsky");}
			else if(moodk==3) {
				System.out.println("'I have not failed. I’ve just found 10,000 ways that won’t \nwork.' ~ Thomas Edison");}
			else if(moodk==4) {
				System.out.println("'Sometimes, struggles are exactly what we need in our life. \nIf we were to go through our life without any obstacles, we would \nbe crippled. We would not be as strong as what we could have been. \nGive every opportunity a chance, \nleave no room for regrets.' ~ Friedrich Nietzsche");}
			else if(moodk==5) {
				System.out.println("Seize the day! 'Don’t let anything or anyone mess it up\n Write it on your heart that every day is the \nbest day in the year.' ~ Ralph Waldo Emerson");}
			else if (moodk==6) {
				System.out.println("'Through loyalty to the past, our mind refuses to realize \nthat tomorrow’s joy is possible only if today’s makes way \nfor it; that each wave owes the beauty of its line only to \nthe withdrawal of the preceding one.' ~ André Gide");}
			else if (moodk==7) {
				System.out.println("Don’t forget that you are human. It is okay to have a \nmeltdown. Just don’t unpack and live there. Cry it out and \nrefocus on where you are headed to' ~ unknown");}
			else if (moodk==8) {
				System.out.println("A word void of thought is a dead thing, the same way that a thought not accompanied by words remains in the shadows.-Vygotsky’s-");}
			else if (moodk==9) {
				System.out.println("A day is a day. It's just a measurement of time. Whether it's a good day or a bad day is up to you. It's all a matter of perception. -Donald L. Hicks-");}
			else if (moodk==10) {
				System.out.println("We are just an advanced breed of monkeys on a minor planet of a very average star. But we can understand the Universe. That makes us something very special. -Stephan Hawking-");}
		
			
			//OPTIONS
			boolean right = true;
			do {
				System.out.println("------------------------------------------------------------");
				System.out.println("It's alright...you will be fine. \nHere are somethings I can do...\nSelect and option of what to do.");
				TimeUnit.SECONDS.sleep(1);
				System.out.println("1 - music\n2 - guided meditation\n3 - guided breathing\n4 - more motivational quotes!\n5 - exit");
				System.out.println("------------------------------------------------------------");
				int option = in.nextInt();
				System.out.println("------------------------------------------------------------");
					if(option == 1) { 
						do {
							System.out.println("\t\t\t   music");
							System.out.println("------------------------------------------------------------\n");
							TimeUnit.SECONDS.sleep(1);
							System.out.println("How was your mood today ?");
							System.out.println("1 - Happy");
							System.out.println("2 - Sad");
							System.out.println("3 - Enegetic");
							System.out.println("4 - Romantic");
							mood = in.nextInt();
							Music(mood);
						}
						while (mood >= 5 || mood <= 0);
					}
					else if(option == 2) {
						System.out.println("\t\t\tguided meditation");
						System.out.println("------------------------------------------------------------\n");
						GuidedMetidation(option);
					}
					else if(option == 3) {
						String choice = "r";
						System.out.println("\t\t   guided breathing");
						System.out.println("------------------------------------------------------------\n");
						TimeUnit.SECONDS.sleep(1);
						do{
							System.out.println("Breathe in....");
							TimeUnit.SECONDS.sleep(4);
							System.out.println("Hold...");
							TimeUnit.SECONDS.sleep(7);
							System.out.println("Breathe out...");
							TimeUnit.SECONDS.sleep(8);
							System.out.println("Press 's' to stop and 'r' to repreat!");
							System.out.println("------------------------------------------------------------");
							choice = in.nextLine();
						}while(choice.equals("r"));
					}
					else if(option == 4) {
						//RANDOM QUOTE
						System.out.println("\t\t\t  more quotes!");
						System.out.println("------------------------------------------------------------");
						String word;
						boolean choice=false;
						while(choice==false) {
							String [] quotes = {"'Most of the important things in the world have been \naccomplished by people who have kept on trying when there seemed \nto be no hope at all.' ~ Dale Carnegie","'And once the storm is over, you won't remember how you \nmade it through, how you managed to survive. You won't\neven be sure whether the storm is really over. But one thing is \ncertain. When you come out of the storm, you won't be the \nsame person who walked in. That's what this storm's \nall about.' ~ Haruki Murakami","'Don't let the fear of the time it will take to accomplish \nsomething stand in the way of your doing it. The time will \npass anyway; we might just as well put that passing \ntime to the best possible use.' ~ Earl Nightingale","'Courage doesn't always roar. Sometimes courage is the \nlittle voice at the end of the day that says I'll try again \ntomorrow.' ~ Mary Anne Radmacher","'We must accept finite disappointment, but we must never lose \ninfinite hope' ~ Martin Luther King","'Problems are not stop signs, they are \nguidelines.' ~ Robert Schuller"};
							System.out.println(quotes[dice.nextInt(6)]);
							System.out.println("------------------------------------------------------------");
							System.out.println("Would you like another quote? Type yes if you want one!");
							System.out.println("------------------------------------------------------------");
							word = in.next();
							System.out.println("------------------------------------------------------------");
							if(word.equals("yes")) {
								choice = false;}
							else {
								choice = true;}}}
					else if(option == 5) {
						right = false;}
					else {
						System.out.println("I'm sorry...I didn't get that.");}
				}while (right == true);		
			
		} catch (InterruptedException e) {
           System.err.format("IOException: %s%n", e); }
	}
	
	public static void MusicGenerator() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner input = new Scanner (System.in);
		String [] MusicFiles = new String [6];
		MusicFiles[1] ="./Music/Happy Music.wav"; 
		MusicFiles[2] = "./Music/Sad Music.wav";
		MusicFiles[3] = "./Music/Energetic Music.wav";
		MusicFiles[4] = "./Music/Romantic Music.wav";
		int fileNum = 0;
		if (mood==1) {
			fileNum = 1;
		}
		else if (mood==2) {
			fileNum = 2;
		}
		else if (mood == 3) {
			fileNum =3;
		}
		else if (mood==4) {
			fileNum = 4;
		}
		
		File file = new File (MusicFiles[fileNum]);									//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		System.out.println ("Would you like to listen to a song dedicated to your mood");
		int option = 0 ;
		do {
			System.out.println ("1 - Yes");
			System.out.println ("2 - No");
			option = input.nextInt();
		}
		while (option != 1 && option !=2);
		if (option == 1) {
			clip.start();
		}
		else {
			System.out.println ("Hope you feel better");
		}
	}
	
	public static void Music (int mood) {
		try {
			MusicGenerator();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void GuidedMeditationGenerator (int option) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File ("./Music/Guided Meditation Music.wav");													//Declares the file
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);		//Declares the Audio Input Stream
		Clip clip = AudioSystem.getClip();											//Declares clip
		clip.open(audioStream);														//Opens clip
		if (option == 2) {
			clip.start();
		}
	}
	
	public static void GuidedMetidation(int option) {
		try {
			GuidedMeditationGenerator(option);
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

