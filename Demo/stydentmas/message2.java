package stydentmas;

import java.util.Scanner;

public class message2 {
	public void message0() {
	message a1 =  new message();
	student [] c1 = student.students;
	System.out.println("------------------------------------------------------------------");
	System.out.println("-1������id�޸�ѧ��ȫ����Ϣ	2������id�޸�ѧ��������Ϣ	3�������ϼ�	4��ϵͳ�˳�-");
	System.out.println("------------------------------------------------------------------");
	System.out.println("��ѡ��");
	Scanner a4 = new Scanner(System.in);
	int a = a4.nextInt();
	switch (a) {
	case 1:
		
		break;
	case 2:
		System.out.println("������Ҫ�޸ĵ�id");
		for (int i = 0; i < c1.length; i++) {
			int hb = a4.nextInt();
			if (hb == c1[i].id) {
				System.out.println("��������ĺ�id");
				int hb1 = a4.nextInt();	
				c1[i].id = hb1;
				i = hb1;
				System.out.println("�޸ĳɹ���������һ��");
				message0();
			}else {
				System.out.println("������󣬷�����һ��");
				message0();
			}					
		}
		
		a1.zmessage();
		break;
	case 3:
		System.out.println("�������ء�");
		
		a1.zmessage();
	break;
	case 4:
		System.out.println("�����˳�");
	break;

	default:System.out.println("�����������������");
		message0();
		break;
	
		}
	}
}
