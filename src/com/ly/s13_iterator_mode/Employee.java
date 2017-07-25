package com.ly.s13_iterator_mode;

public class Employee
{
	private String mName;// 姓名
	private int mAage;// 年龄
	private String mSex;// 性别
	private String mPosition;// 职位

	public Employee(String pName, int pAge, String pSex, String pPosition)
	{
		this.mName = pName;
		this.mAage = pAge;
		this.mSex = pSex;
		this.mPosition = pPosition;
	}

	@Override
	public String toString()
	{
		return "Employee [mName=" + mName + ", mAage=" + mAage + ", mSex="
				+ mSex + ", mPosition=" + mPosition + "]";
	}

}
