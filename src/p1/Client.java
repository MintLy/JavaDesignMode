package p1;

/**
 * 单一职责原则
 * 
 * @author 20170117 
 * 一个类中应该是一组相关性很高的函数、数据的封装
 */
public class Client
{
	public static void main(String[] args)
	{
		Client c1 = new Client();
		String readData = c1.readData();
		c1.display(readData);
		// DBHelp dbh = new DBHelp();
		// DisplayHelp dh = new DisplayHelp();
		// String readData = dbh.readData();
		// dh.display(readData);
	}

	/**
	 * 从数据库读取数据
	 * 
	 * @return
	 */
	public String readData()
	{
		return "数据";
	}

	public void display(String pData)
	{
		System.out.printf("展示数据: %s ", pData);
	}
}
