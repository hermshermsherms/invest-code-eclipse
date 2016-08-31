import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class StorageMap{
	protected static Hashtable<String, Stock> table; //issue with concurrent access
	
public Hashtable<String,Stock> createMap(){ //constructor of empty table
	table = new Hashtable<String, Stock>();
	return table;
}

public static void addToMap(String name, Stock stock ){
	 //if (table.containsKey(name))
	     // throw new IllegalArgumentException(
	        //  "Cannot create new vertex with existing name.");
	table.put(name, stock);
	
}

public Stock getFromMap(String name){
	Stock rval = table.get(name);
	return rval;
}
		

}


	
	

