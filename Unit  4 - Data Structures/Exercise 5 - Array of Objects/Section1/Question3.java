package Section1;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction [] fraction = new Fraction [100];
		for (int i = 0; i < fraction.length; i++) {
			fraction[i] = new Fraction (i, i+1);
		}
	}

}
class Fraction
{
   private int num;
   private int den;
   
   public Fraction (int n, int d)
   {
	num = n;
	den = d;
   }
}
