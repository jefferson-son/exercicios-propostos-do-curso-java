package entities;

public class People {

	private double height;
	private char gener;

	public People() {
	}

	public People(double height, char gener) {
		this.height = height;
		this.gener = gener;
	}

	public double getHeight() {
		return height;
	}

	public void setHeigth(double height) {
		this.height = height;
	}

	public char getGener() {
		return gener;
	}

	public void setGener(char gener) {
		this.gener = gener;
	}

}
