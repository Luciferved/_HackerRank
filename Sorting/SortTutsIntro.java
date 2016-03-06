import java.util.*;
class SortTutsIntro
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int s = src.nextInt();
		int n = src.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = src.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
				System.out.println(i);
		}
	}
}