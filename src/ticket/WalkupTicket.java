package ticket;

public class WalkupTicket extends Ticket{
	private boolean payByCredit;

	public boolean getPayByCredit() {
		return payByCredit;
	}
	
	
	public WalkupTicket(int number, boolean payByCredit) {
		super(number);
		this.payByCredit = payByCredit;
	}
	public String toString() {
		return super.toString() + "pay by credit : " + getPayByCredit();
	}
}
