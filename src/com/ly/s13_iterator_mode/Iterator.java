package com.ly.s13_iterator_mode;

public interface Iterator
{

	/**
	 * 释放还有下一个元素
	 * 
	 * @return
	 */
	boolean hasNext();

	/**
	 * 返回当前位置的元素,并将位置移至下一位
	 * 
	 * @return
	 */
	Object next();
}
