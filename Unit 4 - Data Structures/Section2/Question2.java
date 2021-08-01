package Section2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SIZE = 5;
		int[] sample = new int[SIZE];
		
		//PART A
		for (int x = 0; x < SIZE; x++) {
			sample[x] = 1;
		}
		
		//PART B
		sample[0] = 5;
		
		//PART C
		for (int x = 0; x < SIZE; x++) {
			sample[x] = Math.abs(sample[x]);
		}
		
		//PART D
		int sampleSum = 0;
		for (int x = 0; x < SIZE; x++) {
			sampleSum = sampleSum + sample[x];
		}
		
		//PART E
		for (int x = 0; x < SIZE; x++) {
			if (x % 2 != 0)
				System.out.println(sample[x]);
		}
		
		
	}

}
