import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); //Creates scanner				
		int integer = 0;						 //Stores user input for array size
		int random;								 //Generates random integers (1-20) to store into the array
		int evenCount = 0;						 //Keeps track of even integers in the array
		int oddCount = 0;						 //Keeps track of odd integers in the array
		
		//User input
		do {									 //Runs until user enters an integer greater than 0
			System.out.println("Enter an integer");//Prompts user for integer
			integer = input.nextInt();			 //Stores user integer for array size
			if (integer<0)						 //Runs only if user enters an invalid integer (less than or equal to 0)
				System.out.println("Please enter an integer greater than 0");
		}
		while (integer<0);						 //Checks if integer is greater than 0
		
		int [] array = new int [integer];		 //Declares array to integer size
		for (int x=0; x<integer; x++) {			 //Initializes array to random integers	 
			random = (int) (1 + Math.random() * 20); //Generates a random integer
			array[x] = random;					//Stores random integer into array at index x
		}
		
		//Counts how many EVEN and ODD integers are in the array
		for (int x=0; x<integer; x++) {
			if (array[x]%2 ==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		
		//Declares even and odd arrays
		int [] evenArray = new int [evenCount];
		int [] oddArray = new int [oddCount];
		int e=0;									//Counter variable for even integers array
		int o=0;									//Counter variable for odd integers array
		
		for (int x=0; x<integer; x++) {				//For loop that runs until all integers are read
			if (array[x]%2 == 0) {					//Runs only if array contains an even integer
				while (e<evenCount) {				//Runs until even counter variable is less than the size of evenArray or evenCount
					evenArray[e] = array[x];		//Stores even integers from array to evenArray
					e++;							//Increments e by 1
					break;							//Exits while loop
				}
			}
			else {									//Runs only if array contains an odd integer
				while (o<oddCount) {				//Runs until odd counter variable is less than the size of oddArray or oddCount
					oddArray[o] = array[x];       	//Stores odd integers from array to oddArray
					o++;							//Increments o by 1
					break;							//Exits while loop
				}
			}
		}
		
		//Outputs the initial array
		System.out.print("Your array: ");
		for (int x=0; x<integer; x++) 
			System.out.print(array[x] + " ");
		System.out.println();
		
		//Outputs the odd array
		System.out.print("Odd elements array: ");
		for (int x=0; x<oddArray.length; x++) 
			System.out.print(oddArray[x] + " ");
		System.out.println();
		
		//Outputs the even array
		System.out.print("Even elements array: ");
		for (int x=0; x<evenArray.length; x++) 
			System.out.print(evenArray[x] + " ");

	}

}
