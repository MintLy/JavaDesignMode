package p4;

/**
 * 依赖倒置原则
 * 
 * @author 20170117
 * 
 *         高层模块不该依赖底层模块的实现细节，两者都依赖于抽象 抽象不依赖于细节 细节依赖抽象 
 *         面向接口/抽象编程
 */
public class Client
{
	public static void main(String[] args)
	{
		CacheControl cc = new CacheControl();
		String readCacheData = cc.readCacheData(1);
		System.out.println(readCacheData);
	}
}
