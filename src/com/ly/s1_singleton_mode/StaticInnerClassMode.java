package com.ly.s1_singleton_mode;

/**
 * 静态内部类模式：确保线程安全、保证单例模式的唯一性、延迟单例的实例化
 * 
 * @author 20170117
 */
public class StaticInnerClassMode
{
	private StaticInnerClassMode()
	{
	}

	public static StaticInnerClassMode getInstance()
	{
		return StaticInnerClassHolder.sInstance;
	}

	private static class StaticInnerClassHolder
	{
		private static final StaticInnerClassMode sInstance = new StaticInnerClassMode();
	}

}
