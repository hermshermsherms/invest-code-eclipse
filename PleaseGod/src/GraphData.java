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
   
public GraphData() {

}

public GraphData(String fileName) {
   
   type = "Graph Data";
   //public ArrayFromFile(String fileName) throws IOException {
      
   SetUpFile(fileName);
   
     //Find the number of rows: 
         while (inFile.hasNext()) {
      
            inFile.nextLine();
         
            numRows++; }
            
      //Make an array of this size:
      array = new double[numRows][2];
      
      //Put the data from the file into a 2D array:
      SetUpFile(fileName);
      
         for (int r = 0; r < numRows; r++) {
         
            for (int c = 0; c < 2; c++) {
            
               array[r][c] = inFile.nextDouble();
            }
         }
         
   //Find the minimum value:
   //minVal = FindMinValue();
   FindMinValue();
   
   
   //Find the maximum value:
   //maxVal = FindMaxValue();
   FindMaxValue();
   
}

public void SetUpFile(String fileName) {
   
   inFile = null;
      
      while (inFile == null) {
      
      try {
         inFile = new Scanner(new FileReader(fileName + ".txt")); //GraphData.txt
         //inFile = new Scanner(new FileReader(fileName + ".csv")); //GraphData.txt

      }
      
      catch (FileNotFoundException e) {
         System.err.println(e.getMessage());
         System.err.print("File not found.");
         System.err.print("sorry, try again...");
         inFile = null;
         }
      }  
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

