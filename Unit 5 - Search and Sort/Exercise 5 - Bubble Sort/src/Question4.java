
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {2,9,4,6,1,7};
		shakerSort (list);
		for (int x = 0; x < list.length; x++)
			System.out.print(list[x] + "\t");
	}
	
	public static void shakerSort(double [] list) {
		boolean sorted = false;
		for (int top = list.length - 1; !sorted && top > 0; top--) {
			sorted = true;
			if (list[top] % 2 == 0) {
				for (int i = top; i  >= 1; i--) {
					if (list[i] < list[i - 1]) {
						sorted = false;
						double temp = list[i];
						list[i] = list[i - 1];
						list[i-1] = temp;
					}
				}
			}
			else {
				for (int i = 0; i < top; i++) {
					if (list[i] > list[i+1]) {
						sorted = false;
						double temp = list[i];
						list[i] = list[i+1];
						list[i+1] = temp;
					}
				}
			}
		}
	}

}
