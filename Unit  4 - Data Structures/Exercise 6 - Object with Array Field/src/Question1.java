class Student {
	String lastName;				 //Stores student last name
	int age;						 //Stores student age
	int studentNumber;				 //Stores student student number
	double [] marks = new double[4]; //Stores student 4 marks
	double average;					 //Stores student average
	
	/*
	 * This constructor initializes the class fields 
	 * pre: none
	 * psot: none
	*/
	public Student () {
		lastName = "MRSX";
		age = 18;
		studentNumber = 555555;
		for (int x = 0; x < marks.length; x++)
			marks[x] = 0;
	}
	
	/*
	 *This accessor method returns the last name of the student
	 *pre : none
	 *post: last name 
	*/
	public String displayName () {
		return lastName;
	}
	
	/*
	 *This accessor method returns the age of the student
	 *pre : none
	 *post: age 
	*/
	public int displayAge () {
		return age;
	}
	
	/*
	 *This accessor method returns the student number of the student
	 *pre : none
	 *post: student number  
	*/
	public int displayStudentNumber () {
		return studentNumber;
	}
	
	/*
	 *This accessor method returns the average of the student
	 *pre : none
	 *post: average 
	*/
	public double displayAverage () {
		for (int x = 0; x < marks.length; x++) {
			average = average + marks[x];
		}
		average = average/marks.length;
		return average;
	}
	
	/*
	 *This mutator method edits the name of the student
	 *pre : name
	 *post: none 
	*/
	public void editName (String name) {
		lastName = name;
	}
	
	/*
	 *This mutator method edits the age of the student
	 *pre : age
	 *post: none 
	*/
	public void editAge (int age) {
		if (age <= 0)
			this.age = 18;
		else
			this.age = age;
	}
	
	/*
	 *This mutator method edits the student number of the student
	 *pre : student number
	 *post: none 
	*/
	public void editStudentNumber (int number) {
		if (number < 0)
			studentNumber = Math.abs(number);
		else 
			studentNumber = number;
	}
	
	/*
	 *This mutator method edits the 4 marks of the student
	 *pre : marks array 
	 *post: none 
	*/
	public void editMarks (double [] m) {
		for (int x = 0; x < marks.length; x++) {
			marks[x] = m[x];
		}
	}
	
	/*
	 *This mutator method edits the average of the student
	 *pre : average
	 *post: none 
	*/
	public void editAverage (double average) {
		if (average > 100 || average < 0)
			average = 0;
		else 
			this.average = average;
	}
}
