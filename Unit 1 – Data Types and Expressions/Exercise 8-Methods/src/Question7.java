import java.util.Scanner;
import java.io.*;
public class Question7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		FileOutputStream fos = new FileOutputStream("./sales.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		double items = 1;
		double subtotal = 0;
		double remove = 0;
		double discount = 0;
		double tax = 0;
		double total = 0;
		while (items!= 0) {
			System.out.println("Enter a positive $ amount:");
			items = input.nextDouble();
			dos.writeDouble(+items);
			subtotal = subtotal + items;
		}
		System.out.println("Subtotal: $" + subtotal);
		System.out.println("Enter a positive $ amount, removes this amount:");
		remove= input.nextDouble();
		if (remove<subtotal) {
			subtotal = subtotal - remove;
			dos.writeDouble(remove);
		}
		subtotal = Discount(subtotal);
		tax  = subtotal*0.13;
		total = subtotal + tax;
		dos.writeDouble(total);
		System.out.println("Total: $" + total);
		dos.close();
	}
	
	public static double Discount (double subtotal) {
		double discount;
		if (subtotal>=200) {
			discount = (subtotal*0.15);
			subtotal = subtotal - discount;
		}
		else if (subtotal>100) {
			discount = subtotal - (subtotal*0.10);
			subtotal = subtotal - discount;
		}
		return subtotal;
	}

}
