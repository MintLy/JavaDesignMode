package com.ly.s13_iterator_mode;

public class BIterator implements Iterator
{
	private Employee[] mEmployees;
	private int mPosition;

	public BIterator(Employee[] pEmployees)
	{
		this.mEmployees = pEmployees;
	}

	@Override
	public boolean hasNext()
	{
		return !(mPosition > mEmployees.length - 1
				|| mEmployees[mPosition] == null);
	}

	@Override
	public Object next()
	{
		Employee employee = mEmployees[mPosition];
		mPosition++;
		return employee;
	}

}
