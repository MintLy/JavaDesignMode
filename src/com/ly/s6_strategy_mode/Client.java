package com.ly.s6_strategy_mode;

public class Client
{
	private CalculateStrategy strategy;

	public void setStrategy(CalculateStrategy strategy)
	{
		this.strategy = strategy;
	}

	public static void main(String[] args)
	{
		Client t = new Client();
		t.setStrategy(new BusStrtegy());
		System.out.printf("乘坐公交%s共消费%s元\n", 20, t.calculatorPrice(20));
	}

	private int calculatorPrice(int km)
	{
		return strategy.calculatePrice(km);
	}
}
