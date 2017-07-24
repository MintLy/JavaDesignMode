package com.ly.s5_abstractFactory_mode;

public class NormalBrake implements IBrake
{

	@Override
	public void brake()
	{
		System.out.println("普通制动");
	}

}
