package stydentmas;

import java.util.Arrays;
import java.util.Scanner;

public class student {

	public student() {
		
	}
	public student(int id,String name,String gengder,int year,String grade,String site,String phone,String mail) {
		this.id = id;
		this.name = name;
		this.gengder = gengder;
		this.year = year;
		this.grade = grade;
		this.site = site;
		this.phone = phone;
		this.mail = mail;
	}
	int id;//id
	String name;//姓名
	String gengder;//性别
	int year;//年龄
	String grade;//所属年级，只能初级，中级，高级
	String site;//地址
	String phone;//十一位手机号
	String mail;//邮箱
	static student[] students = {};//学生档案
//一号学生信息
public student Fb() {
	id = 1;
	name = "张三";
	gengder = "男";
	year = 18;
	grade = "初级";
	site = "致馨公寓";
	phone = "15128317800";
	mail = "857539923@qq.com";
	return null;	
}

	public void xin() {
		Scanner sca = new Scanner(System.in);
		System.out.println("*************************添加学生信息*************************");
		System.out.print("请输入学生id：");
		int c = sca.nextInt();
			if (c == 3) {
				System.out.println("id 3 已存在，请重新输入");
				message aMessage = new message();
				aMessage.zmessage();
			}else {
				xin2();
			}
	}
	//添加数组元素
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
		student gh = new student(id, name, gengder, year, grade, site, phone, mail);
		students = Arrays.copyOf(students,students.length+1);
		students[students.length-1] = gh;
	}
	//返回学生数据
	public static student[] sty () {
		return students;
	}
	@Override
	public String toString() {
		return "学生: [id=" + id + ", 姓名=" + name + ", 性别=" + gengder + ", 年龄=" + year + ", 年级=" + grade
				+ ", 地址" + site + ", 手机号=" + phone + ", 邮箱=" + mail + "]";
	}
	
	
	
}
