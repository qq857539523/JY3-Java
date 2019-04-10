package 日20190409;
import java.awt.Point;
public class yuan {
	public yuan() {
		
	}
	public yuan(Point p1,int r) {
		
		this.r = r;
	}
	
//	public yuan(Point p1,int r) {
//		this.p1 = p1;
//		this.r = r;
//	}
	//圆心
	Point p;
	//半径
	int r;
	
	//是否包含指定的点  PS：如果距离小于等于半径 就是true 就是包含指定点
	public boolean Fb(Point p1) {
		boolean b = Math.pow((p.x-p1.x), 2)+Math.pow((p.y-p1.y), 2) <= r*r;
		return b;
	}
	
	
	//面积
	public double area(int r) {
		double a = Math.PI*r*r;
		return a;
	}
}
