
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] array = {"red", "yellow","green", "red","bleu"};
		String item = "red";
		System.out.println(seqSearch(array,item));
	}
	
	public static int seqSearch (String[] list, String item)
	{ 
		int location = -1; 
		boolean found = false; 
		for (int i = list.length-1; i >= 0 && !found; i--) 
			if (list[i] .equals (item)) 
			{ 
				location = i; 
				found = true; 
			} 
		return location; 
	}


}
