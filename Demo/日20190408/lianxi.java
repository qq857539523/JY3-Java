package ��20190408;

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
		System.out.println("�������˺ţ�");
		for (int i = 0; i < username.length; i++) {
			a[i] = sca.next();
		}
		System.out.println("���������룺");
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
	
	
	
	
	
	
	
	
	//	//������
//	public static void main(String[] args) 
//	{
//	lianxi a = new lianxi();
//	System.out.println("����"+a.lei);
//	System.out.println("����"+a.name);
//	System.out.println("����"+a.year);
//	
//	}
//	
//	
//	public lianxi() 
//	{
//		System.out.println("������");
//		String hb = "�ϲ�";
//		System.out.println(hb);
//		lei = "����";
//		name = "hb";
//		year = 36;
//	}
//	String name;
//	String lei;
//	int year;
//	
	
	
	
	//�ݹ�
//	public int name(int num) {	
//		if(num<=1) //if(num==1||num==0)
//		{
//			return 1;
//		}else {
//			return name(num-9)*num;
//		}
//	}
	
	
	
	
	
	
	/*
	 * ����һ���飺 Ҫ�� ���� ҳ�� ��Ǯ ���� ISBN ���� ������ ��Ϊ�� ���� �ղ� ���� ���� ���� ���ؼ۸�
	 */
//	public static void main(String[] args) {
//		Book book = new Book();
//		book.Name = "����һ���ֲ���";
//		book.Ye = 120;
//		book.Qian = 0;
//		book.Zuo = "��";
//		book.ISBN = 312465;
//		book.Type = "��Ц";
//		book.Dian = "����";
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
//	// ����
//	public void Xingw() {
//		System.out.println(Name + " ҳ��" + Ye);
//		System.out.println("��" + Qian);
//		System.out.println("����:" + Zuo);
//		System.out.println("���:" + ISBN);
//		System.out.println("����:" + Type);
//		System.out.println("������:" + Dian);
//		System.out.println("��������ְ���");
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
//	//��Ա���
//	public double Area() {
//		double a = 3.14 * r * r;	
//		return a;
//	}
}



