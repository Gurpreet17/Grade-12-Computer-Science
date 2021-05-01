
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction [] fraction = new Fraction [100];
		
		for (int x = 0; x + 1 <= fraction.length; x++) {
			fraction[x] = new Fraction (x,x+1);
			fraction[x].Accessor();
		}

	}

}

class Fraction { 
	  private int num; 
	  private int den; 
	  
	  public Fraction (int n, int d) { 
		    num = n; 
		    den = d;
	  }
	  
	  /*
	   * This method outputs the values of num/den from the object array
	   * pre: none
	   * post: outputs num/den stored in array 
	   */
	  public void Accessor () {
		  System.out.print(num +"/" + den + " ");
	  }
} 

