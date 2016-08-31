import java.util.Scanner;

public class StockAnalytics {

   private final int NUMBER_OF_DATASETS = 5; //should be static?
/**
 * Create array of size NUMBER_OF_DATASETS
 */
   private DataSet[] stock = new DataSet[NUMBER_OF_DATASETS];
   
   private String name;
   
/**
 * Constructs a Stock
 */
public StockAnalytics() {
   
   GraphData columnOneTwo = new GraphData();
   //PeakFinder columnThree = new PeakFinder();
   StandardDeviationTrend columnFour = new StandardDeviationTrend();
   
   stock[0] = columnOneTwo;
   stock[1] = columnFour;
   
   //stock[2] = columnThree;
   
}

public String toString() {

String toString = "";

   for (int r = 0; r < 2; r++) { 
   
      toString = toString + stock[r].toString();
      
      }
   
return toString;
}
}
