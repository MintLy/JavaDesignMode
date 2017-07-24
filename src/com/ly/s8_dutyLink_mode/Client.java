package com.ly.s8_dutyLink_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 构造各个领导对象
		GroupLeader groupLeader = new GroupLeader();
		Director director = new Director();
		Manager manager = new Manager();
		Boss boss = new Boss();
		// 设置上一级领导处理者对象
		groupLeader.nextHandler = director;
		director.nextHandler = manager;
		manager.nextHandler = boss;
		// 发起报销申请
		groupLeader.handlerRquest(50);
	}
}
