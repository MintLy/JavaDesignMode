package p5;

/**
 * 接口隔离原则
 * 
 * @author 20170117 客户的不应该依赖于它不需要的接口 类间的依赖关系应该建立在最小的接口上
 */
public class Client
{
	public static void main(String[] args)
	{
		Client c = new Client();
		// 发起请求
		System.out.println("发起请求");
		c.request(new CallBack()
		{
			@Override
			public void responseResult(String status)
			{
				System.err.printf("请求状态: %s ", status);
			}

			@Override
			public void requestResult(String status)
			{
				System.out.println("request()--->requestResult(String status)");
			}
		});
		c.response(new CallBack()
		{

			@Override
			public void responseResult(String status)
			{
				System.out
						.println("response()--->responseResult(String status)");
			}

			@Override
			public void requestResult(String status)
			{
				System.err.printf("响应状态: %s ", status);
			}
		});

		// File f = new File("D://a.txt");
		// FileOutputStream fos = null;
		// BufferedWriter bw = null;
		// try
		// {
		// if (!f.exists())
		// {
		// f.createNewFile();
		// }
		// fos = new FileOutputStream(f);
		// bw = new BufferedWriter(new OutputStreamWriter(fos));
		// bw.write("Hello world");
		// fos.flush();
		// }
		// catch (Exception e)
		// {
		// e.printStackTrace();
		// }
		// finally
		// {
		// if (bw != null)
		// {
		// try
		// {
		// bw.close();
		// }
		// catch (IOException e)
		// {
		// e.printStackTrace();
		// }
		// }
		// if (fos != null)
		// {
		// try
		// {
		// fos.close();
		// }
		// catch (IOException e)
		// {
		// e.printStackTrace();
		// }
		// }
		//
		// }
	}

	public void request(CallBack cb)
	{
		cb.requestResult("请求成功");
	}

	public void response(CallBack cb)
	{
		cb.requestResult("响应失败");
	}
}
