package 结婚;

public class Demo {
	public static void main(String[] args) 
	{
	Person girl = new Person("秀琴","女",22,null);
	Person boy = new Person("赵四","男",25,null);
	girl.fere = boy;
	boy.fere = girl;
	boolean a = boy.Sh1(girl);
	System.out.println(a);
	System.out.println("女方伴侣为"+girl.fere.pName);
	System.out.println("男方伴侣为"+boy.fere.pName);
	
	}
}
