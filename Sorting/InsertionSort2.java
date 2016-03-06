import java.util.*;
class InsertionSort2
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = src.nextInt();
		}
		insertion2(a);
	}
	
	private static void insertion2(int a[])
	{
		int count = 0;
		for(int i=1;i<a.length;i++)
		{
			int cur = a[i];
			int j = i;
			for(j=i;j>0 && a[j-1]>cur;j--)
			{
				a[j] = a[j-1];
				//count++;
			}
			//System.out.println("j : "+j);
			a[j] = cur;
			
			
		}
		printa(a);
		
	}
	
	private static void printa(int a[])
	{
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}
}