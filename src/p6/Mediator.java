package p6;

import java.util.ArrayList;
import java.util.List;

//中介
public class Mediator
{
	private List<Room> mRooms = new ArrayList<Room>();

	public Mediator()
	{
		for (int i = 0; i < 5; i++)
		{
			mRooms.add(new Room(14 + i, (14 + i) * 150));
		}
	}

	public List<Room> getAllRooms()
	{
		return this.mRooms;
	}

	public Room rentRoom(float area, float price)
	{
		for (Room room : mRooms)
		{
			if (isSuitable(room, area, price))
			{
				return room;
			}
		}
		return null;
	}

	public boolean isSuitable(Room room, float roomArea, float roomPrice)
	{
		float price = Math.abs(room.getPrice() - roomPrice);
		float area = Math.abs(room.getArea() - roomArea);
		return price < Tenant.diffPrice && area < Tenant.diffArea;
	}
}
