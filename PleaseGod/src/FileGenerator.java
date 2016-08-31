import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileGenerator {

   //public FileGenerator(String outputFile, GraphData originalData, 
   //PeakFinder peaks) throws IOException {
   public FileGenerator(String outputFile, Stock stock) throws IOException {

   PrintWriter outFile = new PrintWriter(new FileWriter(outputFile));
         //outFile.println(originalData.type);
         //outFile.print(originalData + "\n");
         //outFile.println(peaks.type);
         //outFile.print(peaks + "\n");
         outFile.print(stock);
         
         outFile.close();

}
}
