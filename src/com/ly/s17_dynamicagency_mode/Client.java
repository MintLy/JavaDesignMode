package com.ly.s17_dynamicagency_mode;

import java.lang.reflect.Proxy;

import com.ly.s17_staticagency_mode.ILawsuit;
import com.ly.s17_staticagency_mode.XiaoMing;

public class Client
{
	public static void main(String[] args)
	{
		// 构造一个小明
		ILawsuit xiaoming = new XiaoMing();
		// 构造一个动态代理
		DynamicProxy proxy = new DynamicProxy(xiaoming);
		// 获取被代理类小明的ClassLoader
		ClassLoader loader = xiaoming.getClass().getClassLoader();
		// 动态构造一个代理者律师
		ILawsuit lawyer = (ILawsuit) Proxy.newProxyInstance(loader,
				new Class[] { ILawsuit.class }, proxy);
		// 律师提交诉讼申请
		lawyer.submit();
		// 律师进行举证
		lawyer.burden();
		// 律师代替小明进行辩护
		lawyer.defend();
		// 完成诉讼
		lawyer.finish();
	}
}
