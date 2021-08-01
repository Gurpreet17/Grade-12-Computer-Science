
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] parameter = {{1,2,3}, {4,5,6}};
		print(parameter);
	}
	
	public static void print (int [][] parameter) {
		for (int x = 0; x < parameter.length; x++) {
			for (int y = 0; y < parameter[x].length; y++) {
				System.out.print(parameter[x][y] + "\t");
			}
			System.out.println();
		}
	}

}
