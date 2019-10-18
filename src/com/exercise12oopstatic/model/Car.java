package com.exercise12oopstatic.model;

public class Car {
	private String serialNumber;
	private int numberDoors;
	pribvate boolean isCoupe=false;
	
	public Car()
	{
		
	}
	public Car(String serialNumber, int numberDoors)
	{
		this.serialNumber=serialNumber;
		this.numberDoors=numberDoors;
	}
	
	
	public String getSerialNumber()
	{
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber=serialNumber;
	}
	
	public int getNumberDoors()
	{
		return numberDoors;
	}
	public void setNumberDoors(int numberDoors)
	{
		this.numberDoors=numberDoors;
	}

	public void CarIsCoupe(boolean isCoupe)
	{
		this.isCoupe=isCoupe;
	}

}
