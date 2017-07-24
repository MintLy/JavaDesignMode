package com.ly.s12_memorandum_mode;

/**
 * 负责管理Memoto
 * 
 * @author 20170117
 *
 */

public class Caretaker
{
	// 备忘录
	private Memoto mMemoto;

	// 存档
	public void archive(Memoto pMemoto)
	{
		this.mMemoto = pMemoto;
	}

	// 读档
	public Memoto load()
	{
		return this.mMemoto;
	}
}
