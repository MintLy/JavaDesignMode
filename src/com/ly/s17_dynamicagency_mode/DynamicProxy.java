package com.ly.s17_dynamicagency_mode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler
{
	private Object mObj;// 被代理的类的引用

	public DynamicProxy(Object pObj)
	{
		this.mObj = pObj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		// 调用被代理类的方法
		System.out.println("开启事务");
		Object result = method.invoke(mObj, args);
		System.out.println("提交事务");
		return result;
	}

}
