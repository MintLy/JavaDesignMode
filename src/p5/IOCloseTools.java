package p5;

import java.io.Closeable;
import java.io.IOException;

public class IOCloseTools
{
	private static IOCloseTools INSTANCE;

	private IOCloseTools()
	{
	}

	public static IOCloseTools getInstance()
	{
		if (INSTANCE == null)
		{
			synchronized (IOCloseTools.class)
			{
				INSTANCE = new IOCloseTools();
			}
		}
		return INSTANCE;
	}

	public void closeObj(Closeable obj)
	{
		if (obj != null)
		{
			try
			{
				obj.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
