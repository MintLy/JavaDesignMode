package com.ly.s17_staticagency_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 构造一个小明
		ILawsuit xiaoming = new XiaoMing();
		// 构造一个代理律师,并将小明作为构造参数传入
		ILawsuit lawsuit = new Lawsuit(xiaoming);
		// 律师提交诉讼请求
		lawsuit.submit();
		// 律师进行举证
		lawsuit.burden();
		// 律师代替小明进行辩诉
		lawsuit.defend();
		// 完成诉讼
		lawsuit.finish();
	}
}
