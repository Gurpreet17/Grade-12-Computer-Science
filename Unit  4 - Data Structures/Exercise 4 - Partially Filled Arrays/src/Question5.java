
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {54,19,59,98,85,71,86,45,50};
		array = increasefirst(array);
		for (int x = 0; x < array.length; x++)
			System.out.print(array[x] + "\t");

	}
	
	public static int [] increasefirst (int [] array) {
		int [] temp = new int [array.length+1];
		int count = 0;
		for (int x = 1; x < temp.length; x++) { 
			temp[x] = array[count];
			count++;
		}
		return temp;
	} 

}
