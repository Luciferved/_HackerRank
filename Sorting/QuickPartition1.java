import java.util.*;
class QuickPartition1
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
		partition(a);
	}
	
	static void partition(int a[])
	{
		List s = new ArrayList();
		List l = new ArrayList();
		int pivot = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i] <= pivot)
				s.add(a[i]);
			else
				l.add(a[i]);
		}
		s.add(s.size(),pivot);
		//The java.util.ArrayList.add(int index, E elemen) method inserts the specified element E at the specified position in this list.
		//It shifts the element currently at that position (if any) and any subsequent elements to the right (will add one to their indices).
		//Declaration Following is the declaration for java.util.ArrayList.add() method
		//public void add(int index, E element)
		
		s.addAll(l);
		for(int i=0;i<s.size();i++)
		{
			a[i] = (Integer)s.toArray()[i];
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