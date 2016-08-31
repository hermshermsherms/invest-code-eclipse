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
   
   //PullFromURL siteData = new PullFromURL();
   //StockValues stockValues = new StockValues();
         
   StockAnalytics stock = new StockAnalytics();

      System.out.print("Enter a name for the file you'd like to create:  ");
      String outputFile = keyboard.next();
         
        FileGenerator newFile = new FileGenerator(outputFile, stock);
}
}         