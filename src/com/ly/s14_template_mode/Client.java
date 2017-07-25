package com.ly.s14_template_mode;

public class Client
{
	public static void main(String[] args)
	{
		AbstractComputer coderComputer = new CoderComputer();
		coderComputer.startUp();
		System.out.println("\n----------我是优雅的分割线----------\n");
		AbstractComputer militaryComputer = new MilitaryComputer();
		militaryComputer.startUp();
	}
}
