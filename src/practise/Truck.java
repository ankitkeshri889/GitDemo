package practise;

public class Truck extends Vehicle {

	private String capacity;
	private int noOfTyres;

	public Truck(String type, String color, String company, String model, boolean isAutomatic, int price, int engineCC,
			String capacity, int noOfTyres) {
		super(type, color, company, model, isAutomatic, price, engineCC);
		this.capacity = capacity;
		this.noOfTyres = noOfTyres;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getNoOfTyres() {
		return noOfTyres;
	}

	public void setNoOfTyres(int noOfTyres) {
		this.noOfTyres = noOfTyres;
	}
	
	public String getInfo() {
		return "This is a Truck";
	}

}
