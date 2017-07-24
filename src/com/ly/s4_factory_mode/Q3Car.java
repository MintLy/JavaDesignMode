package com.ly.s4_factory_mode;

public class Q3Car extends CarFactory
{

	@Override
	protected void startTheCar()
	{
		System.out.println("Q3启动拉");
	}

}
