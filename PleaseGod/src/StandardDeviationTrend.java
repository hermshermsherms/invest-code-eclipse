//Standard Deviation Trend

public class StandardDeviationTrend extends GraphData {

   private double STDEV;
   private double sum;
   private double avg;

   //public StandardDeviation(String fileName) {
   public StandardDeviationTrend() {
   
   System.out.println("numRows: " + numRows);

   type = "STDEV";
   //numRows = graphPoints.numRows;
   
      array = new double[numRows-1][2];
      
         for (int r = 0; r < array.length; r++) {
            array[r][0] = array[r+1][1] - array[r][1];
            //array[r][0] = graphData[r++][1] - graphData[r][1];
         }
      
      System.out.println("Standard Deviation: " + FindSTDEV(array));
      System.out.println("Standard Deviation from average slope: " + FindSTDEV(array));
         
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

}
