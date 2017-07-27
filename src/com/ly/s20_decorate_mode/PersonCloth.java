package com.ly.s20_decorate_mode;

public abstract class PersonCloth extends Person
{
	protected Person person;// 持有一个Person的对象

	public PersonCloth(Person pPerson)
	{
		this.person = pPerson;
	}

	@Override
	public void dressed()
	{
		person.dressed();
	}

}
