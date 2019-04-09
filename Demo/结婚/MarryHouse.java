package 结婚;
//民政局
public class MarryHouse {
	public boolean qwe(Person p1,Person p2) {
		if (p1.pGender != p2.pGender) {
			if (p1.pYear >= 23 && p2.pYear >= 20 && p1.pGender == "男"|| p1.pYear >= 20 && p2.pYear >= 23 && p2.pGender == "女") {
				if (p1.pMarry == false && p2.pMarry == false) {
					p1.pMarry = true;
					p2.pMarry = true;
					p1.fere.pName = p2.pName;
					p2.fere.pName = p1.pName;
					return true;
				}
			}
		
		}return false;
	}
}
