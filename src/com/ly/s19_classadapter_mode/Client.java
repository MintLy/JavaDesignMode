package com.ly.s19_classadapter_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 墙上只有三孔插头,拿着套好三孔插头的两孔充电器
		Charges charges = new ThreeHoleChargerAdapter();
		// 进行充电
		charges.ThreeHoleCharges();
	}
}
