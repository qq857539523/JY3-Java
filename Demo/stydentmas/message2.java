package stydentmas;

import java.util.Scanner;

public class message2 {
	public void message0() {
	message a1 =  new message();
	student [] c1 = student.students;
	System.out.println("------------------------------------------------------------------");
	System.out.println("-1、根据id修改学生全部信息	2、根据id修改学生部分信息	3、返回上级	4、系统退出-");
	System.out.println("------------------------------------------------------------------");
	System.out.println("请选择：");
	Scanner a4 = new Scanner(System.in);
	int a = a4.nextInt();
	switch (a) {
	case 1:
		
		break;
	case 2:
		System.out.println("请输入要修改的id");
		for (int i = 0; i < c1.length; i++) {
			int hb = a4.nextInt();
			if (hb == c1[i].id) {
				System.out.println("请输入更改后id");
				int hb1 = a4.nextInt();	
				c1[i].id = hb1;
				i = hb1;
				System.out.println("修改成功，返回上一层");
				message0();
			}else {
				System.out.println("输入错误，返回上一层");
				message0();
			}					
		}
		
		a1.zmessage();
		break;
	case 3:
		System.out.println("即将返回。");
		
		a1.zmessage();
	break;
	case 4:
		System.out.println("即将退出");
	break;

	default:System.out.println("输入错误请重新输入");
		message0();
		break;
	
		}
	}
}
