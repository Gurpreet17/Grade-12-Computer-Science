
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test Code for Student class
		String lastName = "Singh";
		int studentNumber = 897163;
		int age = 17;
		double [] marks = {85,78,89,82};
		Student student1 = new Student (lastName, studentNumber, age, marks);
		student1.PrintInfo();
	}

}
class Student {
	private String lastName;
	private int studentNumber;
	private int age;
	private double [] marks = new double [4];
	private double average = 0;
	
	public Student (String lastName, int age, int studentNumber, double [] marks) {
		this.lastName = lastName;
		this.age = age;
		this.studentNumber = studentNumber;
		this.marks = marks;
		for (int x = 0; x< marks.length; x++) {
			average = average + marks[x];
		}
		average = average/marks.length;
	}
	
	public void PrintInfo () {
		System.out.println("Surname:" + "\t\t" + this.lastName);
		System.out.println("Student #" + "\t\t" + this.studentNumber);
		System.out.println ("Age:" + "\t\t\t" + this.age);
		System.out.println("Median:" + "\t\t\t" + this.average);
	} 
	
	public double Marks () {
		return marks[0];
	}
	
	public String StudentName () {
		return lastName;
	}
	
	public int StudentNumber () {
		return studentNumber;
	}
	
	public int StudentAge () {
		return age;
	}
	
	public void EditInfo (String lastName, int age, int studentNumber) {
		this.lastName = lastName;
		this.age = age;
		this.studentNumber = studentNumber;
	}
}
