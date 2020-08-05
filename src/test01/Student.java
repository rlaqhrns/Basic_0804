package test01;

public class Student {
	protected String name;
	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Student() {
		name = "";
		number = 0;
		
	}

	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String result;
		result = "name : " + getName() + ", StudentCode : " + getNumber();
		return result;
	}
	public boolean equals(Student other) {
		// TODO Auto-generated method stub
		
		return (this.name.equals(other.name)&& (this.number == other.number));
	}
	

}