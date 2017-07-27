package com.ly.s21_flyweight_mode;

public class Client
{
	public static void main(String[] args)
	{
		Ticket t1 = TicketFactory.getTicket("上海", "北京");
		t1.showTicketInfo();
		Ticket t2 = TicketFactory.getTicket("上海", "北京");
		t2.showTicketInfo();
		Ticket t3 = TicketFactory.getTicket("南京", "天津");
		t3.showTicketInfo();
	}
}
