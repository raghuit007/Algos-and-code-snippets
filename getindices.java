/*   Given a sorted array with duplicates, and a number find the
 *   start and end indexes of the number in the array
 * 
 * 
 * 
 * 
 */
public class SortedArrayIndex {

	public static void main(String[] args) {
		int [] a = {1,1,1,2,2,3,3,3,4,4,4,9};
		int n =9;
		getIndexes(a,0,a.length-1,n);
		

	}

	private static void getIndexes(int[] a,int start,int end ,int n) {
		 //search for mid point 
		//if mid point element > search element 
		   // search in the left array
		// else if mid point element < search element  
		  //search in the right array
		//else 
		  // take 2 pointers and go left and right by incrementing and
		  // decrementing pointers till the number is not hit
		
		int mid = (start+end)/2;
		int i=0,j=0;
		if (start > end)
		{
			System.out.println("not found");
			
		}
		else if (a[mid] < n)
		{
			getIndexes(a,mid+1,a.length-1,n);
		}
		else if (a[mid] > n)
		{
			getIndexes(a,0,mid-1,n);
		}
		else 
		{
			 i =j= mid;
			while (i>=1 && a[i-1]==n )
			{
				i--;
			}
			while (j<=a.length-2 && a[j+1]==n)
			{
				j++;
			}
			
		}
		
		System.out.println("indices are "+i+"  "+j);
		
	}
}
