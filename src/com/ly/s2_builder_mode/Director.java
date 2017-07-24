package com.ly.s2_builder_mode;

public class Director
{
	private Builder mBuilder;

	public Director(Builder pBuilder)
	{
		this.mBuilder = pBuilder;
	}

	public void construct(String pBoard, String pDisplay)
	{
		mBuilder.buildBoard(pBoard);
		mBuilder.buildDisplay(pDisplay);
		mBuilder.buildOS();
	}

}
