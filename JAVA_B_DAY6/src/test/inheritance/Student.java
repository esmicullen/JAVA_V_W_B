package test.inheritance;

public class Student extends person {
	int stuId;
	int gra;
	int ban;
	
	public void study() {
		System.out.println("공부");
	}
	
	public void play() {
		System.out.println("논다");
	}
}
