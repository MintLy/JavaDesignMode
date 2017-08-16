package com.ly.s17_staticagency_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 创建一个UserDao
		IUserDao userDao = new UserDao();
		// 创建一个代理的UserDao
		IUserDao userDaoProxy = new UserDaoProxy(userDao);
		// 调用代理的UserDao进行存储操作
		userDaoProxy.save();
	}
}
