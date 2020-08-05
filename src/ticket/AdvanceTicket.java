package ticket;

public class AdvanceTicket extends Ticket {
	private int advancedays;
	AdvanceTicket(int number, int advancedays){
		super(number);
		this.advancedays = advancedays;
	}
	
	public double getPrice() {
		if(this.advancedays>=30) {
			price *= 0.5;
		}else if(this.advancedays >=10) {
			price *= 0.8;
		}else if(this.advancedays >=5) {
			price *= 0.9;
		}
		return price;
	}
	
	public String toString() {
		return "번호 : " + getNumber() + "의 사전예약일 수 " + this.advancedays + ", 가격 : " + getPrice();
	}
	
}
