package stydentmas;

import java.util.Arrays;
import java.util.Scanner;

import ���.chong1;

public class look {
	
	
	
	
	public void look1() {
		student as = new student();
		look aLook = new look();
		student [] c1 = student.students;
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("+1���鿴����ѧ����Ϣ	2������id��ѯѧ����Ϣ	3������id��ѯѧ������	4��������һ��");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("��ѡ��");
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
			
			System.out.println("������Ҫ��ѯ��id��");
			Scanner sca2 = new Scanner(System.in);
			int asx = sca2.nextInt();
			for (int i = 0; i < c1.length; i++) {
				if (asx == c1[i].id) {
					System.out.println(c1[i].toString());
					System.out.println("��ѯ��ϣ�������һ��");
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

		default:System.out.println("����ʧ�ܣ�����������");
			aLook.look1();
			break;
		}
	
	}
}
