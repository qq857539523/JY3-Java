package ½á»é;

public class Demo {
	public static void main(String[] args) 
	{
	Person girl = new Person("ĞãÇÙ","Å®",22,null);
	Person boy = new Person("ÕÔËÄ","ÄĞ",25,null);
	girl.fere = boy;
	boy.fere = girl;
	boolean a = boy.Sh1(girl);
	System.out.println(a);
	
	
	
	}
}
