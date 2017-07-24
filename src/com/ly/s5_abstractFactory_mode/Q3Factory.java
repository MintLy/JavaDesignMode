package com.ly.s5_abstractFactory_mode;

public class Q3Factory extends CarFactory
{

	@Override
	public ITire createTire()
	{
		return new NormalTire();
	}

	@Override
	public IEngine createEngine()
	{
		return new DomesticEngine();
	}

	@Override
	public IBrake createBrake()
	{
		return new NormalBrake();
	}

}
