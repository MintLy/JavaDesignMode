package com.ly.s9_interpreter_mode;

//加法表达式
public class AdditionExpression extends OperatorExpression
{
	public AdditionExpression(ArithmeticExpression pExp1,
			ArithmeticExpression pExp2)
	{
		super(pExp1, pExp2);
	}

	public int interpret()
	{
		return exp1.interpret() + exp2.interpret();
	}
}
