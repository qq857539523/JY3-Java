package »’20190408;

import java.util.Arrays;

public class px {
	public static void main(String[] args) {
		int[] z = {5,78,3,45,6,54};
		sz(z);
	}
	public static void sz(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-j-i; j++) {
				if (a[j] > a[j+1]) {
//					int temp = 0;
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1]= temp;
					a[j] = a[j] + a[j+1];
					a[j+1] = a[j] - a[j+1];
					a[j] = a[j] - a[j+1];
					
					
				}
			}
		}
		
		
		
		System.out.print(Arrays.toString(a));
	}
}
