public class PeakFinder extends GraphData { //why doesn't inheritance keep all the values from GraphData???

protected double maxAbsolute;
protected double minAbsolute;
   
   public PeakFinder(String fileName) {
   
   type = "Peaks";
         
      GraphData graphPoints = new GraphData(fileName);
      numRows = graphPoints.numRows;
      
      //Make an array of this size:
      array = new double[numRows][2];
   
      minAbsolute = graphPoints.minVal;
      maxAbsolute = graphPoints.maxVal;
      
      if (graphPoints.array[0][1] >= graphPoints.array[1][1]) {
      
         array[0][1] = graphPoints.array[0][1];
         array[0][0] = graphPoints.array[0][0]; }
         
      if (graphPoints.array[numRows-1][1] >= graphPoints.array[numRows-2][1]) {
      
         array[numRows-1][1] = graphPoints.array[numRows-1][1];
         array[numRows-1][0] = graphPoints.array[numRows-1][0]; }
                  
      for (int r = 1; r < numRows-1; r++) {
      
         if (graphPoints.array[r-1][1] <= graphPoints.array[r][1] 
          && graphPoints.array[r][1] >= graphPoints.array[r+1][1]) {
          
          array[r][1] = graphPoints.array[r][1];
          array[r][0] = graphPoints.array[r][0]; }
      }
   }
   
   public String toString() {

   String toString = "";
   
      for (int r = 0; r < numRows; r++) {
         
         for (int c = 0; c < 2; c++) {
            
            toString = toString + array[r][c] + "   ";
         }
         
            toString = toString + "\n";
      }
      
      return toString;
   }  

}