package ���;

public class Person {
	//�������ԣ��������Ա����䣬��񣬰���
	
	public Person() {
		
	}
	public Person(String pName,String pGender,int pYear,Person fere) {
		this.pName = pName;
		this.pGender = pGender;
		this.pYear = pYear;
		this.fere = fere;
	}
	
	
	String pName;//����
	String pGender;//�Ա�
	int pYear;//����
	boolean pMarry;//���
	Person fere;//����
	
	
	//���
	public boolean Sh1(Person ph) 
	{
		MarryHouse Mh = new MarryHouse();
		boolean a = Mh.qwe(this, ph);//�߼��ص�
		return a;
	}
	
}
