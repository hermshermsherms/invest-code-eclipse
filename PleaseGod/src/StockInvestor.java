//Stock Investor

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class StockInvestor {

//private Stock[] stocks = new Stock[100];

   public static void main(String[]args) throws IOException {
   
   Scanner keyboard = new Scanner(System.in);
   
   System.out.print("Enter the name of the file containing stock data:  ");
         String fileName = keyboard.next();
         
   Stock stock = new Stock(fileName);

   //GraphData originalData = new GraphData(fileName);
   //PeakFinder peaks = new PeakFinder(fileName);
   //StandardDeviation stdev = new StandardDeviation(fileName);

      System.out.print("Enter a name for the file you'd like to create:  ");
      String outputFile = keyboard.next();
         
         //FileGenerator newFile = new FileGenerator(outputFile, originalData, peaks); //make it super.toString
         FileGenerator newFile = new FileGenerator(outputFile, stock);
}
}         
