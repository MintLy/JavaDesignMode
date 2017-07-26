package com.ly.s16_mediator_mode;

//CPU
public class CPU extends Equipment
{
	private String mDataVideo, mDataSound;// 视频和音频数据

	public CPU(Mediator pMediator)
	{
		super(pMediator);
	}

	/**
	 * 获取视频数据
	 * 
	 * @return
	 */
	public String getDataVideo()
	{
		return mDataVideo;
	}

	/**
	 * 获取音频数据
	 * 
	 * @return
	 */
	public String getDataSound()
	{
		return mDataSound;
	}

	public void decodeData(String pData)
	{
		// 分割音视频数据
		String[] tmp = pData.split(",");
		// 解析音视频数据
		mDataVideo = tmp[0];
		mDataSound = tmp[1];
		// 告诉中介者自身状态改变
		mediator.changed(this);
	}
}
