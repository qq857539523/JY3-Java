package ��20190409;
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
	//Բ��
	Point p;
	//�뾶
	int r;
	
	//�Ƿ����ָ���ĵ�  PS���������С�ڵ��ڰ뾶 ����true ���ǰ���ָ����
	public boolean Fb(Point p1) {
		boolean b = Math.pow((p.x-p1.x), 2)+Math.pow((p.y-p1.y), 2) <= r*r;
		return b;
	}
	
	
	//���
	public double area(int r) {
		double a = Math.PI*r*r;
		return a;
	}
}
