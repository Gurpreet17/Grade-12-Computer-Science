
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PART A
		double[][] first = new double[25][40];
		int count = 0;
		for (int x = 0; x < first.length; x++) {
			for (int y = 0; y < first[x].length; y++) {
				count++;
			}
		}
		System.out.println(count);
		
		//PART B
		boolean[][][] second = new boolean[3][6][50];
		count = 0;
		for (int x = 0; x < second.length; x++) {
			for (int y = 0; y < second[x].length; y++) {
				for (int z = 0; z < second[x][y].length; z++) {
					count++;
				}
				
			}
		}
		System.out.println(count);
		
		//PART C
		char[][] third = new char[60][40];
		count = 0;
		for (int x = 0; x < third.length; x++) {
			for (int y = 0; y < third[x].length; y++) {
				count++;
			}
		}
		System.out.println(count);
		
		long[][][] fourth = new long[5][10][20];
		count = 0;
		for (int x = 0; x < fourth.length; x++) {
			for (int y = 0; y < fourth[x].length; y++) {
				for (int z = 0; z < fourth[x][y].length; z++) {
					count++;
				}
				
			}
		}
		System.out.println(count);
		

	}

}
