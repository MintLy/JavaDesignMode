package com.ly.s8_dutyLink_mode;

public class Song extends Leader
{

	@Override
	public int limit()
	{
		return 5000;
	}

	@Override
	public void handle(int money)
	{
		System.out.println("嵩哥批复报销" + money + "元");
	}

}
