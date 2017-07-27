package com.ly.s23_bridging_mode;

public abstract class Coffee
{
	protected CoffeeAdditives impl;

	public Coffee(CoffeeAdditives pCoffeeAdditives)
	{
		this.impl = pCoffeeAdditives;
	}

	/*
	 * 具体的咖啡由具体子类决定
	 */
	public abstract void makeCoffee();
}
