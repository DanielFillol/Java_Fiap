package staticMod;

public class TicketGate {
	
	private static int totalTickets;

	private String name;
	
	public void enter(String name) {
		this.name = name;
		totalTickets = totalTickets + 1;
	}
	
	public static int getTotalTickets() {
		return totalTickets;
	}
	
	public static void setTotalTickets(int totalTickets) {
		TicketGate.totalTickets = totalTickets;
	}
	
	
}
