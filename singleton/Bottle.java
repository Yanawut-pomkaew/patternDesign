package singleton;

public class Bottle {
	
	private static Bottle instance = new Bottle();
	private float water = 0f;
	
	private Bottle() {}
	
	public static Bottle getInstance() {
		return instance;
	}
	
	public void openBottle() {
		System.out.println("open bottle.");
	}
	
	public void closeBottle() {
		System.out.println("close bottle.");
	}
	
	public void filledBottle(float water) {
		System.out.println("fill bottle " + water + " ml.");
	}
	
}
