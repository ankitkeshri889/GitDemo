package practise;

public class Bike extends Vehicle {
	
	private boolean selfStart;

	public Bike(String type, String color, String company, String model, boolean isAutomatic, int price, int engineCC,
			boolean selfStart) {
		super(type, color, company, model, isAutomatic, price, engineCC);
		this.selfStart = selfStart;
	}

	public boolean isSelfStart() {
		return selfStart;
	}

	public void setSelfStart(boolean selfStart) {
		this.selfStart = selfStart;
	}
	
	public String getInfo() {
		return "This is a Bike";
	}

}
