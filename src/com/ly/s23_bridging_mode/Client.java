package com.ly.s23_bridging_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 原汁原味
		Ordinary ordinary = new Ordinary();
		// 加糖
		Sugar sugar = new Sugar();
		// 大杯原味咖啡
		Coffee largeOrdinaryCoffee = new LargeCoffee(ordinary);
		largeOrdinaryCoffee.makeCoffee();
		// 大杯加糖咖啡
		Coffee largeSugarCoffee = new LargeCoffee(sugar);
		largeSugarCoffee.makeCoffee();
		// 小杯原味咖啡
		Coffee smallOrdinaryCoffer = new SmallCoffee(ordinary);
		smallOrdinaryCoffer.makeCoffee();
		// 小杯加糖咖啡
		Coffee smallSugarCoffee = new SmallCoffee(sugar);
		smallSugarCoffee.makeCoffee();
	}
}
