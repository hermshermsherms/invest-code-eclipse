import java.util.Scanner;

public class StockAnalytics {

   private final int NUMBER_OF_DATASETS = 5; //should be static?
/**
 * Create array of size NUMBER_OF_DATASETS
 */
   private DataSet[] stockAnalytics = new DataSet[NUMBER_OF_DATASETS];
   
   private String name;
   

//public StockAnalytics() {

//}

public StockAnalytics(Stock stock) {

   
   GraphData twoDimensionalData = new GraphData(stock);
   //columnOneTwo.graphData(stockName);
   PeakFinder peaks = new PeakFinder(twoDimensionalData);
   StandardDeviationTrend stdev = new StandardDeviationTrend(twoDimensionalData);
   
   stockAnalytics[0] = twoDimensionalData;
   stockAnalytics[1] = stdev;
   stockAnalytics[2] = peaks;
   
}

public String toString() {

String toString = "";

   for (int r = 0; r < 3; r++) { 
   
      toString = toString + stockAnalytics[r].toString();
      
      }
   
return toString;
}
}
