package stydentmas;
/*
 * ������
 */
import java.util.Scanner;

import javax.imageio.spi.RegisterableService;

public class register {
	public register() 
	{	
	}
	
	int id;//id
	String name;//����
	String gengder;//�Ա�
	int year;//����
	String grade;//�����꼶��ֻ�ܳ������м����߼�
	String site;//��ַ
	String phone;//ʮһλ�ֻ���
	String mail;//����	
	
	String ursename = "admin";
	String password = "admin";
	String un;
	String pw;
	
		//����
//		public static void main(String[] args) {
//			register aRegister =new register();
//			aRegister.entrance();
//		}
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
			case 2:
				System.out.println("���˳���");
				System.exit(0);
				break;
			default:System.out.println("�����������������");
//				register aRegister =new register();
				entrance();
				break;
			}
			System.out.print("�������û�����");
			un = sca.next();
			System.out.print("���������룺");
			pw = sca.next();
			if (un.equals(ursename)&&pw.equals(password)) {
				System.out.println("��¼�ɹ���"+"\n"+"��ӭ�� admin��");
				message ahMessage=new message();
				ahMessage.zmessage();
			}else {
				System.out.println("������󣬳����˳���");
			}
		
	    }
		
}
