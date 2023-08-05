package factoryMethod;

public class main {

	public static void main(String[] args) {
		

		Receptionist receptionist = new Receptionist();
		
		Ticket queue1 = receptionist.buy("America");
		queue1.emitTicket();
		
		System.out.println("");
		Ticket queue2 = receptionist.buy("Japan");
		queue2.emitTicket();
		
		System.out.println("");
		Ticket queue3 = receptionist.buy("Thailand");
		queue3.emitTicket();
	}

}
