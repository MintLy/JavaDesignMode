package com.ly.s16_mediator_mode;

public class Equipment
{
	protected Mediator mediator;// 每一个设备都应该知道其中介者

	public Equipment(Mediator pMediator)
	{
		this.mediator = pMediator;
	}
}
