import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float price=0;
		float temp=0;
		while (price>=0){
			temp = temp + price;
			System.out.println("Enter price:");
			price = input.nextFloat();
		}
		System.out.println(temp);

	}

}
