package com.ly.s22_appearance_mode;

public class PhoneImpl implements Phone
{

	@Override
	public void dail()
	{
		System.out.println("打电话");
	}

	@Override
	public void hangup()
	{
		System.out.println("挂断");
	}

}
