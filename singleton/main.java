package singleton;

public class main {

	public static void main(String[] args) {
		
		Bottle bottle = Bottle.getInstance();
		
		bottle.openBottle();
		bottle.filledBottle(20);
		bottle.closeBottle();
		

	}

}
