package com.ly.s8_dutyLink_mode;

public abstract class Leader
{
	protected Leader nextHandler;// 上一级领导处理者

	/**
	 * 处理报账请求
	 * 
	 * @param money
	 *            能批复的报账额度
	 */
	public final void handlerRquest(int money)
	{
		if (money <= limit())
		{
			handle(money);
		}
		else
		{
			if (null != nextHandler)
			{
				nextHandler.handlerRquest(money);
			}
		}
	}

	/**
	 * 自身能批复的额度权限
	 * 
	 * @return 额度
	 */
	public abstract int limit();

	/**
	 * 处理报账行为
	 * 
	 * @param money
	 *            具体金额
	 */
	public abstract void handle(int money);
}
