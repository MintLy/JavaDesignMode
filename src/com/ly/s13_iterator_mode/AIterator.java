package com.ly.s13_iterator_mode;

import java.util.List;

public class AIterator implements Iterator
{
	private List<Employee> mEmployees;
	private int mPosttion;

	public AIterator(List<Employee> pEmployees)
	{
		this.mEmployees = pEmployees;
	}

	@Override
	public boolean hasNext()
	{
		return !(mPosttion > this.mEmployees.size() - 1
				|| this.mEmployees.get(mPosttion) == null);
	}

	@Override
	public Object next()
	{
		Employee employee = mEmployees.get(mPosttion);
		mPosttion++;
		return employee;
	}

}
