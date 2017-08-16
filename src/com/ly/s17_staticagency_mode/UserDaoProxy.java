package com.ly.s17_staticagency_mode;

public class UserDaoProxy implements IUserDao
{
	private IUserDao mUserDao;

	public UserDaoProxy(IUserDao pUserDao)
	{
		this.mUserDao = pUserDao;
	}

	@Override
	public void save()
	{
		System.out.println("开启事务");
		mUserDao.save();
		System.out.println("提交事务");
	}

}
