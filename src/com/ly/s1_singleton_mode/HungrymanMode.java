package com.ly.s1_singleton_mode;

/**
 * 饿汉模式
 * 
 * @author 20170117
 *
 */
public class HungrymanMode
{
	private static final HungrymanMode INSTANCE = new HungrymanMode();

	private HungrymanMode()
	{
	}

	public static HungrymanMode getInstance()
	{
		return INSTANCE;
	}
}
