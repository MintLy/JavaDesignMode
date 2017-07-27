package com.ly.s19_objectadapter_mode;

public class VoltAdapter extends Volt220 implements FiveVolt
{
	private Volt220 mVolt220;

	public VoltAdapter(Volt220 pVolt220)
	{
		this.mVolt220 = pVolt220;
	}

	public int getVolt220()
	{
		return this.mVolt220.getVolt220();
	}

	@Override
	public int getVolt5()
	{
		return 5;
	}

}
