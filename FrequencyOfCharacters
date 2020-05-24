import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.*;

public class Solution {
	 public static HashMap<Character, Integer> sortByValue(HashMap<Character, Integer> hm) 
	    { 
	        // Create a list from elements of HashMap 
	        List<Entry<Character, Integer>> list = 
	               new LinkedList<Map.Entry<Character, Integer> >(hm.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Character, Integer> >() { 
	            public int compare(Map.Entry<Character, Integer> o1,  
	                               Map.Entry<Character, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<Character, Integer> temp = new LinkedHashMap<Character, Integer>(); 
	        for (Map.Entry<Character, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	    } 
	public static void main(String args[])
	{
	
	String s = "tttree";	       
	HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
	
	for(int i =0;i<s.length();i++)
	{ 
		Character c = s.charAt(i);
		Integer val = hm1.get(c);
		if(val!=null)
		{
			hm1.put(c, val+1);
		}
		else
		{
			hm1.put(c, 1);
		}

	}
	System.out.println(hm1);
	
	System.out.println("Sorted hashmap"+ sortByValue(hm1));
	
}
}


