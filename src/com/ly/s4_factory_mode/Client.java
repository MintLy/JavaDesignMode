package com.ly.s4_factory_mode;

public class Client
{
	private CarFactory mCar;

	public static void main(String[] args)
	{
		Client t = new Client();
		t.setCar(new Q3Car());
		// t.setCar(new Q7Car());
		t.startTheCar();
	}

	private void setCar(CarFactory car)
	{
		this.mCar = car;
	}

	private void startTheCar()
	{
		this.mCar.startTheCar();
	}

}
