/* Sort hashmap by values using Comparator interface in Java */
/* Code insipred from mkyong.com */

import java.util.*;
import java.util.Map.Entry;

public class SortHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		hm.put(31, 3);
		hm.put(21, 7);
		hm.put(45, 6);
		hm.put(22, 6);
		
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1,
                                           Map.Entry<Integer, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		// Convert sorted map back to a Map
		Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
		for (Iterator<Map.Entry<Integer, Integer>> it = list.iterator(); it.hasNext();) {
			Map.Entry<Integer, Integer> entry = it.next();
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			System.out.println("[Key] : " + entry.getKey() 
                                      + " [Value] : " + entry.getValue());
		}

     
	}
}
