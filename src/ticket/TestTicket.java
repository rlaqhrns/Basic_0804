package ticket;

public class TestTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket ticket = new Ticket(001);
		
		System.out.println(ticket);
		
		AdvanceTicket advance = new AdvanceTicket(20,3);
		advance.setPrice(100000);
		AdvanceTicket advance1 = new AdvanceTicket(100, 30);
		
		System.out.println(advance);
		System.out.println(advance1);
		System.out.println("한글");
		
	}

}
