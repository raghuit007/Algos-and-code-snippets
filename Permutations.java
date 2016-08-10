/* Program to print all permutations of a given string- Using recurrsion */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PermutateString {
	

	public static List<List<Integer>> getPermutations(int pre ,int [] s ) {
		 List<List<Integer>> result  = new LinkedList<List<Integer>>();
	     List<Integer> resultSet = new LinkedList<Integer>();
		
		int len = s.length;
		if(pre==len) {  
			
			for(int j=0;j<s.length;j++) {
				resultSet.add(s[j]);
			}
			result.add(resultSet);
			//System.out.println(result.get(0));
			
		
		} 
		for (int i = pre; i < len; i++) {
	        int[] permutation = s.clone();
	         permutation[pre] = s[i];
	        permutation[i] = s[pre]; 
	        getPermutations( pre + 1,permutation); 
		}
		return result ;
	    	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3};
		//int prefix = a[0];
		List<List<Integer>> result  = new LinkedList<List<Integer>>();
		//Integer [] numTemp = (Integer[])a.clone(); 
		result= getPermutations(0, a);
		
		System.out.println(result.size());
		
		
		

	}

}

