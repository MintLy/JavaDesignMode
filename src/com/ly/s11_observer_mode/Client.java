package com.ly.s11_observer_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 被观察的角色
		Server server = new Server();
		// 观察者
		Coder c1 = new Coder("c1");
		Coder c2 = new Coder("c2");
		Coder c3 = new Coder("c3");
		// 将观察者注册到可观察对象的观察者列表中
		server.addObserver(c1);
		server.addObserver(c2);
		server.addObserver(c3);
		// 服务器给所有程序员发送消息
		server.sendNotification("服务器崩溃,请及时处理");
	}
}
