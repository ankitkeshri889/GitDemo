package practise;

public class Vehicle {

	private String type;
	private String color;
	private String company;
	private String model;
	private boolean isAutomatic;
	private int price;
	private int engineCC = 800;
	public static int count = 0;

	public Vehicle() {
		count++;
	}

	public Vehicle(String type, String color, String company, String model, boolean isAutomatic, int price,
			int engineCC) {
		this.type = type;
		this.color = color;
		this.company = company;
		this.model = model;
		this.isAutomatic = isAutomatic;
		this.price = price;
		this.engineCC = engineCC;
		count++;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setAutomatic(boolean isAutomatic) {
		this.isAutomatic = isAutomatic;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public boolean isAutomatic() {
		return isAutomatic;
	}

	public int getPrice() {
		return price;
	}

	private int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public int returnSpeed() {
		int result = getEngineCC();

		if (result == 800) {
			return 90;
		} else if (result == 1000) {
			return 130;
		} else if (result < 800) {
			return 70;
		} else {
			return 150;
		}
	}

	public static String getVehicle() {
		return "You have created a new vehicle";
	}
	
	public String getInfo() {
		return "This is a vehicle";
	}

}
