package 结婚;

public class Person {
	//定义属性：姓名，性别，年龄，婚否，伴侣
	
	public Person() {
		
	}
	public Person(String pName,String pGender,int pYear,Person fere) {
		this.pName = pName;
		this.pGender = pGender;
		this.pYear = pYear;
		this.fere = fere;
	}
	
	
	String pName;//姓名
	String pGender;//性别
	int pYear;//年龄
	boolean pMarry;//婚否
	Person fere;//伴侣
	
	
	//结婚
	public boolean Sh1(Person ph) 
	{
		MarryHouse Mh = new MarryHouse();
		boolean a = Mh.qwe(this, ph);//逻辑重点
		return a;
	}
	
}
