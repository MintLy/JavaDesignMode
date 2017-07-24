package com.ly.s11_observer_mode;

import java.util.Observable;

public class Server extends Observable
{
	public void sendNotification(String pContent)
	{
		// 标识状态或者内容发生改变
		setChanged();
		// 通知所有观察者
		notifyObservers(pContent);
	}

}
