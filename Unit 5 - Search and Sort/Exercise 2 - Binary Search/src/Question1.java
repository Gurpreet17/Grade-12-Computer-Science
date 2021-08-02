
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {23,27,30,34,41,49,51,55,57,60,67,72,78,83,96};
		System.out.println(binSearch(list, 72));
		System.out.println(binSearch(list,41));
		System.out.println(binSearch(list,62));

	}
	
	public static int binSearch (int [] list, int item) {
		int bottom = 0;
		int medium;
		int top = list.length-1;
		int location = -1;
		boolean found = false;
		
		while (!found) {
			medium = (top + bottom)/2;
			if (item == list[medium]) {
				found = true;
				location = medium;
			}
			else if (item > list[medium]) {
				bottom = medium + 1;
			}
			else if (item < list[medium]) {
				top = medium - 1;
			}	
		}
		
		return location;
	}

}
