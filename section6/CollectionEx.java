package session7;

import java.util.*;

public class CollectionEx {
 //Adding and accessing Elements in a collection
	
	public static void main(String[] args) {
		//List Example
		List<String>list=new ArrayList<>();
		 list.add("Java");
		 list.add("Python");
		 list.add("Node");
		 System.out.println("ORiginal List:"+list);
		 //add data in specific index
		 list.add(1,"react");
		 System.out.println(" List:"+list);
		 //Set Example 
		 Set<String> set=new HashSet<>();
		 set.add("Yamaha");
		 set.add("RE");
		 set.add("Jawa");
		 
		 System.out.println("Set:"+set);
		 
		 //Map Example
		 
		 Map<Integer,String>map=new HashMap<>();
		 map.put(1, "prathija");
		 map.put(1, "prathija");
		 map.put(1, "prathija");
		 System.out.println("Map:"+map);
		 
	}
}
