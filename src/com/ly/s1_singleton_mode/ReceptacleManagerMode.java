package com.ly.s1_singleton_mode;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器模式：android源码
 * 
 * @author 20170117
 *
 */
public class ReceptacleManagerMode
{

	private static Map<String, Object> objMap = new HashMap<String, Object>();

	private ReceptacleManagerMode()
	{
	}

	public static void register(String key, Object instance)
	{
		if (!objMap.containsKey(key))
		{
			objMap.put(key, instance);
		}

	}

	public static Object getInstance(String key)
	{
		return objMap.get(key);
	}
}
