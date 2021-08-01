import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the size of the classroom");
		int size = input.nextInt();
		
		Classroom classroom = new Classroom (size);
		
		for (int x = 0; x < size; x++) {
			Student student = new Student();
			System.out.println("Enter the name of student " + (x+1));
			String name = input.next();
			System.out.println("Enter the age of student " + (x+1));
			int age = input.nextInt();
			System.out.println("Enter the student # of student " + (x+1));
			int studentNumber = input.nextInt();
			double marks [] = new double [4];
			for (int y = 0; y < 4; y++) {
				System.out.println("Enter student's mark " + (y+1));
				marks[y] = input.nextDouble();
			}
			
			student.editName(name);
			student.editAge(age);
			student.editStudentNumber(studentNumber);
			student.editMarks(marks);
			classroom.insertstudent(student);
		}
		
		System.out.println("\t\t*MENU*");
		System.out.println("1 - Edit student (search by student number)");
		System.out.println("2 - Add student");
		System.out.println("3 - Print class average");
		System.out.println("4 - Print list of students");
		System.out.println("Enter option from the following MENU:");
		int option;
		do {
			option = input.nextInt();
			if (option > 4 || option < 1) {
				System.out.println("Invalid option");
				System.out.println("Please enter an option from the menu between 1 -4 ");
			}
		}
		while (option > 4 || option < 1);
		
		if (option == 1) {
			System.out.println ("Enter student number of the student you wish to edit");
			int studentNumber = input.nextInt();
			int studentIndex = 0;
			for (int x = 0; x < classroom.student.length; x++) {
				if (studentNumber == classroom.student[x].displayStudentNumber()) {
					studentIndex = x;
					break;
				}
				else {
					studentIndex = -1;
				}
			}
			
			if (studentIndex >= 0) {
				System.out.println("\t\t*ENTER EDIT*");
				System.out.println("1 - Edit Name");
				System.out.println("2 - Edit Age");
				System.out.println("3 - Edit Student Number");
				System.out.println("4 - Edit Average");
				do {
					option = input.nextInt();
					if (option > 4 || option < 1 ) {
						System.out.println("Invalid option");
						System.out.println("Please enter a valid option between 1 - 4");
					}
				}
				while (option > 4 || option < 1);
				
				if (option == 1) {
					System.out.println ("Enter student new Name:");
					String name = input.next();
					classroom.student[studentIndex].editName(name); 
				}
				else if (option == 2) {
					System.out.println ("Enter student new Age:");
					int age = input.nextInt();
					classroom.student[studentIndex].editAge(age);
				}
				else if (option == 3) {
					System.out.println ("Enter student new Student Number:");
					studentNumber = input.nextInt();
					classroom.student[studentIndex].editStudentNumber(studentNumber);
				}
				else if (option == 4) {
					System.out.println ("Enter student new Average:");
					double average = input.nextDouble();
					classroom.student[studentIndex].editAverage(average);
				}
				System.out.println("Student successfully edited");	
			}
		}
		
		else if (option == 2) {
			Student student = new Student();
			System.out.println("Enter the name of student:");
			String name = input.next();
			System.out.println("Enter the age of student:");
			int age = input.nextInt();
			System.out.println("Enter the student # of student:");
		    int studentNumber = input.nextInt();
			double marks [] = new double [4];
			for (int y = 0; y < 4; y++) {
				System.out.println("Enter student's mark " + (y+1));
				marks[y] = input.nextDouble();
			}
			
			student.editName(name);
			student.editAge(age);
			student.editStudentNumber(studentNumber);
			student.editMarks(marks);
			classroom.insertstudent(student);
		}
		
		else if (option == 3) {
			System.out.println("The class average is " + classroom.average() + "%");
		}
		else if (option == 4) {
			System.out.println("\t\t*Student List*");
			for (int x = 0; x < classroom.student.length; x++) 
				System.out.println((x+1) + " - " + classroom.student[x].displayName());
		}
	}
}
