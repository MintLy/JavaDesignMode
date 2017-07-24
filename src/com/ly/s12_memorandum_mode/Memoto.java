package com.ly.s12_memorandum_mode;

public class Memoto
{
	private int mCheckpoint;
	private int mlifeValue;
	private String mWeapon;

	public int getCheckpoint()
	{
		return mCheckpoint;
	}

	public void setCheckpoint(int checkpoint)
	{
		mCheckpoint = checkpoint;
	}

	public int getLifeValue()
	{
		return mlifeValue;
	}

	public void setLifeValue(int mlifeValue)
	{
		this.mlifeValue = mlifeValue;
	}

	public String getWeapon()
	{
		return mWeapon;
	}

	public void setWeapon(String weapon)
	{
		mWeapon = weapon;
	}

	@Override
	public String toString()
	{
		return "Memoto [mCheckpoint=" + mCheckpoint + ", mlifeValue="
				+ mlifeValue + ", mWeapon=" + mWeapon + "]";
	}

}
