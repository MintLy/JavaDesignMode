package p4;

public class DoubleCache implements Cache
{

	@Override
	public String cache()
	{
		return "优先从内存中读取缓存,内存没有则从文件中读取";
	}

}
