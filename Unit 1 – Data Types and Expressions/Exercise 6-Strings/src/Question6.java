
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String digits = "12349456832";
		 int temp=0;
		 int sum =0;
		 for (int x=0; x<digits.length(); x++) {
			 temp = Integer.parseInt(digits.substring(x,x+1));
			 sum = sum+temp;
		 }
		 System.out.println("The cumulative total of " + digits + " is " + sum);


	}

}
