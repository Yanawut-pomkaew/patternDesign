package factoryMethod;

public class Thailand implements Ticket{
	@Override
	public void emitTicket() {
		System.out.println("This is your Thailand ticket airplane.");
		path();
	}
	
	private void path() {
		System.out.println("Go to A2 gate, the airplane is on the right hand.");
	}
}
