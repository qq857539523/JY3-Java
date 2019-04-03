import java.util.*;
public class Pai
{
	public static void main(String[] args)
	{int t;
		for(int i=1;i<=9;i++)
			{
			for(int j=0;j<9;j++)
				{
				t=i*1000+i*100+j*10+j;
				System.out.print(t+"");
				for(int j2=0;j2<100;j2++)
				{
				if(j2 == Math.sqrt(t)){
				System.out.println("ºÅÂëÎª£º"+j2*j2);
				}
				
				}
			}
		
		}
	
	}
}