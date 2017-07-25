package com.ly.s15_visitor_mode;

public class CTOVisitor implements Visitor
{

	@Override
	public void visit(Engineer pEngineer)
	{
		System.out.printf("工程师 : %s,代码行数: %d\n", pEngineer.name,
				pEngineer.getCodeLines());
	}

	@Override
	public void visit(Manager pLoader)
	{
		System.out.printf("经理 : %s,产品数量 : %d\n", pLoader.name,
				pLoader.getProducts());
	}

}
