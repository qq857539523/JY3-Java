package 日20190408;

import java.util.Scanner;

public class lianxi {
	public lianxi()
	{
		username = new String[] {"a","b","c"};
		password = new String[] {"1","2","3"};
	}
	String[] username;
	String[] password;	
	public boolean checkUser() 
	{	Scanner sca = new Scanner(System.in);
		
		String[] a = new String[username.length];
		String[] b = new String[password.length];
		System.out.println("请输入账号：");
		for (int i = 0; i < username.length; i++) {
			a[i] = sca.next();
		}
		System.out.println("请输入密码：");
		for (int j = 0; j < password.length; j++) {
			b[j] = sca.next();
		}
		sca.close();
		if(username.equals(a)&&password.equals(b)) 
		{
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
	
	
	
	
	//	//构造器
//	public static void main(String[] args) 
//	{
//	lianxi a = new lianxi();
//	System.out.println("种族"+a.lei);
//	System.out.println("名字"+a.name);
//	System.out.println("年龄"+a.year);
//	
//	}
//	
//	
//	public lianxi() 
//	{
//		System.out.println("构造器");
//		String hb = "合并";
//		System.out.println(hb);
//		lei = "人类";
//		name = "hb";
//		year = 36;
//	}
//	String name;
//	String lei;
//	int year;
//	
	
	
	
	//递归
//	public int name(int num) {	
//		if(num<=1) //if(num==1||num==0)
//		{
//			return 1;
//		}else {
//			return name(num-9)*num;
//		}
//	}
	
	
	
	
	
	
	/*
	 * 定义一本书： 要求： 书名 页数 价钱 作者 ISBN 类型 出版社 行为： 看书 收藏 买书 单价 数量 返回价格
	 */
//	public static void main(String[] args) {
//		Book book = new Book();
//		book.Name = "我有一座恐怖屋";
//		book.Ye = 120;
//		book.Qian = 0;
//		book.Zuo = "大锤";
//		book.ISBN = 312465;
//		book.Type = "搞笑";
//		book.Dian = "盗版";
//		book.Xingw();
//	}
//	public static void main(String[] args) 
//	{
//	circle n = new circle();
//	n.r = 10;
//	System.out.println(n.Area());
//	}
//	
//	
//	
//public lianxi(int x,int y) 
//{	
//}
//}
//
//
//
//
//class Book {
//	String Name;
//	int Ye;
//	double Qian;
//	String Zuo;
//	double ISBN;
//	String Type;
//	String Dian;
//
//	// 送书
//	public void Xingw() {
//		System.out.println(Name + " 页数" + Ye);
//		System.out.println("金额：" + Qian);
//		System.out.println("作者:" + Zuo);
//		System.out.println("编号:" + ISBN);
//		System.out.println("种类:" + Type);
//		System.out.println("出版社:" + Dian);
//		System.out.println("盗版书清仓白送");
//	}
//
//}
//
//
//
//class circle
//{
//	double p;
//	int r;
//	//球员面积
//	public double Area() {
//		double a = 3.14 * r * r;	
//		return a;
//	}
}



