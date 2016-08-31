public class Stock {

   private final int NUMBER_OF_DATASETS = 5; //should be static?
/**
 * Create array of size NUMBER_OF_DATASETS
 */
   private DataSet[] stock = new DataSet[NUMBER_OF_DATASETS];
   
   private String name;
   
/**
 * Constructs a Stock
 */
public Stock(String fileName) {

   name = fileName;
   
   GraphData columnOneTwo = new GraphData(fileName);
   PeakFinder columnThree = new PeakFinder(fileName);
   StandardDeviation columnFour = new StandardDeviation(fileName);
   
   stock[0] = columnOneTwo;
   stock[1] = columnThree;
   stock[2] = columnFour;
   
}

public String toString() {

String toString = "";

   for (int r = 0; r < 2; r++) { 
   
      toString = toString + stock[r].toString();
      
      }
   
return toString;
}
}
