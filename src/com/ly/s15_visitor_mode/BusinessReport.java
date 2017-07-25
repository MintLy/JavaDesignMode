package com.ly.s15_visitor_mode;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport
{
	List<Staff> mStaff = new LinkedList<Staff>();

	public BusinessReport()
	{
		mStaff.add(new Manager("王经理"));
		mStaff.add(new Engineer("工程师-老王"));
		mStaff.add(new Engineer("工程师-老张"));
	}

	/**
	 * 为访问者展示报表
	 * 
	 * @param visitor
	 */
	public void showReport(Visitor visitor)
	{
		for (Staff staff : mStaff)
		{
			staff.accept(visitor);
		}
	}
}
