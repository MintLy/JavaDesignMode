package com.ly.s22_appearance_mode;

public class MobilePhone
{
	private Phone mPhone = new PhoneImpl();
	private Camera mCamera = new SamsungCamera();

	public void videoChat()
	{
		System.out.println("视频聊天接通中......");
		mCamera.open();
		mPhone.dail();
	}

	public void takePircute()
	{
		mCamera.open();
		mCamera.takePircute();
	}
}
