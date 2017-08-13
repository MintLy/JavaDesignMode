package com.ly.s13_iterator_mode;

public class Client
{
	public static void main(String[] args)
	{
		Company a = new CompanyA();
		check(a);
		Company b = new CompanyB();
		check(b);
	}

	public static void check(Company pCompany)
	{
		Iterator iterator = pCompany.iterator();
		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}
