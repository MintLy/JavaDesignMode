package com.ly.s12_memorandum_mode;

public class CallOfDuty
{
	private int mCheckpoint = 1;
	private int mLifeValue = 100;
	private String mWeapon = "沙漠之鹰";

	public void play()
	{
		System.out.printf("玩游戏 : 第%d关,奋战杀敌中\n", mCheckpoint);
		mLifeValue -= 10;
		System.out.println("进度升级啦");
		mCheckpoint++;
		System.out.printf("到达 %d关", mCheckpoint);
	}

	// 退出游戏
	public void quit()
	{
		System.out.println("----------我是优雅的分割线----------");
		System.out.println("退出前的游戏属性 : " + this.toString());
		System.out.println("退出游戏");
		System.out.println("----------我是优雅的分割线----------");
	}

	/**
	 * 创建备忘录
	 * 
	 * @return
	 */
	public Memoto createMemoto()
	{
		Memoto memoto = new Memoto();
		memoto.setCheckpoint(this.mCheckpoint);
		memoto.setLifeValue(this.mLifeValue);
		memoto.setWeapon(this.mWeapon);
		return memoto;
	}

	/**
	 * 恢复游戏
	 * 
	 * @param pMemoto
	 */
	public void restore(Memoto pMemoto)
	{
		this.mCheckpoint = pMemoto.getCheckpoint();
		this.mLifeValue = pMemoto.getLifeValue();
		this.mWeapon = pMemoto.getWeapon();
		System.out.println("恢复后的游戏属性 : " + this.toString());
	}

	@Override
	public String toString()
	{
		return "CallOfDuty [mCheckpoint=" + mCheckpoint + ", mLifeValue="
				+ mLifeValue + ", mWeapon=" + mWeapon + "]";
	}

}
