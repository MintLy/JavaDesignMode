package com.ly.s2_builder_mode;

/**
 * 计算机抽象类
 * 
 * @author 20170117
 *
 */
public abstract class Computer
{
	protected String mBoard;
	protected String mDisplay;
	protected String mOS;

	// 设置主板
	protected void setBoard(String pBoard)
	{
		this.mBoard = pBoard;
	}

	// 设置显示器
	protected void setDisplay(String pDisplay)
	{
		this.mDisplay = pDisplay;
	}

	// 设置操作系统
	protected abstract void setOS();

	@Override
	public String toString()
	{
		return "Computer [mBoard=" + mBoard + ", mDisplay=" + mDisplay
				+ ", mOS=" + mOS + "]";
	}

}
