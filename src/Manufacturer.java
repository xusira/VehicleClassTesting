import java.util.ArrayList;

public class Manufacturer
{
	public static void main(String[] args)
	{
//		Vehicle vehicle = new Vehicle();
//		DodgeCharger charger = new DodgeCharger();
//		HondaShitCar honda = new HondaShitCar();
//		
//		vehicle.engineSound();
//		charger.engineSound();
//		honda.engineSound();
		
		Integer hell = 1;
		Double d = 2.78;
		Float f6 = 1.67587687687F;
		Long l = 784873578888888888L;
		Short s = 3546;
		Byte b = 127;
		
//		System.out.println(f6);
		
		//Syntax keywords
		//int, double, float, long, short, byte;
		
		
		
//		System.out.println(hell);
		
		advancedExample();
	}
	
	public static void advancedExample()
	{
		Vehicle vehicle = new Vehicle();
		Vehicle charger = new DodgeCharger();
		HondaShitCar honda = new HondaShitCar();
		Lamborghini lamborghini = new Lamborghini();
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(vehicle);
		vehicles.add(charger);
		vehicles.add(honda);
		vehicles.add(lamborghini);
		
		for (Vehicle v : vehicles)
		{
			v.name();
			v.engineSound();
			
			if (v instanceof DodgeCharger)
			{
				((DodgeCharger) v).touchscreen();
			}
			if (v instanceof Lamborghini)
			{
				((Lamborghini) v).quadExhaust();
			}
			if (v instanceof Ferrari)
			{
				((Ferrari v).betterThanLamborghinies
			}
			{
				
			}
		}
	}
}
