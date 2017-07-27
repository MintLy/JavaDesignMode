package com.ly.s20_decorate_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 创建一个男孩
		Person boy = new Boy();
		PersonCloth cheapCloth = new CheapCloth(boy);
		cheapCloth.dressed();
		System.out.println("\n----------我是优雅的分割线----------\n");
		PersonCloth expensiveCloth = new ExpensiveCloth(boy);
		expensiveCloth.dressed();
	}
}
