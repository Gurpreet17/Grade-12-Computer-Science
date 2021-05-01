
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int calculation;
		for (int x=1; x<=6; x++) {
			System.out.print(x + " times table\t");
			for (int y=1; y<=6; y++) {
				calculation = x*y;
				System.out.print(calculation + "\t");
			}
			System.out.println();
		}


	}

}
