
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {3,8,3,2,7,5};
		bubbleSort (list);
		for (int x = 0; x < list.length; x++)
			System.out.print(list[x] + "\t");
		
	}

	public static void bubbleSort(int [] list) {
		boolean sorted = false;
		for (int top = list.length - 1; !sorted && top > 0; top--) {
			sorted = true;
			for (int i = 0; i < top; i++) {
				if (list[i] < list[i+1]) {
					sorted = false;
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
				}
			}
		}
	}
}
