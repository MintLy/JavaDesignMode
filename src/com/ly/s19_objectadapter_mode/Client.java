package com.ly.s19_objectadapter_mode;

public class Client
{
	public static void main(String[] args)
	{
		VoltAdapter adapter = new VoltAdapter(new Volt220());
		System.out.printf("输出电压 : %s", adapter.getVolt5());
	}
}
