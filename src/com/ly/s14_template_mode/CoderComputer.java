package com.ly.s14_template_mode;

/**
 * 程序员的计算机
 * 
 * @author 20170117
 *
 */
public class CoderComputer extends AbstractComputer
{
	@Override
	protected void login()
	{
		System.out.println("程序员只需要进行用户和密码验证");
	}
}
