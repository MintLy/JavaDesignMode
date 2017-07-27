package com.ly.s23_bridging_mode;

public class SmallCoffee extends Coffee
{

	public SmallCoffee(CoffeeAdditives pCoffeeAdditives)
	{
		super(pCoffeeAdditives);
	}

	@Override
	public void makeCoffee()
	{
		System.out.printf("小杯的 %s 咖啡\n", impl.getClass().getSimpleName());
	}

}
