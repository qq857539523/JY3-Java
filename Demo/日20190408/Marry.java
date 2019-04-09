package 日20190408;

public class Marry {
	/*
	 * 结婚系统
	 * 属性:编号	名字	性别	年龄	婚否	身份证号	地址	电话	伴侣
	 * 方法:结婚（另一个人）	合理结婚规则
	 * 		如果成功则更新双方属性：婚否和伴侣
	 * 		失败则返回false
	 */
	String name;//姓名
	boolean gender;//性别
	int year;//年龄
	boolean marry;//婚否
	String site;//住址
//	String fere = "小翠";
//	String name2 = "小翠";
//	boolean gender2 = false;
//	int year2 = 20;
//	boolean marry2 = false;
//	String site2 = "无";
	public void rule() 
	{
		System.out.println("请输入姓名：");
		System.out.println("请输入性别：");
		System.out.println("请输入年龄");
		System.out.println("请输入住址");
	}
}

