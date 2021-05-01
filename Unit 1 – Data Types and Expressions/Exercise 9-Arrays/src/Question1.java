import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int size;
		int random;
		int min;;
		int max;
		double mean;
		double median;
		do {
			System.out.println("Enter the size of the array:");
			size =input.nextInt();
			if (size<1) {
				System.out.println("Invalid size!");
				System.out.println("Please enter an array size greater or equal than 1");
			}
		}
		while (size<1);
		int [] array = new int [size];
		for (int x = 0; x < size; x++) {
			random = (int) (1 + Math.random() * 100);
			array[x] = random;
		}
		
		//PART A: Display minimum integer value
		min = array [0];
		for (int x = 0; x < size; x++) {
			if (array[x] < min) 
				min = array[x];	
		}
		System.out.println("The minimum integer is " + min);
		
		//PART B: Display maximum integer value
		max = array [1];
		for (int x = 0; x < size; x++) {
			if (array[x] > max) 
				max = array[x];
		}
		System.out.println("The maximum integer is " + max);
		
		//PART C: Display the mean of all the values
		mean = 0;
		for (int x = 0; x < size; x++) {
			mean = mean + array[x];
		}
		mean = mean/size;
		System.out.println("The mean of all integers is " + mean);
		
		//PART D: Display the median value 
		int temp;
		for (int x = 0; x < size; x++) {
			for (int y = 0; y < array.length; y++) {
				if (array[x]<array[y]) {
					temp = array[x];
					array[x] = array[y];
					array[y]= temp;
				}
			}
		}
		
		if (size%2 == 0) {
			median = (array[(size/2)-1] + array[size/2])/2.0;
			System.out.println("The median is " + median);
		}
		else {
			median = array[(size/2)];
			System.out.println("The median is " + median);
		}
		
		
		    
 
			

	}

}
