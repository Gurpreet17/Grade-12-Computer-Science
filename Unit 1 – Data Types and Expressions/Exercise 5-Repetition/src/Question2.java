
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 427000;
		double temp = 0;
		int weeks = 0;
		//Calculating amount of weeks it takes the house to sell
		while (price>376000) {
			temp = price-(price*0.005);
			price=temp;
			weeks++;
		}
		System.out.println("it takes " + weeks + " weeks to sell the house");



	}

}
