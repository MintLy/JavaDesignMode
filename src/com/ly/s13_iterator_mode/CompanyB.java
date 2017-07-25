package com.ly.s13_iterator_mode;

public class CompanyB implements Company
{
	private Employee[] mEmployee = new Employee[3];

	public CompanyB()
	{
		mEmployee[0] = new Employee("刘备", 56, "男", "攻城狮");
		mEmployee[1] = new Employee("关羽", 55, "男", "程序猿");
		mEmployee[2] = new Employee("张飞", 54, "男", "程序猿");
	}

	public Employee[] getEmployees()
	{
		return this.mEmployee;
	}

	@Override
	public Iterator iterator()
	{
		return new BIterator(this.mEmployee);
	}
}
