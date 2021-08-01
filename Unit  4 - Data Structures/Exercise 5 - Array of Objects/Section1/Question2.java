package Section1;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of patient:");
		int size = input.nextInt();
		Child[] patient = new Child[size];
		
		//PART B
		for (int i = 0; i < size; i++) {
			System.out.println("Enter patient " + (i+1) + " name:");
			String name = input.next();
			System.out.println("Enter patient " + (i+1) + " age:");
			int age = input.nextInt();
			System.out.println("Enter patient " + (i+1) + " height:");
			double height = input.nextDouble();
			System.out.println("Enter patient " + (i+1) + " sex:");
			char sex = input.next().charAt(0);
			patient[i] = new Child (name,age,height,sex);
			patient[i].print();
		}
		
		
		//PART C
		String [] name = new String [size];
		int [] age = new int [size];
		double [] height = new double [size];
		char [] sex = new char [size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter patient " + (i+1) + " name:");
			String n = input.next();
			name [i] = n;
			System.out.println("Enter patient " + (i+1) + " age:");
			int a = input.nextInt();
			age[i] = a;
			System.out.println("Enter patient " + (i+1) + " height:");
			double h = input.nextDouble();
			height[i] = h;
			System.out.println("Enter patient " + (i+1) + " sex:");
			char s = input.next().charAt(0);
			sex [i] = s;
		}
		
	}
}

class Child
{
   private String name;	//family, given
   private int age;	//in years
   private double height;	//in metres
   private char sex;	//M or F
   
   public Child (String name, int age, double height, char sex) {
	   this.name = name;
	   this.age = age;
	   this.height = height;
	   this.sex = sex;
   }
   
   public void print () {
	   System.out.println("NAME - " + name);
	   System.out.println("AGE - " + age  + "\t" + "HEIGHT - " + height + "\t" + "SEX - " + sex);
   }
   
   
}
