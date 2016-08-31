import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class StorageMap{
	
	 static Hashtable<String, Stock> table = new Hashtable<String, Stock>();
	
public Hashtable<String,Stock> createMap(){ //constructor of empty table
	Hashtable table = new Hashtable<String, Stock>();
	return table;
}

public static void addToMap(String name, Stock stock ){
	if(table.containsKey(name) || table.containsKey(stock)){
		System.out.println("The system already contains" + name);
		return;
	}
	table.put(name, stock);
}

//testing
//this is the worst
public Stock getFromMap(String name){
	if(table.containsKey(name)){
	Stock rval = table.get(name);
	return rval;
	}
	else{
		//call pull from URL and return newStock 
		addToMap(String name, Stock newStock);
		getFromMap(name);
	}
}
		

}


	
	

