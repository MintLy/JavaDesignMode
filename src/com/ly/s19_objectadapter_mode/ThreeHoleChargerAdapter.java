package com.ly.s19_objectadapter_mode;

public class ThreeHoleChargerAdapter implements Charges
{
	private TwoHolesCharger mTwoHolesCharger;

	public ThreeHoleChargerAdapter(TwoHolesCharger pTwoHolesCharger)
	{
		this.mTwoHolesCharger = pTwoHolesCharger;
	}

	@Override
	public void ThreeHoleCharges()
	{
		// 给两孔充电器套上一个三孔插头
		this.mTwoHolesCharger.TwoHolesCharges();
	}

}
