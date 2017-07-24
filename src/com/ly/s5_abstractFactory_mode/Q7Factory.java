package com.ly.s5_abstractFactory_mode;

public class Q7Factory extends CarFactory
{

	@Override
	public ITire createTire()
	{
		return new SUVTire();
	}

	@Override
	public IEngine createEngine()
	{
		return new ImportEngine();
	}

	@Override
	public IBrake createBrake()
	{
		return new SeniorBrake();
	}

}
