import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashTable {
	public static void main(String args[]){
		 //how to get key from value in hashtable in Java
		Map<String, String> table = new Hashtable();
        table.put("Sony", "Bravia");
        table.put("Samsung", "Galaxy");
        table.put("Nokia", "Lumia");
      
        System.out.println("does hash table has Lumia as value : " + table.containsValue("Lumia"));
        System.out.println("does hash table Lumia as key : " + table.containsKey("Lumia"));
      
        //finding key corresponding to value in hashtable - one to one mapping
        String key= null;
        String value="Lumia";
        

        		Iterator<Entry<String, String>> it = table.entrySet().iterator();

        		while (it.hasNext()) {
        		  Map.Entry<String, String> entry = it.next();
        		  if(value.equals(entry.getValue())){
        			  key=entry.getKey();
        			  break;
        		  }
        		  
        		}
        		
        System.out.println("got key from value in hashtable key:  "+ key +" value: " + value);
      
	}
}
