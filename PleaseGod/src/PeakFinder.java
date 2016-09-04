import java.util.Scanner;

public class PeakFinder extends DataSet { //why doesn't inheritance keep all the values from GraphData???

protected double maxAbsolute;
protected double minAbsolute;
   
   public PeakFinder(GraphData twoDimensionalData) {
   
   type = "Peaks";
         
      numRows = twoDimensionalData.numRows;
      
      //Make an array of this size:
      array = new double[numRows][2];
   
      //minAbsolute = super.minVal;
      //maxAbsolute = super.maxVal;
      
      if (twoDimensionalData.array[0][1] >= twoDimensionalData.array[1][1]) {
      
         array[0][1] = twoDimensionalData.array[0][1];
         array[0][0] = twoDimensionalData.array[0][0]; }
         
      if (twoDimensionalData.array[numRows-1][1] >= twoDimensionalData.array[numRows-2][1]) {
      
         array[numRows-1][1] = twoDimensionalData.array[numRows-1][1];
         array[numRows-1][0] = twoDimensionalData.array[numRows-1][0]; }
                  
      for (int r = 1; r < numRows-1; r++) {
      
         if (twoDimensionalData.array[r-1][1] <= twoDimensionalData.array[r][1] 
          && twoDimensionalData.array[r][1] >= twoDimensionalData.array[r+1][1]) {
          
          array[r][1] = twoDimensionalData.array[r][1];
          array[r][0] = twoDimensionalData.array[r][0]; }
      }
   }
   
   public String toString() {

   String toString = "\n" + type + "\n";
   
      for (int r = 0; r < numRows; r++) {
         
         for (int c = 0; c < 2; c++) {
            
            toString = toString + array[r][c] + "   ";
         }
         
            toString = toString + "\n";
      }
      
      return toString;
   }  

}