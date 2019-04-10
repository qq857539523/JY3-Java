package stydentmas;
/*
 * 主进程
 */
import java.util.Scanner;

public class register {
	public register() 
	{	
	}
	//一号学生信息
	public void Fb() {
		id = 1;
		name = "张三";
		gengder = "男";
		year = 18;
		grade = "初级";
		site = "致馨公寓";
		phone = "15128317800";
		mail = "857539923@qq.com";
	}
	public void Fb(int id,String name,String gengder,int year,String grade,String site,String phone,String mail) {
		this.id = id;
		this.name =name;
		this.gengder =gengder;
		this.year =year;
		this.grade=grade;
		this.site=site;
		this.phone=phone;
		this.mail=mail;
	}
	
	
	int id;//id
	String name;//姓名
	String gengder;//性别
	int year;//年龄
	String grade;//所属年级，只能初级，中级，高级
	String site;//地址
	String phone;//十一位手机号
	String mail;//邮箱
	
public void xin(int id,String name,String gengder,int year,String grade,String site,String phone,String mail) {
	this.id = id;
	this.name = name;
	this.gengder = gengder;
	this.year = year;
	this.grade = grade;
	this.site = site;
	this.phone = phone;
	this.mail = mail;
}
	public void xin2() {
		Scanner sca2 = new Scanner(System.in);
		System.out.println("请输入新生信息");
		System.out.print("学生id为：");
		id = sca2.nextInt();
		System.out.print("学生姓名为：");
		name = sca2.next();
		System.out.println("学生性别为：");
		gengder = sca2.next();
		System.out.println("学生年龄为：");
		year = sca2.nextInt();
		System.out.println("所属年级：");
		grade = sca2.next();
		System.out.println("地址为：");
		site = sca2.next();
		System.out.println("手机号为：");
		phone = sca2.next();
		System.out.println("邮箱为：");
		mail = sca2.next();
		register r1 = new register();
		r1.xin(id, name, gengder, year, grade, site, phone, mail);
		sca2.close();
	}
//	public void xin3() {
//		System.out.println("学生id为："+ id);
//		System.out.println("学生姓名为："+name);
//		System.out.println("学生性别为：" + gengder);
//		System.out.println("学生年龄为：" + year);
//		System.out.println("所属年级：" + grade);
//		System.out.println("地址为：" + site);
//		System.out.println("手机号为：" + phone);
//		System.out.println("邮箱为：" + mail);
//		System.out.println("数据保存成功！系统将自动返回上层目录");
//	}
	
	
	String ursename = "admin";
	String password = "admin";
	String un;
	String pw;
		//信息对应数字
		public void message() {
			System.out.println("******************************请输入要操作的信息对应数字******************************");
			System.out.println("-1.查看学生信息\t2.添加学生信息\t3.删除学生信息\t4.修改学生信息\t5.退出-");
			Scanner sca2 = new Scanner(System.in);
			System.out.println("********************************************************************************");
			System.out.print("请输入：");
			int b = sca2.nextInt();
			switch (b) {
			case 1:
				
				register a1 =  new register();
				a1.message();
				break;
			case 2:
				System.out.println("*************************添加学生信息*************************");
				System.out.print("请输入学生id：");
					for (int i = 0; i < 1000; i++) {
				 int  c = sca2.nextInt();
					if (c == 1) {
						System.out.println("此id已存在，请重新输入。。。");
					}else {
						i = 999;
					}
				}	
					xin2();					
//					xin3();
					System.out.println("数据保存成功，自动返回上一层。");
					register a2 =  new register();
					a2.message();
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("------------------------------------------------------------------");
				System.out.println("-1、根据id修改学生全部信息	2、根据id修改学生部分信息	3、返回上级	4、系统推出-");
				System.out.println("------------------------------------------------------------------");
				System.out.println("请选择：");
				Scanner a4 = new Scanner(System.in);
				int a = a4.nextInt();
				register a5;
				switch (a) {
				case 1:
					System.out.println("请输入要修改的id");
					for (int i = 0; i < 1000; i++) {
							a = a4.nextInt();
							if (a == 1) {
								System.out.println("请输入修改信息");
								register a5 =new register();
								
								a5.Fb(id, name, gengder, a, grade, site, phone, mail);
								int g = a4.nextInt();
								a5.id = g;
								
							}else {
								System.out.println("此id不存在，请重新输入。。。");
							}
						}	
					break;
				case 2:
					System.out.println("目前不支持修改部分，自动返回");
					a5.Fb(id, name, gengder, a, grade, site, phone, mail);
					Scanner a41 = new Scanner(System.in);
					int g = a41.nextInt();
					a5.id = g;
					register a21 =  new register();
					a21.message();
					break;
				case 3:
					System.out.println("即将返回。");
					register a41 =  new register();
					a41.message();
				break;
				case 4:
					System.out.println("即将退出");
				break;

				default:
					break;
				}
				
				break;
			case 5:
				
				break;

			default:
				break;
				}
			sca2.close();}
	
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
			default:System.out.println("已退出。");
				break;
			}
			System.out.print("请输入用户名：");
			un = sca.next();
			System.out.print("请输入密码：");
			pw = sca.next();
			if (un.equals(ursename)&&pw.equals(password)) {
				System.out.println("登录成功。"+"\n"+"欢迎你 admin。");
				message();
			}else {
				System.out.println("输入错误，程序退出！");
			}
		sca.close();
	    }
		
		
		
		
		
		
		
		
}
