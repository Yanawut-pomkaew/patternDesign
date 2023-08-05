package factoryMethod;

public class Japan implements Ticket{
	@Override
	public void emitTicket() {
		System.out.println("This is your japan ticket airplane.");
		path();
	}
	
	private void path() {
		System.out.println("Go to B2 gate, the airplane is on the left hand.");
	}
}
