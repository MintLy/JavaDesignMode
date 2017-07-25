package com.ly.s15_visitor_mode;

import java.util.Random;

//经理类型
public class Manager extends Staff
{
	private int mProducts;// 产品数量

	public Manager(String pName)
	{
		super(pName);
		mProducts = new Random().nextInt(10);
	}

	@Override
	public void accept(Visitor pVisitor)
	{
		pVisitor.visit(this);
	}

	// 一年内做的产品数量
	public int getProducts()
	{
		return mProducts;
	}

}
