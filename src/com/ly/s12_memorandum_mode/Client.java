package com.ly.s12_memorandum_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 创建游戏
		CallOfDuty game = new CallOfDuty();
		// 玩游戏
		game.play();
		Caretaker caretaker = new Caretaker();
		// 游戏存档
		caretaker.archive(game.createMemoto());
		// 退出游戏
		game.quit();
		// 恢复游戏
		CallOfDuty newGame = new CallOfDuty();
		newGame.restore(caretaker.load());
	}
}
