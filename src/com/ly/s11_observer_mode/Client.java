package com.ly.s11_observer_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 被观察的角色
		Server server = new Server();
		// 观察者
		Coder oldWang = new Coder("老王");
		Coder oldLuo = new Coder("老罗");
		Coder oldZhang = new Coder("老张");
		// 将观察者注册到可观察对象的观察者列表中
		server.addObserver(oldWang);
		server.addObserver(oldLuo);
		server.addObserver(oldZhang);
		// 服务器给所有程序员发送消息
		server.sendNotification("下午两点大会议室周例会");
	}
}
