package stydentmas;

import java.util.Scanner;

public class message {
	//����
//	public static void main(String[] args) {
//		message aRegister=new message();
//		aRegister.zmessage();
//	}
	
	public void zmessage() {
		message a1 =  new message();
		look dLook = new look();
		Scanner sca2 = new Scanner(System.in);
		System.out.println("******************************������Ҫ��������Ϣ��Ӧ����******************************");
		System.out.println("-1.�鿴ѧ����Ϣ\t2.���ѧ����Ϣ\t3.ɾ��ѧ����Ϣ\t4.�޸�ѧ����Ϣ\t5.�˳�-");
		System.out.println("********************************************************************************");
		System.out.print("�����룺");
		int b = sca2.nextInt();
		switch (b) {
		case 1:
			System.out.println("*************************�鿴ѧ����Ϣ*************************");
			dLook.look1();
			a1.zmessage();
			break;
		case 2:
				student skStudent =new student();
				skStudent.xin();
				System.out.println("���ݱ���ɹ����Զ�������һ�㡣");
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
			System.out.println("���˳�");
			System.exit(0);
			break;

		default:System.out.println("�����������������");
				a1.zmessage();
			break;
			}
		}
}
