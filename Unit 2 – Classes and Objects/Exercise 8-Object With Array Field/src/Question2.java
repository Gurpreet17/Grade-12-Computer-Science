import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Code for Classroom class
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of students:");
		int classSize = input.nextInt();
		Classroom classroom = new Classroom (classSize);
		
		for (int x = 0; x < classSize; x++) {
			System.out.println("Student " + (x+1) + " name:");
			String name = input.next();
			System.out.println ("Student " + (x+1) + " student #:");
			int studentNumber = input.nextInt();
			System.out.println("Student " + (x+1) + " age:");
			int age = input.nextInt();
			System.out.println("Student " + (x+1) + " mark");
			double [] mark = new double [1];
			mark[0] = input.nextDouble();
			Student student = new Student (name, studentNumber, age, mark);
			classroom.list[x] = student; 
		}
		System.out.println("The class average is: " + classroom.Average() + "%");
		classroom.printstudent();
	}

}

class Classroom {
	
	String classCode;
	Student [] list;
	double average;
	String lastName;
	
	public Classroom (int y) {
		classCode = "ICS4U0";
		list = new Student [y];
		average = 0;
	}
	
	public double Average () {
		average = 0;
		for (int x = 0; x < list.length; x++) {
			average  = list[x].Marks() + average;
		}
		average = average/list.length;
		return average;
	}
	

	public void  insertstudent (Student s) {
		Student [] newList = new Student [list.length+1]; 
		for (int x = 0; x < list.length; x++) {
			newList[x] = list[x];
		}
		newList [newList.length-1] = s;
		list = newList;
	}
	
	public void printstudent () {
		System.out.println("Students List");
		for (int x = 0; x < list.length; x++) 
			System.out.println("Student " + (x+1) + " - " + list[x].StudentName());
	}
	
	public void EditStudent (String name, int age, int studentNumber) {
		Scanner input = new Scanner (System.in);
		int userOption = 0;
		int studentIndex = 0;
		for (int x = 0; x < list.length; x++) {
			if (list[x].StudentName().equals(name) && list[x].StudentNumber() == studentNumber && list[x].StudentAge() == age) {
				studentIndex = x;
				do {
				System.out.println("What changes would you like to make to " + name + " account");
				System.out.println("Options:");
				System.out.println("1 - Edit name");
				System.out.println("2 - Edit age");
				System.out.println("3 - Edit student Number");
				userOption = input.nextInt();
				if (userOption > 3 &&  userOption < 1)
					System.out.println("Invalid option, please enter an valid option !");
				}
			while (userOption > 3 && userOption < 1);
			}	
		}
		
		if (studentIndex == -1) {
			System.out.println("This student cannot be found in our system !");
		}
		else {
			if (userOption == 1) {
				System.out.println("Enter new name for " + name);
				String newName = input.next();
				list[studentIndex].EditInfo(newName, age, studentNumber); 
			}
			else if (userOption == 2) {
				System.out.println("Enter new age for " + name);
				int newAge = input.nextInt();
				list[studentIndex].EditInfo(name, newAge, studentNumber);
			}
			else if (userOption == 3) {
				System.out.println("Enter new student # for " + name);
				int newStudentNumber = input.nextInt();
				list[studentIndex].EditInfo(name, age, newStudentNumber);
			}
			System.out.println("New student information");
			System.out.println("Name - " + list[studentIndex].StudentName());
			System.out.println("Age - " + list[studentIndex].StudentAge());
			System.out.println("Student # - " + list[studentIndex].StudentNumber());
		}
	}
}