package com.ly.s8_dutyLink_mode;

public class Chu extends Leader
{

	@Override
	public int limit()
	{
		return Integer.MAX_VALUE;
	}

	@Override
	public void handle(int money)
	{
		System.out.println("楚大批复报销" + money + "元");
	}

}
