package com.ly.s21_flyweight_mode;

import java.util.Random;

public class TrainTicket implements Ticket
{
	private String mFrom;// 始发地
	private String mTo;// 目的地
	private String mBunk;// 铺位
	private int mPrice;// 票价

	public TrainTicket(String pFrom, String pTo)
	{
		this.mFrom = pFrom;
		this.mTo = pTo;
		mPrice = new Random().nextInt(300);
		int type = new Random().nextInt(3) + 1;
		switch (type)
		{
			case 1:
				mBunk = "上铺";
				break;
			case 2:
				mBunk = "中铺";
				break;
			case 3:
				mBunk = "下铺";
				break;
			default:
				break;
		}
	}

	@Override
	public void showTicketInfo()
	{
		System.out.printf("购买 从  %s 到 %s 的 %s 火车票,价格为 : %d\n", mFrom, mTo,
				mBunk, mPrice);
	}

}
