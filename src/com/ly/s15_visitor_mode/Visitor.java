package com.ly.s15_visitor_mode;

public interface Visitor
{
	// 访问工程师类型
	public void visit(Engineer pEngineer);

	// 访问经理类型
	public void visit(Manager pLoader);
}
