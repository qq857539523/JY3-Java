import java.util.Random;
import java.util.Scanner;
public class lx{
public static void main(String[] args){
		int a = 0 , b = 0 ;
		a = a + 20; b = b + 21;
		int c = a + b;
		System.out.println(c);
	
		int zs =19;
		System.out.println(Integer.toBinaryString(zs));
		System.out.println(Integer.toOctalString(zs));
		System.out.println(Integer.toHexString(zs));		

		long bl1=12345678901l;
		float bl2=3.1415926f;
		double bl3=1234567890.0987654321d;
		System.out.println(bl1);
		System.out.println(bl2);
		System.out.println(bl3);

		

		
		Random r1 = new Random();
		int l = r1.nextInt(24)+65;
		System.out.println((char)l);
		int x = 97;
		System.out.println((char)x);
		char s = '0' ;
		System.out.println((int)s);

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个值:");
		int str = scanner.nextInt();
		System.out.println("这个值的平方为："+str*str);


		//鹊桥
		double bird = 0.00045;
		double lightYear = 9460500000000.0 * 4.2;
		System.out.println(lightYear/bird);



		double xc = 2 * 9.8 * 384;
		System.out.println(Math.sqrt(xc));

	}
}
/*	

	错误：
	Scanner input = nre Scanner(System.in)
	System.out.print("请输入一个值");
	String str = input.next();
	System.out.print("这个值的平方为："+ str*str)
*/