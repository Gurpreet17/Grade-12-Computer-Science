
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample = {54,19,59,98,85,71,86,45,50};
		int [] sample3 = new int [sample.length + 1];
		
		for (int x =0; x < sample.length; x++) {
			sample3 [x] = sample[x];
		}
		
		for (int x =0; x < sample3.length; x++) {
			System.out.print(sample3[x] + "\t");
		}

	}

}
