package com.ly.s17_dynamicagency_mode;

import java.lang.reflect.Proxy;

import com.ly.s17_staticagency_mode.IUserDao;
import com.ly.s17_staticagency_mode.UserDao;

public class Client
{
	public static void main(String[] args)
	{
		// 构造一个UserDao
		IUserDao userDao = new UserDao();
		// 构造一个动态代理
		DynamicProxy proxy = new DynamicProxy(userDao);
		// 获取被代理类UserDao的ClassLoader
		ClassLoader loader = userDao.getClass().getClassLoader();
		// 动态构造一个代理UserDao
		IUserDao proxyObj = (IUserDao) Proxy.newProxyInstance(loader,
				new Class[] { IUserDao.class }, proxy);
		// 调用代理的UserDao进行存储操作
		proxyObj.save();
	}
}
