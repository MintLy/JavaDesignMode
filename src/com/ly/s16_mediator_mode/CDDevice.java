package com.ly.s16_mediator_mode;
//光驱
public class CDDevice extends Equipment
{
	private String mData;// 视频数据

	public CDDevice(Mediator pMediator)
	{
		super(pMediator);
	}

	/**
	 * 读取视频数据
	 * 
	 * @return
	 */
	public String read()
	{
		return this.mData;
	}

	/**
	 * 加载视频数据
	 */
	public void load()
	{
		// 实际情况中视频数据与音频数据都在一个数据流中
		mData = "视频数据,音频数据";
		// 通知中介者,也就是主板,数据改变
		mediator.changed(this);
	}
}
