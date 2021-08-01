
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {54,19,59,98,85,71,86,45,50};
		array = increaselast(array);
		for (int x = 0; x < array.length; x++)
			System.out.print(array[x] + "\t");

	}
	
	public static int [] increaselast (int [] array) {
		int [] temp = new int [array.length+1];
		for (int x = 0; x < array.length; x++) 
			temp[x] = array[x];
		
		return temp;
	} 

}
