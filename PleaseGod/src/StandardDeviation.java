//Standard Deviation

public class StandardDeviation extends GraphData {

   private double STDEV;
   private double sum;
   private double avg;

   public StandardDeviation(String fileName) {
   
   type = "STDEV";
   GraphData graphPoints = new GraphData(fileName);
   numRows = graphPoints.numRows;
   
      array = new double[numRows-1][2];
      
         for (int r = 0; r < array.length; r++) {
            array[r][0] = graphPoints.array[r+1][1] - graphPoints.array[r][1];
            //array[r][0] = graphData[r++][1] - graphData[r][1];
         }
      
      System.out.println("Standard Deviation: " + FindSTDEV(graphPoints.array));
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
