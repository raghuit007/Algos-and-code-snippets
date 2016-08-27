// given an unsorted array, get the k largest or smallest elements

// this algorithm uses max heap operation.  

public class HeapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {12,4,2,5,23,14,7,9,31,90};
		 buildMaxHeap(a);
		 for (int k=0;k<3;k++) {
		   int len = a.length;
		   int max = extract_max(a,len);
		   System.out.println("max element is"+max);
		 }
	   /*  for (int j=0;j<a.length;j++) {
	    	 System.out.println(a[j]+"\t");
	     } */
	     
	     
	}
	private static int extract_max(int [] a,int l )
	{
		
		int max=0;
		max = a[0];
		a[0] = a[l-1];
		l = l-1;
		max_heapify(a,0,l);
		
		return max;
		
	}
	private static void buildMaxHeap(int[] a) {
		int n = a.length-1;
		for (int i=n/2;i>=0;i--) 
		{
			max_heapify(a,i,n);
		}
		
	}

	private static void max_heapify(int[] a, int i,int l) {
		 int c1 = 2*i+1;
		 int c2 = 2*i+2;
		 int largest=0;
		 
		 if (c1<=l && a[c1] > a[i])
		 {
			 largest = c1;
		 }
		 else {
			 largest = i;
		 }
		 if (c2 <=l && a[c2] > a[largest]) {
			 largest = c2;
		 }
		 if (largest!=i) 
		 {
			 int temp = a[i];
			 a[i] = a[largest];
			 a[largest] = temp;
			 max_heapify(a,largest,l);
		 }
		 
	}
	
	

}

