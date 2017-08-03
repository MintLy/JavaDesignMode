package com.ly.s8_dutyLink_mode;

public class Liang extends Leader
{

	@Override
	public int limit()
	{
		return 1000;
	}

	@Override
	public void handle(int money)
	{
		System.out.println("亮哥批复报销" + money + "元");
	}

}
