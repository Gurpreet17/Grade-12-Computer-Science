
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = {"red", "yellow","green", "red","bleu"};
		String item = "red";
		System.out.println(seqSearch(array,item));

	}
	
	public static int seqSearch (String[] list, String item) 
	{ 
		int location = -1; 
		for (int i = 0; i < list.length; i++) 
		if (list[i] .equals(item)) 
			location = i; 
		return location; 
	}
}
