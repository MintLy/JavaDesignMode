package p6;

import java.util.List;

public class Tenant
{
	private float roomArea;
	private float roomPrice;
	public static final float diffPrice = 100.0001f;
	public static final float diffArea = 0.00001f;

	public Tenant(float pRoomArea, float pRoomPrice)
	{
		this.roomArea = pRoomArea;
		this.roomPrice = pRoomPrice;
	}

	public void rentRoom(Mediator mediator)
	{
		List<Room> rooms = mediator.getAllRooms();
		for (Room room : rooms)
		{
			if (isSuitable(room))
			{
				System.out.printf("找到合适的房子啦: %s ", room.toString());
			}
		}
	}

	public boolean isSuitable(Room room)
	{
		float price = Math.abs(room.getPrice() - roomPrice);
		float area = Math.abs(room.getArea() - roomArea);
		return price < diffPrice && area < diffArea;
	}

//	public void rentRoom(Mediator mediator)
//	{
//		Room rentRoom = mediator.rentRoom(roomArea, roomPrice);
//		if (rentRoom != null)
//		{
//			System.out.printf("找到合适的房子啦: %s ", rentRoom.toString());
//		}
//	}
}
