public class While2
{
	public static void main(String[] atgs)
	{
		int a =97;
		System.out.println(zh1(a));
		char b = '中';
		System.out.println(zh2(b));



	}
	//int类型转char类型方法
	public static char zh1(int le1)
	{
		char lt = (char)le1;
		return lt;
	}
	public static int zh2(char le2)
		{
		int lr = (char)le2;
		return lr;
	}


}
