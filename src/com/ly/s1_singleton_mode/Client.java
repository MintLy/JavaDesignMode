package com.ly.s1_singleton_mode;

public class Client
{

	public static void main(String[] args)
	{
		System.out.println(HungrymanMode.getInstance());
		System.out.println(HungrymanMode.getInstance());
		System.out.println(LazymanMode.getInstance());
		System.out.println(LazymanMode.getInstance());
		System.out.println(DCLMode.getInstance());
		System.out.println(DCLMode.getInstance());
		System.out.println(StaticInnerClassMode.getInstance());
		System.out.println(StaticInnerClassMode.getInstance());
		System.out.println(EnumerateMode.INSTANCE);
		System.out.println(EnumerateMode.INSTANCE);
	}

}
