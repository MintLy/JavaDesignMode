package com.ly.s13_iterator_mode;

public class Client
{
	public static void main(String[] args)
	{
		CompanyA a = new CompanyA();
		check(a.iterator());
		CompanyB b = new CompanyB();
		check(b.iterator());
	}

	public static void check(Iterator pIterator)
	{
		while (pIterator.hasNext())
		{
			System.out.println(pIterator.next());
		}
	}
}
