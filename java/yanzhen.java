import java.util.*;
public class yanzhen{
	public static void main(String[] args){
		/*第一题
		
		int l = 48;
		char a = (char)l;
		char p = '中';
		int n = (int)p;
		System.out.println(n);
		System.out.println(a);
		*/
		
		/*第二题
		
		int y = 45;
		fang(y);
		System.out.println(fang(y)); 
		*/
		/*第三题
		int f = 3;
		fan(f);
		fanz(f);
		System.out.println(fan(f)); 
		System.out.println(fanz(f)); 
		*/
		
		
		
		/*第五题
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int num= scanner.nextInt();
		System.out.println("该学生成绩为" + num);
		if(num >= 90 && num<= 100){
		System.out.println("优秀");
		}
		if(num >= 80 && num<= 90){
		System.out.println("良好");
		}
		if(num < 80 ){
		System.out.println("不及格");
		}else{
		System.out.println("Super man");
		}
		*/
		
		/*第六题
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入1：");
		int num= scanner.nextInt();
		int a=0;
		while(a < 1){
		if(num == 1){
		break;
		}else{
			System.out.println("请输入1：");
			num= scanner.nextInt();
			}

		}
		*/
		
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入x1坐标点");
		int sca = sca nextInt();
		System.out.println("请输入y1坐标点");
		scar = new nextInt();
		System.out.println("请输入x2坐标点");
		sca = new nextInt();
		System.out.println("请输入y2坐标点");
		sca = new nextInt();
		t(sca);





	/*	第八题：
		
		int[] a = {6,9,2,1,1,6,8,5,1,1,2,8};
		int bm1 = 0;
		int bm2 = 0;
		for(int i=0;i< a.length;i++)
		{
			if(i % 2 ==0){
			bm1 += a[i];
			}else
				{
				bm2 += a[i];
				}
			
		}
	System.out.println("奇数: " + bm1);
	System.out.println("偶数: " + bm2);

	
	int cc = (((bm1 + bm2 * 3) % (0 - 10)) %10);
	System.out.println("最终结果为"+cc);
	*/

	}


	/*第二题
	public static int fang(int x)
	{
		int xz = 0;
		xz = x * x - 2*x + 4;
		return xz;
	}
	*/
	/*
	public static int fan(int x)
	{
		int z = 0;
		z = x%3;
		return z;
	}
	public static int fanz(int c)
	{
		int v = 0;
		v = c++;
		return v;
	}
	*/
	


	public static int t(int x1,int y1,int x2, int y2)
		{
			d=(x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
			n=Math.sqrt(d);
			return n;
	}


}