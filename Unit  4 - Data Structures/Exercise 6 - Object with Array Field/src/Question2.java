
class Classroom {
	String classCode;
	Student [] student;
	double classAverage;
	
	/*
	 * This constructor initializes the class fields 
	 * pre: none
	 * psot: none
	*/
	public Classroom (int y) {
		classCode = "ICS4U0";
		student = new Student [y];
		classAverage = 0;
	}
	
	/*
	 *This method calculates and returns the class average
	 *pre : none
	 *post: class average 
	*/
	public double average () {
		int average = 0;
		for (int x = 0; x < student.length; x++) {
			classAverage = classAverage + student[x].displayAverage();
		}
		classAverage = classAverage/student.length;
		return classAverage;
	} 
	
	/*
	 *This method inserts students into the array
	 *pre : student 
	 *post: none
	*/
	public void insertstudent (Student s) {
		Student [] list = null;
		if (student[student.length-1] == null) {
			list = new Student [student.length];
			for (int x = 0; x < student.length; x++) {
				if (student[x] == null) {
					list[x] = s;
					break;
				}
				else
					list[x] = student[x];
			}
				
		}
		else {
			list = new Student [student.length + 1];
			for (int x = 0; x < student.length; x++)
				list[x] = student[x];
			list[student.length-1] = s;
		}
		student = list;
		
	} 
	
	/*
	 *This method sorts the list of students by their average in order from highest to lowest.
	 *pre : none
	 *post: none 
	*/
	public void sort () {
		for (int x = 0; x < student.length; x++) {
			for (int y = 0; y < student.length-1; y++) {
				if (student[y].displayAverage() > student[y+1].displayAverage()) {
					Student temp = student[y+1];
					student[y+1] = student[y];
					student[y] = temp;
				}
			}
		}
	}
	
	/*
	 *This method prints the name of all students in the class
	 *pre : none
	 *post: Prints students name 
	*/
	public void printstudent() {
		for (int x = 0; x < student.length; x++) {
			System.out.println((x+1) + " - " + student[x].displayName());
		}
	} 
	
}
