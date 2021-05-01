import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter first term:");
		float first = input.nextFloat();
		System.out.println("Enter last term:");
		float last = input.nextInt();
		System.out.println("Enter common difference:");
		float diff = input.nextInt();
		float temp=0;
		float sum = first;
		if(first<last){
			for (float x=first; x<last; x=x+diff) {
				temp = sum+(x+diff);
				sum = temp;
			}
		}
		System.out.println(sum);



	}

}
