package com.ly.s19_classadapter_mode;

public class VoltAdapter extends Volt220 implements FiveVolt
{
	@Override
	public int getVolt5()
	{
		return 5;
	}

}
