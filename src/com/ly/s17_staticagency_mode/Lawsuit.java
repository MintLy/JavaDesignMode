package com.ly.s17_staticagency_mode;

public class Lawsuit implements ILawsuit
{
	private ILawsuit mLawsuit;// 持有一个具体被代理者的引用

	public Lawsuit(ILawsuit pLawsuit)
	{
		this.mLawsuit = pLawsuit;
	}

	@Override
	public void submit()
	{
		mLawsuit.submit();
	}

	@Override
	public void burden()
	{
		mLawsuit.burden();
	}

	@Override
	public void defend()
	{
		mLawsuit.defend();
	}

	@Override
	public void finish()
	{
		mLawsuit.finish();
	}

}
