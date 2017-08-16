package com.ly.s19_classadapter_mode;

public class ThreeHoleChargerAdapter extends TwoHolesCharger implements Charges
{

	@Override
	public void ThreeHoleCharges()
	{
		// 给两孔充电器套上一个三孔插头
		super.TwoHolesCharges();
	}

}
