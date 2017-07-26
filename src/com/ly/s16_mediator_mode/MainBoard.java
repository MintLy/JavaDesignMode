package com.ly.s16_mediator_mode;
//主板
public class MainBoard extends Mediator
{
	private CDDevice mCdDevice;// 光驱设备
	private CPU mCpu;// CPU
	private SoundCard mSoundCard;// 声卡设备
	private GraphicsCard mGraphicsCard;// 显卡设备

	@Override
	public void changed(Equipment pEquipment)
	{
		// 如果是光驱则读取数据
		if (pEquipment == mCdDevice)
		{
			handleCD((CDDevice) pEquipment);
		}
		// 如果是CPU则处理数据
		else if (pEquipment == mCpu)
		{
			handleCPU((CPU) pEquipment);
		}
	}

	/**
	 * 处理光驱读取数据后与其它设备的交互
	 * 
	 * @param pColleague
	 */
	private void handleCD(CDDevice pCDDevice)
	{
		mCpu.decodeData(pCDDevice.read());
	}

	/**
	 * 处理CPU读取数据后与其它设备的交互
	 * 
	 * @param pCPU
	 */
	private void handleCPU(CPU pCPU)
	{
		mSoundCard.soundPlay(pCPU.getDataSound());
		mGraphicsCard.videoPlay(pCPU.getDataVideo());
	}

	/**
	 * 设置CD设备
	 * 
	 * @param mCdDevice
	 */
	public void setCdDevice(CDDevice mCdDevice)
	{
		this.mCdDevice = mCdDevice;
	}

	/**
	 * 设置CPU
	 * 
	 * @param mCpu
	 */
	public void setCpu(CPU mCpu)
	{
		this.mCpu = mCpu;
	}

	/**
	 * 设置声卡设备
	 * 
	 * @param mSoundCard
	 */
	public void setSoundCard(SoundCard mSoundCard)
	{
		this.mSoundCard = mSoundCard;
	}

	/**
	 * 设置显卡设备
	 * 
	 * @param mGraphicsCard
	 */
	public void setGraphicsCard(GraphicsCard mGraphicsCard)
	{
		this.mGraphicsCard = mGraphicsCard;
	}

}
