
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int [10];
		int [] shift = new int [10];
		int random;
		
		for (int x = 0; x<array.length; x++) {
			random = (int) (1 + Math.random() * 100);
			array[x] = random;
		}
		
		for (int x = 0; x+1<array.length; x++) {
			shift [x] = array[x+1];
		}
		shift [9] = array[0];
		
		System.out.print("Before transformation: ");
		for (int x = 0; x<array.length; x++) {
			System.out.print(array[x] + " ");
		}
		
		System.out.println();
		
		System.out.print("After transformation: ");
		for (int x = 0; x<array.length; x++) {
			System.out.print(shift[x] + " ");
		}
		

	}

}
