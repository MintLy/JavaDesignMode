package com.ly.s18_combination_mode;

import java.util.Iterator;
import java.util.List;

public class Folder extends Dir
{

	public Folder(String pName)
	{
		super(pName);
	}

	@Override
	public void addDir(Dir pDir)
	{
		dirs.add(pDir);
	}

	@Override
	public void rmDir(Dir pDir)
	{
		dirs.remove(pDir);
	}

	@Override
	public void clear()
	{
		dirs.clear();
	}

	@Override
	public void print()
	{
		System.out.print(getName() + "(");
		Iterator<Dir> iterator = this.dirs.iterator();
		while (iterator.hasNext())
		{
			Dir dir = iterator.next();
			dir.print();
			if (iterator.hasNext())
			{
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}

	@Override
	public List<Dir> getFiles()
	{
		return dirs;
	}

}
