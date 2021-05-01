
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Part a
		/*
		Vehicle v = new Car();
		*/
		
		//Part b
		/*
		Truck t = new Truck();
		*/
		
		//Part c
		/*
		Bus b = new MotorVehicle();
		*/
		
		//Part d
		/*
		Object o = new Truck();
		*/
		
		//Part e 
		/*
		Car c = new Bus();
		*/
		
		//Part f
		/*
		Bus b = new Vehicle();
		*/
		
		//Part g
		MotorVehicle m = new LightTruck(); 
		
	}

}

class Vehicle {
	
}

class MotorVehicle extends Vehicle {
	
}

class Car extends MotorVehicle {
	
}

class Truck extends MotorVehicle {
	
}

class Bus extends MotorVehicle {
	
}

class LightTruck extends Truck {
	
}

class HeavyTruck extends Truck {
	
}

