
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
		ArrayList<String> toRemove = new ArrayList<String>();
		for(Map.Entry m : hm.entrySet()) {
			//get all strong connections as a set
			ArrayList<String> temp = new ArrayList<String>();
			temp = (ArrayList<String>) m.getValue();
			if(temp.contains(str)) {
				 strongConnections.addAll(temp);
				 toRemove.add((String) m.getKey());
			}
			
		}
		//remove all entries that have already been captured as strong connections
		for (String remove: toRemove) {
			hm.remove(remove);
		}
		//remove the original item from the set to get a count of exact strong connections 
		strongConnections.remove(str);
		result[0] = strongConnections.size();
		result[1]=  getWeakconnections(strongConnections,hm);
		
		
		
	  return result;	
	}
	public static int getWeakconnections(HashSet<String> strongConnections,HashMap<String,ArrayList<String>> hm) {
		int size=0;
		HashSet<String> weakConnections = new HashSet<String>();
		ArrayList<String> toRemove = new ArrayList<String>();
		//ArrayList<String> toRemove_set = new ArrayList<String>();
		for(String tempr:strongConnections) {
		  for(Map.Entry m : hm.entrySet()) {
			 ArrayList<String> temp = new ArrayList<String>();
			 temp = (ArrayList<String>) m.getValue();
			 if(temp.contains(tempr)) {
				 weakConnections.addAll(temp);
				 toRemove.add((String)m.getKey());
			 }
			
		  }
		   
		}
		for (String remove: toRemove) {
			hm.remove(remove);
		}
		
		for (String remove: strongConnections) {
			weakConnections.remove(remove);
		}
		size  = weakConnections.size();
		//System.out.println(size);
		if(size>0) {
			getWeakconnections(weakConnections,hm);
		}
		else {
		return size;
		}
		// TODO Auto-generated method stub
		return size;
		
	}
	public static void main(String args[])
	{
		String str="ABC";
		String[] str1={"first:ABC","first:PQR","second:PQR","second:DEF","second:GHI","third:PQR","third:MNO","fourth:MLK","fourth:ABC","fifth:DEF","fifth:XYZ","six:MLK","six:ASDF"};
		int[] a=amz(str,str1);
		System.out.println(a[0]+" "+a[1]);
	}
}

