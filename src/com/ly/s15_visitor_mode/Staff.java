package com.ly.s15_visitor_mode;

import java.util.Random;

//员工抽象基类 
public abstract class Staff
{
	public String name;
	// 员工kpi
	public int kpi;

	public Staff(String pName)
	{
		this.name = pName;
		this.kpi = new Random().nextInt(10);
	}

	/**
	 * 接受Visitor的访问
	 * 
	 * @param pVisitor
	 */
	public abstract void accept(Visitor pVisitor);
}
