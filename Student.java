package Student;

class Student extends Person {
	private int marks;

	public Student(int stId, String stName, String branch, int marks) {
		super(stId, stName, branch);
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void displayInfo() {
		System.out.println("Student ID = " + stId);
		System.out.println("Student Name = " + stName);
		System.out.println("Student Branch = " + branch);
		System.out.println("Student Marks = " + marks);
	}
}
