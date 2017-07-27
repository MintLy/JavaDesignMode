package com.ly.s19_classadapter_mode;

public class Client
{
	public static void main(String[] args)
	{
//		VoltAdapter adapter = new VoltAdapter();
//		System.out.printf("输出电压 : %s", adapter.getVolt5());
		FiveVolt volt = new VoltAdapter();
		System.out.printf("输出电压 : %d", volt.getVolt5());
	}
}
