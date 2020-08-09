package class0805;

public abstract class TaxPayer {
	protected String name;
	protected int number;

	public TaxPayer(String name, int number) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public abstract double computeTax();

	public String toString() {
		return "name : " + name + "\nnumber : " + number;
	}
}
