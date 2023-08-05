package factoryMethod;

public class America implements Ticket{
	
	@Override
	public void emitTicket() {
		System.out.println("This is your american ticket airplane.");
		path();
	}
	
	private void path() {
		System.out.println("Go to A1 gate, the airplane is on the left hand.");
	}

}
