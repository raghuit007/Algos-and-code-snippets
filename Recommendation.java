

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Recommendation {
	
	public static int[] amz(String str, String[] str1)
	{
		int[] result = new int[2];
		
		// adding all the elements in the desired format into the hashmap
		HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();
		Set<String> a2= new HashSet<String>();
		Set<String> s2=new HashSet<String>();
		for(int i=0;i<str1.length;i++)
		{
			String[] s1=str1[i].split(":");
			if(!hm.containsKey(s1[0]))
			{
				ArrayList<String> temp=new ArrayList<String>();
				temp.add(s1[1]);
				hm.put(s1[0], temp);
			}
			else
			{
				ArrayList<String> b=hm.get(s1[0]);
				b.add(s1[1]);
			}
		}
		
		// get only the strong connections from the hashmap and delete the entries 
		
		HashSet<String> strongConnections = new HashSet<String>();
		for(Map.Entry m : hm.entrySet()) {
			//get all strong connections as a set
			ArrayList<String> temp = new ArrayList<String>;
			temp = m.getValue();
		}
		
	  return result;	
	}
	public static void main(String args[])
	{
		String str="ABC";
		String[] str1={"first:ABC","first:PQR","second:PQR","second:DFE","second:GHI","third:PQR","third:MNO","fourth:MLK"};
		int[] a=amz(str,str1);
		System.out.println(a[0]+" "+a[1]);
	}
}
