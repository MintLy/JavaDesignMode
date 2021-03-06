package com.ly.s6_strategy_mode;

public class BusStrtegy implements CalculateStrategy
{

	/**
	 * 公交车：十公里之内一元钱，超过十公里之后每加一元钱可以乘5公里
	 */
	@Override
	public int calculatePrice(int km)
	{
		// 超过10公里的总距离
		int extraTotal = km - 10;
		// 超过的距离是5公里的倍数
		int extraFactor = extraTotal / 5;
		// 超过的距离对5公里取余
		int fraction = extraTotal % 5;
		// 价格计算
		int price = 1 + extraFactor * 1;
		return fraction > 0 ? ++price : price;
	}

}
