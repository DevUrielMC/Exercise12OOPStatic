package com.exercise12oopstatic.app;

import com.exercise12oopstatic.model.Car;

public class CarApp 
{

	public static void main(String[] args) 
	{

		Car edgarCar= new Car();
		Car luisCar= new Car();
		Car aleCar= new Car();
		Car crisCar= new Car();
		Car hellrCar= new Car();
		Car manuCar= new Car();
		Car aryCar= new Car();
		
		edgarCar.setSerialNumber("1");
		edgarCar.setNumberDoors(4);
		edgarCar.setBrand("Volvo");
		luisCar.setSerialNumber("2");
		luisCar.setNumberDoors(4);
		luisCar.setBrand("Ford");
		aleCar.setSerialNumber("3");
		aleCar.setNumberDoors(4);
		aleCar.setBrand("Honda");
		crisCar.setSerialNumber("4");
		crisCar.setNumberDoors(2);//cuando no es estatico le pertenece al objeto
		crisCar.setBrand("Nissan");// cuando es static le pertenece a la clase
		//ejemplo de cambio si es coupe o no poniendolo como static
		crisCar.CarIsCoupe(true);
		
		System.out.println("Edgar: "+edgarCar.toString());
		System.out.println("Luis: "+luisCar.toString());
		System.out.println("Ale: "+aleCar.toString());
		System.out.println("Luis: "+luisCar.toString());
		System.out.println("Cris: "+crisCar.toString());
		
		
	}
}
