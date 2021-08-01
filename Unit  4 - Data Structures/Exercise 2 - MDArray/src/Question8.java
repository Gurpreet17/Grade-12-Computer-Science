
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][][] parameter = new int [4][4][4];
		//Sets all the elements of the array to 1
		for (int x = 0; x < parameter.length; x++) {
			for (int y = 0; y < parameter[x].length; y++) {
				for (int z = 0; z < parameter[x][y].length; z++) {
					parameter[x][y][z] = 1;
				}
			}
		}
		System.out.println(size(parameter));

	}
	
	public static int size (int [][][] parameter) {
		int size = 0;
		for (int x = 0; x < parameter.length; x++) {
			for (int y = 0; y < parameter[x].length; y++) {
				for (int z = 0; z < parameter[x][y].length; z++) {
					size++;
				}
			}
		}
		return size;
	}
}
