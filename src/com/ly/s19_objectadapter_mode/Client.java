package com.ly.s19_objectadapter_mode;

public class Client
{
	public static void main(String[] args)
	{
		TwoHolesCharger twoHoles = new TwoHolesCharger();
		// 墙上只有三孔插头,拿着套好三孔插头的两孔充电器
		Charges charges = new ThreeHoleChargerAdapter(twoHoles);
		// 进行充电
		charges.ThreeHoleCharges();
	}
}
