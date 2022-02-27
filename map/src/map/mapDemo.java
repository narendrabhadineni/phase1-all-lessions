package map;

import java.util.*;
public class mapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> h0=new HashMap<Integer,String>();      
	      h0.put(1,"Ram");    
	      h0.put(2,"Syam");    
	      h0.put(3,"Sita");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:h0.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> h1=new Hashtable<Integer,String>();  
	      
	      h1.put(4,"Sai");  
	      h1.put(5,"Satya");  
	      h1.put(6,"Hari");  
	      h1.put(7,"Laxmi");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:h1.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      
	      
	      TreeMap<Integer,String> s=new TreeMap<Integer,String>();    
	      s.put(8,"venu");    
	      s.put(9,"joythi");    
	      s.put(10,"Divya");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:s.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}


