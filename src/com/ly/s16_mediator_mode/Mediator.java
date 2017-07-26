package com.ly.s16_mediator_mode;

public abstract class Mediator
{
	/**
	 * 设备对象改变时通知中介者的方法,在设备对象改变时由中介者去通知其他的设备对象
	 * 
	 * @param c
	 * 
	 */
	public abstract void changed(Equipment c);
}
