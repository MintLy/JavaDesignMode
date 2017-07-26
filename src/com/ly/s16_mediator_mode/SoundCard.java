package com.ly.s16_mediator_mode;

//声卡
public class SoundCard extends Equipment
{

	public SoundCard(Mediator pMediator)
	{
		super(pMediator);
	}

	/**
	 * 播放音频
	 * 
	 * @param pData
	 */
	public void soundPlay(String pData)
	{
		System.out.printf("音频 : %s\n", pData);
	}
}
