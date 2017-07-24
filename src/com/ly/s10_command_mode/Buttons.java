package com.ly.s10_command_mode;

public class Buttons
{
	private LeftCommand mLeftCommand;// 向左移动的命令对象引用
	private RightCommand mRightCommand;// 向右移动的命令对象引用
	private FallCommand mFallCommand;// 快速下落的命令对象引用
	private TransformCommand mTransformCommand;// 改变形状的命令对象引用

	/**
	 * 设置向左移动的命令对象
	 * 
	 * @param pLeftCommand
	 *            向左移动的命令对象
	 */
	public void setLeftCommand(LeftCommand pLeftCommand)
	{
		this.mLeftCommand = pLeftCommand;
	}

	/**
	 * 设置向右移动的命令对象
	 * 
	 * @param pLeftCommand
	 *            向右移动的命令对象
	 */
	public void setRightCommand(RightCommand pRightCommand)
	{
		this.mRightCommand = pRightCommand;
	}

	/**
	 * 设置快速下落的命令对象
	 * 
	 * @param pLeftCommand
	 *            快速下落的命令对象
	 */
	public void setFallCommand(FallCommand pFallCommand)
	{
		this.mFallCommand = pFallCommand;
	}

	/**
	 * 设置改变形状的命令对象
	 * 
	 * @param pLeftCommand
	 *            改变形状的命令对象
	 */
	public void setTransformCommand(TransformCommand pTransformCommand)
	{
		this.mTransformCommand = pTransformCommand;
	}

	/**
	 * 按下按钮向左移动
	 */
	public void toLeft()
	{
		mLeftCommand.execute();
	}

	/**
	 * 按下按钮向右移动
	 */
	public void toRight()
	{
		mRightCommand.execute();
	}

	/**
	 * 按下按钮快速下落
	 */
	public void fall()
	{
		mFallCommand.execute();
	}

	/**
	 * 按下按钮改变形状
	 */
	public void transform()
	{
		mTransformCommand.execute();
	}
}
