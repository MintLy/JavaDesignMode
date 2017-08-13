package com.ly.s9_interpreter_mode;

//操作符表达式(非终结符表达式)
public abstract class OperatorExpression extends ArithmeticExpression
{
	// 声明两个成员变量存储运算符号两边的数字解释器
	protected ArithmeticExpression exp1, exp2;

	public OperatorExpression(ArithmeticExpression pExp1,
			ArithmeticExpression pExp2)
	{
		this.exp1 = pExp1;
		this.exp2 = pExp2;
	}
}
