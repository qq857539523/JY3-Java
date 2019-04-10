package 日20190410;

public class Constructor {
	public Constructor() {
		System.out.println("父类");
	}
	public Constructor(String cName,int cYear) 
	{
		this.cName = cName;
		this.cYear = cYear;
		System.out.println("父类有参构造");
	}
	String cName;
	int cYear;
	double cHeight;
	double cWeight;
	public void Fb(int a) 
	{
		System.out.println(a);
		System.out.println("父类有参方法");
	}
}
class zhangsan extends Constructor
{
	public zhangsan() 
	{
		System.out.println("子类");
	}
	public zhangsan(String cName,int cYear) 
	{
		this.cName = cName;
		this.cYear = cYear;
		System.out.println("子类有参构造");
	}
}
