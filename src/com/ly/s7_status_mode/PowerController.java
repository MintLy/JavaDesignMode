package com.ly.s7_status_mode;

public interface PowerController
{
	public void powerOn();

	public void powerOff();

	/**
	 * 电视遥控器，类似于经典状态模式中的Context
	 * 
	 * @author 20170117
	 *
	 */
	public class TvController implements PowerController
	{
		private TvState mTvState;

		public void setTvState(TvState pTvState)
		{
			this.mTvState = pTvState;
		}

		@Override
		public void powerOn()
		{
			setTvState(new PowerOnState());
			System.out.println("开机啦");
		}

		@Override
		public void powerOff()
		{
			setTvState(new PowerOffState());
			System.out.println("关机啦");
		}

		public void nextChannel()
		{
			mTvState.nextChannel();
		}

		public void prevChannel()
		{
			mTvState.prevChannel();
		}

		public void turnUp()
		{
			mTvState.turnUp();
		}

		public void turnDown()
		{
			mTvState.turnDown();
		}
	}

}
