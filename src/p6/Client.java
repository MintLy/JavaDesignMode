package p6;

/**
 * 迪米特原则
 * 
 * @author 20170117 一个对象应该对其他对象有最少的了解
 */
public class Client
{
	public static void main(String[] args)
	{
		Mediator m = new Mediator();
		Tenant t = new Tenant(15, 2200);
		t.rentRoom(m);
	}
}
