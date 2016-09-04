import java.util.Scanner;
import java.io.IOException;

public class StockListDriver {

public static int numStocks = 0;
public static Stock[] stockList = new Stock[1];
  
   public static void main(String[]args) throws IOException {
   
   Scanner kb = new Scanner(System.in);
   
      
		Stock stock;
      
      String stockName;

      int choice = -1;
   
      while (choice != 0) {    
			choice = menu();
			switch (choice) {
				case 0: 
			break;
            
			case 1: //Add a new stock
				stock = new Stock();
            if (add(stock))
            System.out.println(stock.name + " stock successfully added.");
			   else
			   System.err.println("The stock already exists");  
			break;
            
			case 2: //Analyze a stock
            System.out.println("Which stock would you like to analyze?  ");
            stockName = kb.next();
            if (findStock(stockName) == -1) {
            System.out.println(stockName + " could not be found");
            stock = new Stock();
            add(stock); 
            StockAnalytics analytics = new StockAnalytics(stock); 
            System.out.println(analytics); }
            else {
				StockAnalytics analytics = new StockAnalytics(stockList[findStock(stockName)]); 
            System.out.println(analytics); }
			break;
                        
			case 3: //Remove a stock from the list
            System.out.println("Which stock would you like to remove?  ");
            stockName = kb.next();
            if (remove(stockName))
            System.out.println(stockName + " stock successfully removed.");
				else
				System.err.println("The stock does not exist");
			break;

			case 4: //Print all the stocks in the list
				for (int i = 0; i < numStocks; i++) {
               System.out.println(stockList[i].name + "\n" + stockList[i]); }
		   break;
            
			case 5: //Print a stock
            
            System.out.println("Which stock would you like to print?  ");
            stockName = kb.next();
            if (findStock(stockName) == -1) {
            System.out.println(stockName + " could not be found");
            stock = new Stock();
            add(stock); 
            System.out.println(stock.name + "\n" + stock); }
            else {
				System.out.println(stockList[findStock(stockName)].name + "\n" + stockList[findStock(stockName)]); }
	      break;
            
         case 6: //Save stocks to a file
            System.out.print("Enter a name for the file you'd like to create:  ");
            String outputFile = kb.next();
            FileGenerator newFile = new FileGenerator(outputFile, print());
   		break;
            
			default: 
				System.err.println("invalid choice!");
           
			}
		} 
	}

public static int menu() throws IOException {

   Scanner kb = new Scanner(System.in);

   System.out.println("0) Quit");
   System.out.println("1) Add new stock");
   System.out.println("2) Analyze a stock");
   System.out.println("3) Remove a stock from the list");
   System.out.println("4) Print all the stocks in the list");
   System.out.println("5) Print a stock");
   System.out.println("6) Save stocks to a file");
   System.out.print("Choice: ");

		int choice = kb.nextInt();
		return choice;
}

public static boolean add(Stock s) {
             
   if (findStock(s.name) != -1) {
      return false; }
      
   if (numStocks == stockList.length) {
      Stock[] biggerArray = new Stock[stockList.length+1]; 
            
         for (int i = 0; i < stockList.length; i++) {
               biggerArray[i] = stockList[i]; }
               
      stockList = biggerArray; }
               
   stockList[numStocks] = s;
   numStocks++; 
   
   return true; }

public static boolean remove(String name) {
             
   if (findStock(name) == -1) {
      return false; }
      
   if (findStock(name) < numStocks - 1) {
      for (int i = findStock(name); i < numStocks - 1; i++) {
         stockList[i] = stockList[i+1]; } }
   
   stockList[numStocks-1] = null;
         
   numStocks--;
   
   return true; }
   
private static int findStock(String name) {
 
   int count = 0;
   
   while (count < numStocks) {
   
      if (stockList[count].name.equalsIgnoreCase(name)) {
            
         return count; }
            
      count++; }
      
   return -1; }
   
public static String print() {
      
   String toString = "";

   for (int i = 0; i < numStocks; i++) {
   
      toString = toString + stockList[i].name + "\n" + stockList[i] + "\n"; 
   }
   
   return toString;
} 

}

