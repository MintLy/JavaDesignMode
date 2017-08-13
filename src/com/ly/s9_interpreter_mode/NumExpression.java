package com.ly.s9_interpreter_mode;

//数字表达式(终结符表达式)
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
