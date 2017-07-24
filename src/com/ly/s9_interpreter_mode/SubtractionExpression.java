package com.ly.s9_interpreter_mode;

public class SubtractionExpression extends OperatorExpression
{

	public SubtractionExpression(ArithmeticExpression pExp1,
			ArithmeticExpression pExp2)
	{
		super(pExp1, pExp2);
	}

	@Override
	public int interpret()
	{
		return exp1.interpret() - exp2.interpret();
	}

}
