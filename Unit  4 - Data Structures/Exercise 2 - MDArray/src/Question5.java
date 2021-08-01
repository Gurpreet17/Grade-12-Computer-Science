
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] [] parameter = {{1,1,1,1},{1,1,1,1}};
		System.out.println(sumhaving(parameter));

	}
	
	public static double sumhaving (double[][] parameter) {
		double sum = 0;
		for (int x = 0; x < parameter.length; x++) {
			for (int y = 0; y < parameter[x].length; y++) {
				sum = sum + parameter[x][y];
			}
		}
		return sum;
	}

}
