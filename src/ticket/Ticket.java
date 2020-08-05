package ticket;

public class Ticket {

	protected int number;
	protected double price;


	public Ticket(int number) {
		this.number = number;

	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		String result;
		result = "번호 : " + number + ", 가격 : " + price;
		return result;
	}

}