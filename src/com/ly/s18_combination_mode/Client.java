package com.ly.s18_combination_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 构造一个根目录对象
		Dir diskC = new Folder("C");
		// C盘根目录下有个c.txt的文件
		diskC.addDir(new File("c.txt"));
		// C盘根目录下有个两个子目录windows、Users
		Dir dirWin = new Folder("windows");
		diskC.addDir(dirWin);
		Dir dirUsers = new Folder("Users");
		diskC.addDir(dirUsers);
		// windows目录下有个w.txt文件
		dirWin.addDir(new File("w.txt"));
		// Users目录下有个Users.java文件
		dirUsers.addDir(new File("Users.java"));
		dirWin.clear();
		// 打印出文件结构
		diskC.print();
	}
}
