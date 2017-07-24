package com.ly.s1_singleton_mode;

/**
 * 懒汉模式
 * 
 * @author 20170117
 * 
 *         优点：只在使用时才会被实例化 缺点：第一次加载时较慢，切每次都进行同步，造成不必要的同步开销
 */
public class LazymanMode
{

	private static LazymanMode INSTANCE;

	private LazymanMode()
	{
	}

	public static synchronized LazymanMode getInstance()
	{
		if (INSTANCE == null)
		{
			INSTANCE = new LazymanMode();
		}
		return INSTANCE;
	}

}
