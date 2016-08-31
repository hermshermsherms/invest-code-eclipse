//An array that stores the original data

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GraphData extends DataSet {

   protected double minVal;
   protected double maxVal;
   protected int numRows;
   Scanner inFile;
   String fileName;
   
public GraphData() {
   
   type = "Graph Data";
   
   StockValues data = new StockValues();
      
   numRows = data.numLines;
            
      //Make an array of this size:
      array = new double[numRows][2];
      
         for (int r = 0; r < numRows; r++) {
         
            array[r][0] = r+1; }
         
         for (int r = 0; r < numRows; r++) {
            
               array[r][1] = data.close[r];
            }
         
   //Find the minimum value:
   //minVal = FindMinValue();
   FindMinValue();
   
   
   //Find the maximum value:
   //maxVal = FindMaxValue();
   FindMaxValue();
   
}

public String toString() {

String toString = type + "\n";

   for (int r = 0; r < numRows; r++) {
      
      for (int c = 0; c < 2; c++) {
         
         toString = toString + array[r][c] + "   ";
      }
      
         toString = toString + "\n";
   }
   
   return toString;
}  
 
public double GetValue(int r, int c) {
   
   return array[r][c];
}

public int GetNumRows() {

   return numRows;
}

public void FindMinValue() {
   
      minVal = array[0][1];
      
         for (int r = 0; r < numRows; r++) {
   
            if (array[r][1] < minVal)
               minVal = array[r][1];
         }
      //return minVal;
}
 
public void FindMaxValue() {
   
   maxVal = array[0][1];
      
      for (int r = 0; r < numRows; r++) {
   
         if (array[r][1] > maxVal)
               maxVal = array[r][1];
      }
   //return maxVal;       
}

}