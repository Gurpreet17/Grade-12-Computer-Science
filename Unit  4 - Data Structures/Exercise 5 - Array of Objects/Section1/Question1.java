package Section1;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex[] points = new Complex [100];
		for (int i = 0; i < points.length; i++) {
			points [i] = new Complex(1+i, 1+i);
		}
		

	}

}

class Complex
{
   private double re;
   private double im;
   
   public Complex(double re, double im) {
	   this.re = re;
	   this.im = im;
   }
   
}
