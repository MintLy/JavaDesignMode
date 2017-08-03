package com.ly.s8_dutyLink_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 构造各个领导对象
		Liang liang = new Liang();
		Song song = new Song();
		Chu chu = new Chu();
		// 设置上一级领导处理者对象
		liang.nextHandler = song;
		song.nextHandler = chu;
		// 发起报销申请
		liang.handlerRquest(50000);
	}
}
