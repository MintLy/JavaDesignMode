package com.ly.s20_decorate_mode;

public class ExpensiveCloth extends PersonCloth
{

	public ExpensiveCloth(Person pPerson)
	{
		super(pPerson);
	}

	private void dressShirt()
	{
		System.out.println("穿短袖");
	}

	private void dressLeather()
	{
		System.out.println("穿皮衣");
	}

	private void dressJean()
	{
		System.out.println("穿牛仔裤");
	}

	@Override
	public void dressed()
	{
		super.dressed();
		dressShirt();
		dressLeather();
		dressJean();
	}
}
