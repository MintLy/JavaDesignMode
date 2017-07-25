package com.ly.s5_abstractFactory_mode;

public class Client
{
	public static void main(String[] args)
	{
		CarFactory q3 = new Q3Factory();
		q3.createTire().tire();
		q3.createEngine().engine();
		q3.createBrake().brake();
		System.out.println("\n----------我是优雅的分割线----------\n");
		CarFactory q7 = new Q7Factory();
		q7.createTire().tire();
		q7.createEngine().engine();
		q7.createBrake().brake();
	}
}
