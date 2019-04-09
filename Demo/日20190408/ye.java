package 日20190408;

import java.util.Scanner;

public class ye {}
/*
 * 定义一个交通工具 属性：速度 体积 方法：移动 设置速度
 */
class Che {
	double su;
	double ti;
	
	public void bian() {
		System.out.println("车辆速度为"+su);
		System.out.println("车辆体积为"+ti);
		
		System.out.println("请输入变速1-3指令(错误后果自负)：");
		Scanner i = new Scanner(System.in);
		for (int j = 0; j < 10; j++) {
		int a = i.nextInt();
		switch (a) {
		case 1:
			System.out.println("车速不变   目前速度1。");
			break;
		case 2:
			System.out.println("汽车开始移动   目前速度2。");
			break;
		case 3:
			System.out.println("汽车开始移动   目前速度3。");
			break;
		
		default:
			j= 10;
			System.out.print("输入指令错误，进入自闭模式。");
			break;
		}
		
		}
		i.close();
	}

}
