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
	String name;//����
	String gengder;//�Ա�
	int year;//����
	String grade;//�����꼶��ֻ�ܳ������м����߼�
	String site;//��ַ
	String phone;//ʮһλ�ֻ���
	String mail;//����
	static student[] students = {};//ѧ������
//һ��ѧ����Ϣ
public student Fb() {
	id = 1;
	name = "����";
	gengder = "��";
	year = 18;
	grade = "����";
	site = "��ܰ��Ԣ";
	phone = "15128317800";
	mail = "857539923@qq.com";
	return null;	
}

	public void xin() {
		Scanner sca = new Scanner(System.in);
		System.out.println("*************************���ѧ����Ϣ*************************");
		System.out.print("������ѧ��id��");
		int c = sca.nextInt();
			if (c == 3) {
				System.out.println("id 3 �Ѵ��ڣ�����������");
				message aMessage = new message();
				aMessage.zmessage();
			}else {
				xin2();
			}
	}
	//�������Ԫ��
	public void xin2() {
		Scanner sca2 = new Scanner(System.in);
		System.out.println("������������Ϣ");
		System.out.print("ѧ��idΪ��");
		id = sca2.nextInt();
		System.out.print("ѧ������Ϊ��");
		name = sca2.next();
		System.out.println("ѧ���Ա�Ϊ��");
		gengder = sca2.next();
		System.out.println("ѧ������Ϊ��");
		year = sca2.nextInt();
		System.out.println("�����꼶��");
		grade = sca2.next();
		System.out.println("��ַΪ��");
		site = sca2.next();
		System.out.println("�ֻ���Ϊ��");
		phone = sca2.next();
		System.out.println("����Ϊ��");
		mail = sca2.next();
		student gh = new student(id, name, gengder, year, grade, site, phone, mail);
		students = Arrays.copyOf(students,students.length+1);
		students[students.length-1] = gh;
	}
	//����ѧ������
	public static student[] sty () {
		return students;
	}
	@Override
	public String toString() {
		return "ѧ��: [id=" + id + ", ����=" + name + ", �Ա�=" + gengder + ", ����=" + year + ", �꼶=" + grade
				+ ", ��ַ" + site + ", �ֻ���=" + phone + ", ����=" + mail + "]";
	}
	
	
	
}
