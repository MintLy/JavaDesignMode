package com.ly.s10_command_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 创建俄罗斯方块游戏
		TetrisMachine machine = new TetrisMachine();
		// 构建游戏的四种命令
		LeftCommand leftCommand = new LeftCommand(machine);
		RightCommand rightCommand = new RightCommand(machine);
		FallCommand fallCommand = new FallCommand(machine);
		TransformCommand transformCommand = new TransformCommand(machine);
		// 设置按钮时间绑定
		Buttons buttons = new Buttons();
		buttons.setLeftCommand(leftCommand);
		buttons.setRightCommand(rightCommand);
		buttons.setFallCommand(fallCommand);
		buttons.setTransformCommand(transformCommand);
		// 按下按钮操作游戏
		buttons.toLeft();
		buttons.toRight();
		buttons.fall();
		buttons.transform();
	}
}
