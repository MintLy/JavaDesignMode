package com.ly.s16_mediator_mode;

//显卡
public class GraphicsCard extends Equipment
{

	public GraphicsCard(Mediator pMediator)
	{
		super(pMediator);
	}

	/**
	 * 播放视频
	 * 
	 * @param pData
	 */
	public void videoPlay(String pData)
	{
		System.out.printf("视频 : %s\n", pData);
	}
}
