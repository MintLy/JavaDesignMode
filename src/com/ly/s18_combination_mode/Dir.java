package com.ly.s18_combination_mode;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir
{
	// 声明一个List成员变量存储文件夹下的所有元素
	protected List<Dir> dirs = new ArrayList<Dir>();

	// 当前文件或文件夹名字
	private String mName;

	public Dir(String pName)
	{
		this.mName = pName;
	}

	/**
	 * 添加一个文件或文件夹
	 * 
	 * @param pDir
	 */
	public abstract void addDir(Dir pDir);

	/**
	 * 移除一个文件或文件夹
	 * 
	 * @param pDir
	 */
	public abstract void rmDir(Dir pDir);

	/**
	 * 清空文件夹下所有元素
	 */
	public abstract void clear();

	/**
	 * 输出文件夹目录结构
	 */
	public abstract void print();

	/**
	 * 获取文件夹下所有的文件或子文件夹
	 * 
	 * @return
	 */
	public abstract List<Dir> getFiles();

	/**
	 * 获取文件或文件夹名
	 * 
	 * @return
	 */
	public String getName()
	{
		return mName;
	}

}
