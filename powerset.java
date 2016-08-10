/* program to display powersets of a given set */


public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3};
		
		int setSize = a.length;
		double powerSize = Math.pow(2, setSize);
		for(int i=0;i<powerSize;i++) {
			
			System.out.print("{ ");
			int temp1 =i;
			for(int j=0;j<setSize;j++) {
				//convert to binary 
				   int binary_digit = temp1%2;
				// if binary digit > 0 print the element at a[j]. 
				
				   if(binary_digit>0) {
				   System.out.print(a[j]+" ");
				   }
				   temp1=temp1/2;
				
				}
			System.out.println("}");
			}
			
		}
		

	}



