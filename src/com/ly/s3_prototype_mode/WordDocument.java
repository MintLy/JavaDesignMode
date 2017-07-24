package com.ly.s3_prototype_mode;

import java.util.ArrayList;

public class WordDocument implements Cloneable
{
	// 文本
	private String mText;
	// 图片名列表
	private ArrayList<String> mImages = new ArrayList<String>();

	public WordDocument()
	{
		System.out.println("WordDocument 构造啦");
	}

	@Override
	protected WordDocument clone()
	{
		try
		{
			WordDocument doc = (WordDocument) super.clone();
			doc.mText = this.mText;
			doc.mImages = this.mImages;
			// ------------------我是分割线------------------
			// doc.mImages = (ArrayList<String>) this.mImages.clone();
			return doc;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public void setText(String pText)
	{
		this.mText = pText;
	}

	public String getText()
	{
		return this.mText;
	}

	public ArrayList<String> getImages()
	{
		return this.mImages;
	}

	public void addImage(String pImage)
	{
		this.mImages.add(pImage);
	}

	public void showDocument()
	{
		System.out.println("---------- Start -----");
		System.out.println("Text:" + this.mText);
		System.out.println("Images list:");
		for (String img : this.mImages)
		{
			System.out.println("image name:" + img);
		}
		System.out.println("---------- Stop -----");
	}
}
