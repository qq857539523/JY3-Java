package stydentmas;
/*
 * ������
 */
import java.util.Scanner;

public class register {
	public register() 
	{	
	}
	//һ��ѧ����Ϣ
	public void Fb() {
		id = 1;
		name = "����";
		gengder = "��";
		year = 18;
		grade = "����";
		site = "��ܰ��Ԣ";
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
	String name;//����
	String gengder;//�Ա�
	int year;//����
	String grade;//�����꼶��ֻ�ܳ������м����߼�
	String site;//��ַ
	String phone;//ʮһλ�ֻ���
	String mail;//����
	
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
		register r1 = new register();
		r1.xin(id, name, gengder, year, grade, site, phone, mail);
		sca2.close();
	}
//	public void xin3() {
//		System.out.println("ѧ��idΪ��"+ id);
//		System.out.println("ѧ������Ϊ��"+name);
//		System.out.println("ѧ���Ա�Ϊ��" + gengder);
//		System.out.println("ѧ������Ϊ��" + year);
//		System.out.println("�����꼶��" + grade);
//		System.out.println("��ַΪ��" + site);
//		System.out.println("�ֻ���Ϊ��" + phone);
//		System.out.println("����Ϊ��" + mail);
//		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼");
//	}
	
	
	String ursename = "admin";
	String password = "admin";
	String un;
	String pw;
		//��Ϣ��Ӧ����
		public void message() {
			System.out.println("******************************������Ҫ��������Ϣ��Ӧ����******************************");
			System.out.println("-1.�鿴ѧ����Ϣ\t2.���ѧ����Ϣ\t3.ɾ��ѧ����Ϣ\t4.�޸�ѧ����Ϣ\t5.�˳�-");
			Scanner sca2 = new Scanner(System.in);
			System.out.println("********************************************************************************");
			System.out.print("�����룺");
			int b = sca2.nextInt();
			switch (b) {
			case 1:
				
				register a1 =  new register();
				a1.message();
				break;
			case 2:
				System.out.println("*************************���ѧ����Ϣ*************************");
				System.out.print("������ѧ��id��");
					for (int i = 0; i < 1000; i++) {
				 int  c = sca2.nextInt();
					if (c == 1) {
						System.out.println("��id�Ѵ��ڣ����������롣����");
					}else {
						i = 999;
					}
				}	
					xin2();					
//					xin3();
					System.out.println("���ݱ���ɹ����Զ�������һ�㡣");
					register a2 =  new register();
					a2.message();
				break;
			case 3:
				
				break;
			case 4:
				System.out.println("------------------------------------------------------------------");
				System.out.println("-1������id�޸�ѧ��ȫ����Ϣ	2������id�޸�ѧ��������Ϣ	3�������ϼ�	4��ϵͳ�Ƴ�-");
				System.out.println("------------------------------------------------------------------");
				System.out.println("��ѡ��");
				Scanner a4 = new Scanner(System.in);
				int a = a4.nextInt();
				register a5;
				switch (a) {
				case 1:
					System.out.println("������Ҫ�޸ĵ�id");
					for (int i = 0; i < 1000; i++) {
							a = a4.nextInt();
							if (a == 1) {
								System.out.println("�������޸���Ϣ");
								register a5 =new register();
								
								a5.Fb(id, name, gengder, a, grade, site, phone, mail);
								int g = a4.nextInt();
								a5.id = g;
								
							}else {
								System.out.println("��id�����ڣ����������롣����");
							}
						}	
					break;
				case 2:
					System.out.println("Ŀǰ��֧���޸Ĳ��֣��Զ�����");
					a5.Fb(id, name, gengder, a, grade, site, phone, mail);
					Scanner a41 = new Scanner(System.in);
					int g = a41.nextInt();
					a5.id = g;
					register a21 =  new register();
					a21.message();
					break;
				case 3:
					System.out.println("�������ء�");
					register a41 =  new register();
					a41.message();
				break;
				case 4:
					System.out.println("�����˳�");
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
	
		//��¼
	    public void entrance() {
	    	Scanner sca = new Scanner(System.in);
			System.out.println("-----------------��ӭ ��¼ѧ������ϵͳ-----------------");
			System.out.println(" 1������      2���˳� ");
			System.out.println("--------------------------------------------------");
			System.out.print("��ѡ��");
			int a = sca.nextInt();
			switch (a) {
			case 1:
				System.out.println("��ӭ��¼��");
				break;
			default:System.out.println("���˳���");
				break;
			}
			System.out.print("�������û�����");
			un = sca.next();
			System.out.print("���������룺");
			pw = sca.next();
			if (un.equals(ursename)&&pw.equals(password)) {
				System.out.println("��¼�ɹ���"+"\n"+"��ӭ�� admin��");
				message();
			}else {
				System.out.println("������󣬳����˳���");
			}
		sca.close();
	    }
		
		
		
		
		
		
		
		
}
