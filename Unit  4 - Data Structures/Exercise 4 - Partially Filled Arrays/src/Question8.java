
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {54,19,59,98,85,71,86,45,50};
		array = removelast(array);
		for (int x = 0; x < array.length; x++)
		System.out.print(array[x] + "\t");
	}
	
	public static int [] removelast (int [] array) {
		int [] temp = new int [array.length-1];
		for (int count = 0, x = 0; x < temp.length; x++,count++) 
			temp[x] = array[count];
		return temp;
	}

}
