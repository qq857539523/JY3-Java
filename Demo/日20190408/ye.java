package ��20190408;

import java.util.Scanner;

public class ye {}
/*
 * ����һ����ͨ���� ���ԣ��ٶ� ��� �������ƶ� �����ٶ�
 */
class Che {
	double su;
	double ti;
	
	public void bian() {
		System.out.println("�����ٶ�Ϊ"+su);
		System.out.println("�������Ϊ"+ti);
		
		System.out.println("���������1-3ָ��(�������Ը�)��");
		Scanner i = new Scanner(System.in);
		for (int j = 0; j < 10; j++) {
		int a = i.nextInt();
		switch (a) {
		case 1:
			System.out.println("���ٲ���   Ŀǰ�ٶ�1��");
			break;
		case 2:
			System.out.println("������ʼ�ƶ�   Ŀǰ�ٶ�2��");
			break;
		case 3:
			System.out.println("������ʼ�ƶ�   Ŀǰ�ٶ�3��");
			break;
		
		default:
			j= 10;
			System.out.print("����ָ����󣬽����Ա�ģʽ��");
			break;
		}
		
		}
		i.close();
	}

}
