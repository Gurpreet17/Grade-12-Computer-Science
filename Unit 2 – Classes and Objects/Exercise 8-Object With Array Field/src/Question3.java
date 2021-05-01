import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Main Program
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the class size:");
		int classSize = input.nextInt();
		Classroom classroom = new Classroom (classSize);
		int option = 0;
		boolean exit = false;
		
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
		
		while (exit == false) {
			do {
				System.out.println("\t**Options**");
				System.out.println("1 - Edit student");
				System.out.println("2 - Add student");
				System.out.println("3 - Print class average");
				System.out.println("4 - Print list of students");
				System.out.println("5 - Exit Program");
				option = input.nextInt();
				if (option > 5 && option<1)
					System.out.println("Invalid option, Try again !");
			}
			while (option > 5 && option<1);
			
			if (option == 1) {
				System.out.println("*Option 1 Choosen");
				System.out.println("Fill Out Student Information Form");
				System.out.println("Enter Student name:");
				String name = input.next();
				System.out.println("Enter students age:");
				int age = input.nextInt();
				System.out.println("Enter students student #:");
				int studentNumber = input.nextInt();
				classroom.EditStudent(name, age, studentNumber);
			}
			
			else if (option == 2) {
				System.out.println("*Option 2 Choosen");
				System.out.println("Fill Out Student Information Form");
				System.out.println("Enter Student name:");
				String name = input.next();
				System.out.println("Enter students age:");
				int age = input.nextInt();
				System.out.println("Enter students student #:");
				int studentNumber = input.nextInt();
				System.out.println("Student mark");
				double [] mark = new double [1];
				mark[0] = input.nextDouble();
				Student student = new Student (name, studentNumber, age, mark);
				classroom.insertstudent(student);
			}
			
			else if (option == 3) {
				System.out.println("*Option 3 Choosen");
				System.out.println("The class average is " + classroom.Average());
			}
			
			else if (option == 4) {
				System.out.println("*Option 4 Choosen");
				classroom.printstudent();
			}
			
			else if (option == 5) {
				exit = true;
			}
		}
	}

}
