package staticMod;

public class Test {

	public static void main(String[] args) {
		
		TicketGate c1 = new TicketGate();
		TicketGate c2 = new TicketGate();
		TicketGate c3 = new TicketGate();
		
		c1.enter("Daniel");
		c2.enter("Fernanda");
		c3.enter("Elaine");
		
		int enters = TicketGate.getTotalTickets();
		System.out.println(enters);

	}

}
