package Section2;

import java.util.Scanner;

import javax.imageio.IIOException;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of students:");
		int count = Math.abs(input.nextInt());
		Student [] student = new Student[count];
		
		for (int x = 0; x < count; x++) {
			student [x] = new Student();
			System.out.println("Enter student " + (x+1) + " name:");
			String name = input.next();
			System.out.println("Enter student " + (x+1) + " age:");
			int age = input.nextInt();
			System.out.println("Enter student " + (x+1) + " student #:");
			int studentNumber = input.nextInt();
			System.out.println("Enter student " + (x+1) + " average:");
			int average = input.nextInt();
			student[x].editName(name);
			student[x].editAge (age);
			student[x].editStudentNumber(studentNumber);
			student[x].editAverage(average);
		}
		
		System.out.println("\t\t*MENU*");
		System.out.println("1 - Edit student (search by student number)");
		System.out.println("2 - Print average of all students");
		System.out.println("3 - Print list of students");
		
		int option;
		do {
			option = input.nextInt();
			if (option > 3 || option < 1 ) {
				System.out.println("Invalid option");
				System.out.println("Please enter a valid option between 1 - 3");
			}
		}
		while (option > 3 || option < 0);
		
		if (option == 1) {
			System.out.println ("Enter student number of the student you wish to edit");
			int studentNumber = input.nextInt();
			int studentIndex = 0;
			for (int x = 0; x < student.length; x++) {
				if (studentNumber == student[x].displayStudentNumber()) {
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
						System.out.println("Please enter a vlid option between 1 - 4");
					}
				}
				while (option > 4 || option < 1);
				
				if (option == 1) {
					System.out.println ("Enter student new Name:");
					String name = input.next();
					student[studentIndex].editName(name); 
				}
				else if (option == 2) {
					System.out.println ("Enter student new Age:");
					int age = input.nextInt();
					student[studentIndex].editAge(age);
				}
				else if (option == 3) {
					System.out.println ("Enter student new Student Number:");
					studentNumber = input.nextInt();
					student[studentIndex].editStudentNumber(studentNumber);
				}
				else if (option == 4) {
					System.out.println ("Enter student new Average:");
					double average = input.nextDouble();
					student[studentIndex].editAverage(average);
				}
				System.out.println("Student successfully edited");	
			}
		}
		else if (option == 2) {
			double average = 0;
			for (int x = 0; x < student.length; x++) {
				average = average + student[x].displayAverage();
			}
			average = average/student.length;
			System.out.println("The average of all students is " + average + "%");
		}
		else if (option == 3) {
			System.out.println("\t\t*STUDENT LIST*");
			for (int x = 0; x < student.length; x++){
				System.out.println((x+1) + " - " + student[x].displayName());
			}
		}
		

	}

}
