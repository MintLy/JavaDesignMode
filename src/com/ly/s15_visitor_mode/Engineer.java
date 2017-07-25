package com.ly.s15_visitor_mode;

import java.util.Random;

//工程师
public class Engineer extends Staff
{

	public Engineer(String pName)
	{
		super(pName);
	}

	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visit(this);
	}

	// 工程师这一年写的代码数量
	public int getCodeLines()
	{
		return new Random().nextInt(10 * 10000);
	}

}
