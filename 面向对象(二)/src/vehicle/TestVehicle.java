package vehicle;

public class TestVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("creating a vehicle with a 1,000kg"
				+ "mixmum load");
		Vehicle testVehicle = new Vehicle(10000);
		System.out.println("Add box #1(500kg):" 
		+ testVehicle.addBox(500));
		System.out.println("Add box #2(250kg):" 
				+ testVehicle.addBox(250));
		System.out.println("Add box #1(5000kg):" 
				+ testVehicle.addBox(5000));
		System.out.println("Add box #1(4000kg):" 
				+ testVehicle.addBox(4000));
		System.out.println("Add box #1(300kg):" 
				+ testVehicle.addBox(300));
		System.out.println("Vehicle load is " + testVehicle.getLoad()
		+"kg");
	}

}
