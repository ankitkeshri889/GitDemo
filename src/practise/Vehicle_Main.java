package practise;

public class Vehicle_Main {

	public static void main(String[] args) {

		Vehicle v1 = new Vehicle();
		System.out.println(v1.getType());

		v1.setType("Truck");
		System.out.println(v1.getType());
		System.out.println(v1.count);

		Vehicle v2 = new Vehicle("Car", "Aqua Teal", "Hyundai", "i10 Magna", false, 680000, 1000);
		System.out.println(v2.getType());

		v2.setType("Jeep");
		System.out.println(v2.getType());
		System.out.println();
		// Get all values

		System.out.println(v2.getColor());
		System.out.println(v2.getModel());
		System.out.println(v2.getCompany());
		System.out.println(v2.getPrice());
		System.out.println(v2.isAutomatic());
		System.out.println(Vehicle.count);
		System.out.println(v2.count);

		System.out.println();

		// Get the speed of Hyundai i10

		System.out.println("The spped of i10 Magna is : " + v2.returnSpeed());

		System.out.println();
		System.out.println(Vehicle.getVehicle());

		// -----------------------------------------------------------------------------//

		System.out.println();
		System.out.println();

		Car car = new Car("Car", "Misty Red", "Hyundai", "i20 NIOS", true, 950000, 1200, false, true, 52);
		System.out.println(car.getType());
		System.out.println(car.getColor());
		System.out.println(car.getCompany());
		System.out.println(car.getModel());
		System.out.println(car.getTankCapacity());
		System.out.println(car.isLedScreen());
		System.out.println(car.isHatchback());
		System.out.println();
		System.out.println();
		// Truck

		Truck truck = new Truck("Truck", "Brown", "TATA", "Hector A89", false, 2950000, 2500, "20000KG", 8);
		System.out.println(truck.getType());
		System.out.println(truck.isAutomatic());
		System.out.println(truck.getCompany());
		System.out.println(truck.getCapacity());
		System.out.println(truck.getNoOfTyres());
		
		// Polymorphism 
		
		Vehicle v3 = new Vehicle("Scooty", "Beige", "Yamaha", "RayZR", false, 90000, 500);
		Vehicle car1 = new Car("Car", "White", "Maruti Suzuki", "Ciazz", true, 1100000 , 1300, false, true, 57);
		Vehicle truck1 = new Truck("Truck", "Black", "TATA", "Hector A91", false, 3550000, 3000, "25000KG", 10);
		Vehicle bike = new Bike("Bike", "Green", "Kawasaki", "Ninja", false, 290000, 900,true);
		
		System.out.println();
		System.out.println("Illustrating Polymorphsim ...");
		System.out.println(v3.getInfo());
		System.out.println(car1.getInfo());
		System.out.println(truck1.getInfo());
		System.out.println(bike.getInfo());
		
	}

}
