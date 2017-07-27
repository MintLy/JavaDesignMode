package com.ly.s20_decorate_mode;

public class CheapCloth extends PersonCloth
{

	public CheapCloth(Person pPerson)
	{
		super(pPerson);
	}

	private void dressShorts()
	{
		System.out.println("穿短裤");
	}

	@Override
	public void dressed()
	{
		super.dressed();
		dressShorts();
	}
}
