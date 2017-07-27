package com.ly.s23_bridging_mode;

public class LargeCoffee extends Coffee
{

	public LargeCoffee(CoffeeAdditives pCoffeeAdditives)
	{
		super(pCoffeeAdditives);
	}

	@Override
	public void makeCoffee()
	{
		System.out.printf("大杯的 %s 咖啡\n", impl.getClass().getSimpleName());
	}

}
