package com.ly.s17_staticagency_mode;

public class UserDao implements IUserDao
{

	@Override
	public void save()
	{
		System.out.println("保存数据");
	}

}
