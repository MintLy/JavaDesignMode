package com.ly.s13_iterator_mode;

import java.util.ArrayList;
import java.util.List;

public class CompanyA implements Company
{
	private List<Employee> mEmployees = new ArrayList<Employee>();

	public CompanyA()
	{
		mEmployees.add(new Employee("张三", 13, "男", "程序猿"));
		mEmployees.add(new Employee("李四", 14, "男", "程序猿"));
		mEmployees.add(new Employee("王五", 15, "男", "攻城狮"));
		mEmployees.add(new Employee("小红", 12, "女", "测试"));
	}

	public List<Employee> getEmployees()
	{
		return this.mEmployees;
	}

	@Override
	public Iterator iterator()
	{
		return new AIterator(this.mEmployees);
	}
}
