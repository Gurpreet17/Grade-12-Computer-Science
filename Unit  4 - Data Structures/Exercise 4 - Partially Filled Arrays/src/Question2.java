
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample = {54,19,59,98,85,71,86,45,50};
		int [] reverse = new int [sample.length];
		int count = 0;
        for (int x = sample.length - 1; x >= 0; x--) {
			reverse[count] = sample[x];
			count++;
		}
		
        sample = reverse;
		for (int x = 0; x < sample.length; x++) {
			System.out.print(sample[x] + "\t");
		}

	}

}
