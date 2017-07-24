package com.ly.s2_builder_mode;

/**
 * 抽象Builder类
 * 
 * @author 20170117
 *
 */
public abstract class Builder
{
	// 设置主机
	protected abstract void buildBoard(String pBoard);

	// 设置显示器
	protected abstract void buildDisplay(String pDisplay);

	// 设置操作系统
	protected abstract void buildOS();

	// 创建Computer对象
	protected abstract Computer create();
}
