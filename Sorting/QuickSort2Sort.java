import java.util.*;
class QuickSort2Sort
{
	public static void main(String ags[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = src.nextInt();
		}
		quicksort(a, 0 ,a.length-1);
		
	}
	
		static int patition(int[] a, int start, int end) 
		{
			int pivot = a[start];
			List s = new ArrayList();
			List l = new ArrayList();

			for(int j = start+1; j<=end;j++)
			{
				if(a[j] <= pivot)
				{
					s.add(a[j]);
				}
				else
				{
					l.add(a[j]);
				}
        }
		
        
        for(int j = 0; j<s.size();j++){
            a[start+j] = (Integer)s.toArray()[j];
        }
       
		a[start+s.size()] = pivot;
        for(int j = 0; j < l.size();j++){
            a[s.size()+start+j+1] = (Integer)l.toArray()[j];
        }
		
	
       return start+s.size();
    }
	
    static void quicksort(int[] a, int start, int end){
        if(start<end)
		{
            int q = patition(a,start,end);
            quicksort(a,start,q-1);
            quicksort(a,q+1,end);
           printa(a, start, end);
        }
    }

    static void printa(int[] a, int stat, int end) {
        for(int i = stat; i <=end;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
}