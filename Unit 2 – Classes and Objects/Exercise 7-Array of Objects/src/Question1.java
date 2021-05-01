
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child[] patient = new Child[4];
		
		for (int i = 0; i < patient.length; i++) { 
		 patient[i] = new Child(); 
		} 
		
		patient[0].Mutator("Gurpreet", 17, 185.928, 'M');
		patient[1].Mutator("Tvisha", 17, 161.544, 'F');
		patient[2].Mutator("Rehan", 17, 178.308, 'M');
		patient[3].Mutator("Shaub", 16, 176.784, 'M');
		
		for (int x = 0; x<patient.length; x++) {
			patient[x].Accessor();
		}
		System.out.println("\t*Parallel Arrays*");
		String [] names = {"Gurpreet", "Tvisha", "Rehan", "Shaub"};
		int [] age = {17,17,17,16};
		double [] height = {185.928, 161.544, 178.308, 176.784};
		char [] sex = {'M', 'F', 'M', 'M'};
		Child.ParallelArrays(names, age, height, sex);
		
		
		

	}

}

class Child {
	private String name; // family, given 
	private int age; // in years 
	private double height; // in centimeters 
	private char sex; // M or F 
	
	/*
	 * This method is used to access private fields
	 * pre: none
	 * post: Outputs the array for each student 
	 */
	public void Accessor () {
		System.out.println(this.name);
		this.height = Math.round(height);
		System.out.println (this.age + " " + this.height + " " + this.sex);
	}
	
	/*
	 * Thus method is used to change/assign the values of private fields
	 * pre: names, age, height, sex
	 * post: none
	 */
	public void Mutator (String n, int a, double h, char s) {
		this.name = n;
		this.age = a;
		this.height =h ;
		this.sex = s;
	}
	
	/*
	 * This method outputs information using parallel arrays
	 * pre: name, age, height, sex
	 */
	public static void ParallelArrays (String [] n, int [] a, double [] h, char[] s) {
		for (int x = 0; x < 4; x++) {
			System.out.println(n[x]);
			System.out.print(a[x] + " " + h[x] + " " + s[x] + "\n");
		}
	}
}
