package com.ly.s14_template_mode;

/**
 * 军用计算机
 * 
 * @author 20170117
 *
 */
public class MilitaryComputer extends AbstractComputer
{
	@Override
	protected void checkHardwaer()
	{
		super.checkHardwaer();
		System.out.println("检查硬件防火墙");
	}

	@Override
	protected void login()
	{
		super.login();
		System.out.println("进行指纹识别等复杂的用户验证");
	}
}
