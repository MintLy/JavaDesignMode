package com.ly.s21_flyweight_mode;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory
{
	static Map<String, Ticket> sTickets = new ConcurrentHashMap<String, Ticket>();

	public static Ticket getTicket(String pFrom, String pTo)
	{
		String key = pFrom + "-" + pTo;
		if (sTickets.containsKey(key))
		{
			System.out.printf("使用缓存--->key : %s\n", key);
			return sTickets.get(key);
		}
		else
		{
			System.out.printf("创建新的--->key : %s\n", key);
			TrainTicket trainTicket = new TrainTicket(pFrom, pTo);
			sTickets.put(key, trainTicket);
			return trainTicket;
		}
	}
}
