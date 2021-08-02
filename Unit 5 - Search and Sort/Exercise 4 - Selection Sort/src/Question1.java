
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"Renee","Brien","Vincent","Doris","Scarlett"};
		selectSort(names);
		for (int x = 0; x < names.length; x++) 
			System.out.println(names[x]);
		

	}
	
	public static void selectSort (String [] list)
	{
		for (int top = list.length -1; top >=0; top --) 
		{
			int largeLoc = 0;
			for (int x = 0; x <= top; x++) 
			{
				if (list[x].charAt(0) > list[top].charAt(0))
					largeLoc = x;
				String temp = list[largeLoc];
				list[largeLoc] = list[top];
				list[top] = temp;
			}
		}
	}

}
