package p6;

//房间
public class Room
{
	private float mArea;
	private float mPrice;

	public Room(float pArea, float pPrice)
	{
		this.mArea = pArea;
		this.mPrice = pPrice;
	}

	@Override
	public String toString()
	{
		return "Room [mArea=" + mArea + ", mPrice=" + mPrice + "]";
	}

	public float getArea()
	{
		return mArea;
	}

	public float getPrice()
	{
		return mPrice;
	}

}
