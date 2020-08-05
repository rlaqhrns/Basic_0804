package ticket;

public class TicketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WalkupTicket wticket = new WalkupTicket(5,true);
		wticket.setPrice(100000);
		
		System.out.println(wticket);
		
		AdvanceTicket aticket1 = new AdvanceTicket(7, 200);
		
		aticket1.setPrice(100000);
		
		System.out.println(aticket1);
		
		AdvanceTicket aticket2 = new AdvanceTicket(9, 700);
		
		
		aticket2.setPrice(100000);
		
		System.out.println(aticket2);
	}

}
