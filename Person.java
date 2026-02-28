package Student;

abstract class Person {
	int stId;
	String stName;
	String branch;
	public Person(int stId, String stName, String branch) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.branch = branch;
	}
	
	abstract void displayInfo();
}
