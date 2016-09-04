//Standard Deviation Trend

public class StandardDeviationTrend extends DataSet {

   private double STDEV;
   private double sum;
   private double avg;
   private String toString;

   public StandardDeviationTrend(GraphData twoDimensionalData) {
   
   numRows = twoDimensionalData.numRows;
   //System.out.println("numRows: " + numRows);
   //System.out.println("GraphData.numRows: " + twoDimensionalData.numRows);

   type = "STDEV";
   
      array = new double[numRows-1][2];
      
         for (int r = 0; r < numRows-1; r++) {
            array[r][0] = twoDimensionalData.array[r+1][1] - twoDimensionalData.array[r][1];
         }
         
      double[][] stdevArray = new double[numRows-1][2]; 
         for (int r = 0; r < numRows-1; r++) {
            stdevArray[r][0] = twoDimensionalData.array[r+1][1];
         }
         
      //System.out.println("Standard Deviation: " + STDEV(twoDimensionalData.array));
      toString = "Standard Deviation: " + FindSTDEV(stdevArray) + "\n" 
      + "Standard Deviation from average slope: " + FindSTDEV(array) + "\n";
         
}

public double FindSTDEV(double[][] array) {
         
      sum = 0;
         
         for (int r = 0; r < array.length; r++) {
            sum = array[r][0] + sum; 
         }
         
      avg = sum/array.length;
         
         for (int r = 0; r < array.length; r++) {
            array[r][1] = (array[r][0] - avg)*(array[r][0] - avg);
         }
         
      sum = 0;
      avg = 0;
         
         for (int r = 0; r < array.length; r++) {
            sum = array[r][1] + sum;
         }
         
      avg = sum/array.length;
      STDEV = Math.sqrt(avg);
      
   return STDEV;  
}

public String toString() {

return "\n" + type + "\n" + toString;  
}

}
