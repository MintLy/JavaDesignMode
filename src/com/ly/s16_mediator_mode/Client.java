package com.ly.s16_mediator_mode;

public class Client
{
	public static void main(String[] args)
	{
		// 流程：光驱加载资源--->CPU执行光驱加载的资源--->CPU调用声卡和显卡驱动资源
		// 构造主板对象
		MainBoard mediator = new MainBoard();
		// 分别构造各个零件
		CDDevice cd = new CDDevice(mediator);
		CPU cpu = new CPU(mediator);
		SoundCard sc = new SoundCard(mediator);
		GraphicsCard gc = new GraphicsCard(mediator);
		// 将各个零部件安装到主板
		mediator.setCdDevice(cd);
		mediator.setCpu(cpu);
		mediator.setSoundCard(sc);
		mediator.setGraphicsCard(gc);
		// 开始放片
		cd.load();
	}
}
