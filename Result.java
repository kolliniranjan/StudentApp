package Student;

class Result extends Student{

	public Result(int stId, String stName, String branch, int marks) {
		super(stId, stName, branch, marks);
		
	}
	public void displayInfo() {
		super.displayInfo();
		if(getMarks() >= 50) {
			System.out.println("Result = PASS");
		}
		else {
			System.out.println("Result = FAIL");
		}
	}
	
}
