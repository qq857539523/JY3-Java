package stydentmas;
/*
 * 主进程
 */
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class register {
	public register() 
	{	
	}
	
	int id;//id
	String name;//姓名
	String gengder;//性别
	int year;//年龄
	String grade;//所属年级，只能初级，中级，高级
	String site;//地址
	String phone;//十一位手机号
	String mail;//邮箱	
	
	String ursename = "admin";
	String password = "admin";
	String un;
	String pw;
	
		//测试
//		public static void main(String[] args) {
//			register aRegister =new register();
//			aRegister.entrance();
//		}
		//登录
	    public void entrance() {
	    	Scanner sca = new Scanner(System.in);
			System.out.println("-----------------欢迎 登录学生管理系统-----------------");
			System.out.println(" 1、进入      2、退出 ");
			System.out.println("--------------------------------------------------");
			System.out.print("请选择：");
			int a = sca.nextInt();
			switch (a) {
			case 1:
				System.out.println("欢迎登录！");
				break;
			case 2:
				System.out.println("已退出。");
				System.exit(0);
				break;
			default:System.out.println("输入错误请重新输入");
//				register aRegister =new register();
				entrance();
				break;
			}
			System.out.print("请输入用户名：");
			un = sca.next();
			System.out.print("请输入密码：");
			pw = sca.next();
			if (un.equals(ursename)&&pw.equals(password)) {
				System.out.println("登录成功。"+"\n"+"欢迎你 admin。");
				message ahMessage=new message();
				ahMessage.zmessage();
			}else {
				System.out.println("输入错误，程序退出！");
			}
		
	    }
		
}
