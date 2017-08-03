package com.ly.s9_interpreter_mode;

public class Client
{
	public static void main(String[] args)
	{
		Calculator c = new Calculator("11 + 22 + 33");
		System.out.println(c.calculate());
//		Calculator c2 = new Calculator("111 - 22 + 33");
//		System.out.println(c2.calculate());
	}
}
