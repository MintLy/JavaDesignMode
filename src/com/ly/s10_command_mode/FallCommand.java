package com.ly.s10_command_mode;

public class FallCommand implements Command
{
	// 持有一个接收者俄罗斯方块游戏对象的引用
	private TetrisMachine mMachine;

	public FallCommand(TetrisMachine pMachine)
	{
		this.mMachine = pMachine;
	}

	@Override
	public void execute()
	{
		// 调用游戏机里的具体方法执行操作
		mMachine.fastToBottom();
	}

}
