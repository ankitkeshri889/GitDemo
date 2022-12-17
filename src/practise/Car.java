package practise;

public class Car extends Vehicle {

	private boolean isHatchback;
	private boolean ledScreen;
	private int tankCapacity;

	public Car() {
		super();
	}

	public Car(String type, String color, String company, String model, boolean isAutomatic, int price, int engineCC,
			boolean isHatchback, boolean ledScreen, int tankCapacity) {
		super(type, color, company, model, isAutomatic, price, engineCC);
		this.isHatchback = isHatchback;
		this.ledScreen = ledScreen;
		this.tankCapacity = tankCapacity;
	}

	public String getType() {
		return "The type of Vehicle chosen is "+super.getType();
	}
	
	public boolean isHatchback() {
		return isHatchback;
	}

	public void setHatchback(boolean isHatchback) {
		this.isHatchback = isHatchback;
	}

	public boolean isLedScreen() {
		return ledScreen;
	}

	public void setLedScreen(boolean ledScreen) {
		this.ledScreen = ledScreen;
	}

	public int getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(int tankCapacity) {
		this.tankCapacity = tankCapacity;
	}
	
	public String getInfo() {
		return "This is a Car";
	}

}
