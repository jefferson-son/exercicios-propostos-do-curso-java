package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double finalGrade() {
		return note1 + note2 + note3;
	}
	
	public String toString() {
		return "FINAL GRADE = "
			+ String.format("%.2f", finalGrade());
	}
}
