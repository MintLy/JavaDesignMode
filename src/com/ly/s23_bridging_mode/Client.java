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
		LargeCoffee largeOrdinaryCoffee = new LargeCoffee(ordinary);
		largeOrdinaryCoffee.makeCoffee();
		// 大杯加糖咖啡
		LargeCoffee largeSugarCoffee = new LargeCoffee(sugar);
		largeSugarCoffee.makeCoffee();
		// 小杯原味咖啡
		SmallCoffee smallOrdinaryCoffer = new SmallCoffee(ordinary);
		smallOrdinaryCoffer.makeCoffee();
		// 小杯加糖咖啡
		SmallCoffee smallSugarCoffee = new SmallCoffee(sugar);
		smallSugarCoffee.makeCoffee();
	}
}
