package com.ly.s2_builder_mode;

public class Client
{
	public static void main(String[] args)
	{
		Builder build = new MacbookBuilder();
		Director dir = new Director(build);
		dir.construct("英特尔", "Retina");
		Computer computer = build.create();
		System.out.println(computer);
	}
}
