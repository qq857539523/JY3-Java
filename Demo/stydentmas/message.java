package stydentmas;

import java.util.Scanner;

public class message {
	//测试
//	public static void main(String[] args) {
//		message aRegister=new message();
//		aRegister.zmessage();
//	}
	
	public void zmessage() {
		message a1 =  new message();
		look dLook = new look();
		Scanner sca2 = new Scanner(System.in);
		System.out.println("******************************请输入要操作的信息对应数字******************************");
		System.out.println("-1.查看学生信息\t2.添加学生信息\t3.删除学生信息\t4.修改学生信息\t5.退出-");
		System.out.println("********************************************************************************");
		System.out.print("请输入：");
		int b = sca2.nextInt();
		switch (b) {
		case 1:
			System.out.println("*************************查看学生信息*************************");
			dLook.look1();
			a1.zmessage();
			break;
		case 2:
				student skStudent =new student();
				skStudent.xin();
				System.out.println("数据保存成功，自动返回上一层。");
				a1.zmessage();
			break;
		case 3:
			
			a1.zmessage();
			break;
		case 4:
			message2 aMessage2=new message2();
			aMessage2.message0();
			break;
		case 5:
			System.out.println("已退出");
			System.exit(0);
			break;

		default:System.out.println("输入错误，请重新输入");
				a1.zmessage();
			break;
			}
		}
}
