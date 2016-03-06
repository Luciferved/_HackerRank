import java.util.*;
class QuickSort2
{
	static int count = 0;
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = src.nextInt();
		}
		quick(a,0,n-1);
		printa(a);
	}
	
	private static int partition(int a[],int start,int end)
	{
		
		int pivot = a[end];
		int index = start;
		for(int i=start;i<end;i++)
		{
			
			if(a[i] <= pivot)
			{
				int t = a[i];
				a[i] = a[index];
				a[index] = t;
				index++;
				//count++;
			}
			
		}
		int temp = a[index];
		a[index] = a[end];
		a[end] = temp;
		return index;
	}
	
	private static void quick(int a[],int start,int end)
	{
		if(start<end)
		{
			int index = partition(a,start,end);
			quick(a,start,index-1);
			quick(a,index+1,end);
		}
		
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