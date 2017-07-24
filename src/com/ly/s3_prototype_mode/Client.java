package com.ly.s3_prototype_mode;

public class Client
{
	public static void main(String[] args)
	{
		WordDocument originDoc = new WordDocument();
		// 编辑文档 添加图片
		originDoc.setText("大众小吃");
		originDoc.addImage("图片1");
		originDoc.addImage("图片2");
		originDoc.addImage("图片3");
		originDoc.showDocument();
		WordDocument cloneDoc = originDoc.clone();
		cloneDoc.showDocument();
		cloneDoc.setText("修改过的cloneDoc文本");

		cloneDoc.showDocument();
		originDoc.showDocument();
		// ------------------我是分割线------------------
		cloneDoc.addImage("图片5");
		cloneDoc.showDocument();
		originDoc.showDocument();
	}
}
