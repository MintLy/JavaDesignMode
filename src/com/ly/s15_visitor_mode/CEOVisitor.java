package com.ly.s15_visitor_mode;

public class CEOVisitor implements Visitor
{

	@Override
	public void visit(Engineer pEngineer)
	{
		System.out.printf("工程师  : %s, KPI : %d\n", pEngineer.name, pEngineer.kpi);
	}

	@Override
	public void visit(Manager pLoader)
	{
		System.out.printf("经理  : %s, KPI : %d,新产品数量 : %d\n", pLoader.name,
				pLoader.kpi, pLoader.getProducts());
	}

}
