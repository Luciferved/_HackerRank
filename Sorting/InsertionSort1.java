import java.util.*;
class InsertionSort1
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
		insertion(a);
	}
	
	private static void insertion(int a[])
	{
		int cur = a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			if(cur < a[i-1])
			{
				a[i] = a[i-1];
				printa(a);
			}
			else
			{
				a[i] = cur;
				printa(a);
				return;
			}
		}
		a[0] = cur;
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
			
