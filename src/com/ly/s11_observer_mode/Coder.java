package com.ly.s11_observer_mode;

import java.util.Observable;
import java.util.Observer;

public class Coder implements Observer
{
	private String mName;

	public Coder(String pName)
	{
		this.mName = pName;
	}

	@Override
	public void update(Observable o, Object arg)
	{
		System.out.printf("Hello,%s,有新的消息通知,内容为:%s\n", this.mName, arg);
	}

	@Override
	public String toString()
	{
		return "码农:" + mName;
	}

}
