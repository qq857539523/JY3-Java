package stydentmas;

import java.util.Arrays;
import java.util.Scanner;

import 结婚.chong1;

public class look {
	
	
	
	
	public void look1() {
		student as = new student();
		look aLook = new look();
		student [] c1 = student.students;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1、查看所有学生信息	2、根据id查询学生信息	3、根据id查询学生姓名	4、返回上一层");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("请选择：");
		Scanner scanner  = new Scanner(System.in);
		int a = scanner.nextInt();
		switch (a) {
		case 1:
			for (int i = 0; i < c1.length; i++) {
				System.out.println(c1[i].toString());
				
			}
			aLook.look1();
			break;
		case 2:
			
			System.out.println("请输入要查询的id：");
			Scanner sca2 = new Scanner(System.in);
			int asx = sca2.nextInt();
			for (int i = 0; i < c1.length; i++) {
				if (asx == c1[i].id) {
					System.out.println(c1[i].toString());
					System.out.println("查询完毕，返回上一层");
					aLook.look1();
				}
			}
//			as.zu();
			aLook.look1();
			break;
		case 3:
			aLook.look1();
			break;
		case 4:
			message a1 =  new message();
			a1.zmessage();
			break;

		default:System.out.println("输入失败，请重新输入");
			aLook.look1();
			break;
		}
	
	}
}
