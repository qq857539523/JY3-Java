package ���;

//��  ��
public class chong1 {
	public chong1() {
		
	}
	public chong1(String cName,String cGender,int cYear) {
		this.cName = cName;
		this.cGender = cGender;
		this.cYear = cYear;
	}
	
	//�������ԣ��������Ա����䣬��񣬰���
	String cName;
	String cGender;
	int cYear;
	boolean cMarry;
	String cfere;
	
	public boolean Fb(chong1 a1) {
		chong2 ch2 = new chong2();
		return ch2.Hb(this, a1);
	}
	
	
	
	
}
