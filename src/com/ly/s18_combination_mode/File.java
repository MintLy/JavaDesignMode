package com.ly.s18_combination_mode;

import java.util.List;

public class File extends Dir
{

	public File(String pName)
	{
		super(pName);
	}

	@Override
	public void addDir(Dir pDir)
	{
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void rmDir(Dir pDir)
	{
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

	@Override
	public void print()
	{
		System.out.println(getName());
	}

	@Override
	public List<Dir> getFiles()
	{
		throw new UnsupportedOperationException("文件对象不支持该操作");
	}

}
