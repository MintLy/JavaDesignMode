package com.ly.s1_singleton_mode;

/**
 * 
 * @author 20170117 使用率最高 优点：第一次使用时才会被实例化 缺点：首次调用加载缓慢
 */
public class DCLMode
{
	private static DCLMode INSTANCE;

	private DCLMode()
	{
	}

	public static DCLMode getInstance()
	{
		if (INSTANCE == null)
		{
			synchronized (DCLMode.class)
			{
				if (INSTANCE == null)
				{
					INSTANCE = new DCLMode();
				}
			}
		}
		return INSTANCE;
	}

}
