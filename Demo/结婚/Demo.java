package ���;

public class Demo {
	public static void main(String[] args) 
	{
	Person girl = new Person("����","Ů",22,null);
	Person boy = new Person("����","��",25,null);
	girl.fere = boy;
	boy.fere = girl;
	boolean a = boy.Sh1(girl);
	System.out.println(a);
	
	
	
	}
}
