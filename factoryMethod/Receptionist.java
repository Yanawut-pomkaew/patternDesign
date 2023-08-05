package factoryMethod;

public class Receptionist{
	
	public Ticket buy(String location) {
		
		if(location.equals("America")) {
			return new America();
		}else if(location.equals("Japan")) {
			return new Japan();
		}else if(location.equals("Thailand")) {
			return new Thailand();
		}
		
		return null;
		
	}

}
