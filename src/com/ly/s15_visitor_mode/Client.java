package com.ly.s15_visitor_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 构建报表
		BusinessReport report = new BusinessReport();
		System.out.println("-----给CEO看报表-----");
		report.showReport(new CEOVisitor());
		System.out.println("-----给CTO看报表-----");
		report.showReport(new CTOVisitor());
	}
}
