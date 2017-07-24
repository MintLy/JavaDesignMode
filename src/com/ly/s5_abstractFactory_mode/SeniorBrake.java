package com.ly.s5_abstractFactory_mode;

public class SeniorBrake implements IBrake
{

	@Override
	public void brake()
	{
		System.out.println("高级制动");
	}

}
