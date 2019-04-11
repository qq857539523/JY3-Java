package »’20190411;

import java.util.Arrays;

public class list {
	public static void main(String[] args) 
	{
//		int a =  45;
//		int b = 456;
//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;
//		   System.out.println(a);
//		   System.out.println(b);
		
		int[] a = {1,45,2,5,235,324,26,23};
		int[] b = {21,213,213,421,42,532};
		int[] c = {};
		c = Arrays.copyOf(a, a.length+b.length);
		System.out.println(Arrays.toString(c));
		System.arraycopy(b,0,c,a.length,b.length);
		System.out.print(Arrays.toString(c));
		
		
		
	}
   
    
}
//  45/2 = 22	1	22/2 = 11	0	11/2 = 5	1	5/2=2	1	2/2=1	0	1
//	101101
//  456/2=228	0	228/2=114	0	114/2=57	0	57/2=28	1	28/2=14	0	14/2=7	0	7/2=3	1
//111001000
//000101101
//111001000
//111100101