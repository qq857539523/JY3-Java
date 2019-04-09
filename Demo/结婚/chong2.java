package 结婚;
//民政局
public class chong2 {
	public boolean Hb(chong1 p1,chong1 p2) 
	{
		if (p1.cGender != p2.cGender ) {
			if (p1.cYear >= 23 && p2.cYear >= 20 && p1.cGender == "男"|| p1.cYear >=20 && p2.cYear >= 23 && p2.cGender == "男") {
				if (p1.cMarry == false && p2.cMarry == false) {
					System.out.println("恭喜你们 喜结良缘");
					p1.cMarry = true;
					p2.cMarry = true;
					p1.cfere = p2.cName;
					p2.cfere = p1.cName;
					return true;
				}
			}
		}
		return false;
	}
}
