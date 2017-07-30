package p2;

public class CacheControl
{
	private MemoryCache mc = new MemoryCache();
	private FileCache fc = new FileCache();
	// private DoubleCache dc = new DoubleCache();

	public String readCacheData(int type)
	{
		String data = null;
		switch (type)
		{
			case 1:
				data = mc.cache();
				break;
			case 2:
				data = fc.cache();
				break;
			// case 3:
			// data = dc.cache();
			// break;
			default:
				break;
		}
		return data;
	}
}
