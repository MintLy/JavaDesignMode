package p3;

/**
 * 里氏替换原则
 * 
 * @author 20170117 所有引用基类的地方必须能透明的使用其子类的对象(继承、多态)
 * 父类对象可以引用子类实例来调用父类暴露的方法(抽象)
 */
public class Client
{
	public static void main(String[] args)
	{
		Window window = new Window();
		View tv1 = new TextView();
		View bt1 = new Button();
		window.show(tv1);
		window.show(bt1);
	}
}
