package ��20190410;

public class Constructor {
	public Constructor() {
		System.out.println("����");
	}
	public Constructor(String cName,int cYear) 
	{
		this.cName = cName;
		this.cYear = cYear;
		System.out.println("�����вι���");
	}
	String cName;
	int cYear;
	double cHeight;
	double cWeight;
	public void Fb(int a) 
	{
		System.out.println(a);
		System.out.println("�����вη���");
	}
}
class zhangsan extends Constructor
{
	public zhangsan() 
	{
		System.out.println("����");
	}
	public zhangsan(String cName,int cYear) 
	{
		this.cName = cName;
		this.cYear = cYear;
		System.out.println("�����вι���");
	}
}
