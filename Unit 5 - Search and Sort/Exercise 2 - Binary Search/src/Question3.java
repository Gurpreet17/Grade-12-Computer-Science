
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {96,83,78,72,67,60,57,55,51,49,41,34,30,27,23};
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
		
		while (!found && bottom <= top) {
			medium = (top + bottom)/2;
			if (item == list[medium]) {
				found = true;
				location = medium;
			}
			else if (item < list[medium]) {
				bottom = medium + 1;
			}
			else if (item > list[medium]) {
				top = medium - 1;
			}	
		}
		int difference = list[0];
		 if (location == -1) {
			 for (int x = 0; x < list.length; x++) {
				int temp = Math.abs(list[x] - item);
				if (difference > temp) {
					difference = temp;
					location = x;
				}
			 }
		 }
		return location;
		
	}
}
