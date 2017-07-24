package com.ly.s2_builder_mode;

public class MacbookBuilder extends Builder
{
	private Computer com = new Macbook();

	@Override
	protected void buildBoard(String pBoard)
	{
		com.setBoard(pBoard);
	}

	@Override
	protected void buildDisplay(String pDisplay)
	{
		com.setDisplay(pDisplay);
	}

	@Override
	protected void buildOS()
	{
		com.setOS();
	}

	@Override
	protected Computer create()
	{
		return com;
	}

}
