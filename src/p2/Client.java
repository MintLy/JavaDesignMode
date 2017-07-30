package p2;

/**
 * 关闭原则
 * 
 * @author 20170117 软件中的对象(类、模块、函数等)应该对于扩展是开放的，但是，对于修改是封闭的.
 */
public class Client
{
	public static void main(String[] args)
	{
		CacheControl cc = new CacheControl();
		//1:内存缓存 2:文件缓存 3:双重缓存
		String readCacheData = cc.readCacheData(1);
		System.out.println(readCacheData);
	}
}
