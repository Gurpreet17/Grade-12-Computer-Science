
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] terms = new double [6];
		int numerator = 1;
		int denominator = 2;
		
		for (int x = 0; x < terms.length; x++) {
			terms[x] = numerator/denominator;
			System.out.println("t" + (x+1) + " " + numerator + "/" + denominator);
			numerator = numerator + 1;
			denominator = denominator + 1;
		}
	}
}
