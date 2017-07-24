package com.ly.s9_interpreter_mode;

public class NumExpression extends ArithmeticExpression
{
	private int num;

	public NumExpression(int pNum)
	{
		this.num = pNum;
	}

	@Override
	public int interpret()
	{
		return this.num;
	}

}
