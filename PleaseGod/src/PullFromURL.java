import java.net.*;
import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;

public class PullFromURL {

protected URL oracle;
protected BufferedReader in;
protected String[] stockArray;
protected int numLines;

   public PullFromURL() {
      Scanner keyboard = new Scanner(System.in);
      create(keyboard);
      
      }
   
   public void create(Scanner keyboard) {
   
      oracle = null;
      in = null;
         
      while (oracle == null && in == null) {
      
         System.out.println("What stock do you want to add to the database?");
         String input = keyboard.nextLine();
         
         String baseUrl = "http://chart.finance.yahoo.com/table.csv?s=";
   		String endUrl = "&a=6&b=26&c=2016&d=7&e=26&f=2016&g=d&ignore=.csv";
         String urlFull = baseUrl+input+endUrl;
         
      try {
         
         oracle  = new URL(urlFull);
		   in = new BufferedReader(
				new InputStreamReader(oracle.openStream()));
            
         stockArray = new String[60];
   		String inputLine = "";
   		int i = 0;
   		int lineCounter = 0;
   		in.readLine(); //skip first line
         
		while ((inputLine = in.readLine()) != null){
      
			stockArray[i] = inputLine; //fill array
			i++;
			numLines++;
		}
      
		in.close();
      
		for(int j=0;j<numLines;j++){ //print array
			System.out.println(stockArray[j]);
      }
      
      }//close try block
         
      catch (MalformedURLException e) {
         System.err.println(e.getMessage());
         System.err.println("File not found.");
         in = null;
         oracle = null;
      }
      
      catch (IOException e) {
         System.err.println(e.getMessage());
         System.err.println("File not found.");
         in = null;
         oracle = null;
      }
   }//close while loop  
}
      
   public String toString() {
   
         String toString = "";
   
      for(int j=0;j<numLines;j++){
            
         toString = toString + stockArray[j] + "\n";
      }
         
         return toString;
   }
}