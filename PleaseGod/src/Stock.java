//Stock values (imported from Jeremy's urlPuller as a 1Dim Array of Strings)

public class Stock { //extends DataSet

   protected String name;
   protected String[] date;
   protected double[] open;
   protected double[] high;
   protected double[] low;
   protected double[] close;
   protected double[] volume;
   protected int numLines;

   public Stock() {
   
   PullFromURL siteData = new PullFromURL();
   
   name = siteData.input;
   numLines = siteData.numLines;
   
   //System.out.println(name);
   
   //System.out.println(siteData);
   
   date = new String[numLines];
   open = new double[numLines];
   high = new double[numLines];
   low = new double[numLines];
   close = new double[numLines];
   volume = new double[numLines];
      
      for (int i = 0; i < numLines; i++) {
      
      String line = siteData.stockArray[i];
      
         date[i] = line.substring(0, line.indexOf(","));
            line = line.substring(line.indexOf(",")+1);
         open[i] = Double.parseDouble(line.substring(0, line.indexOf(",")));
            line = line.substring(line.indexOf(",")+1);
         high[i] = Double.parseDouble(line.substring(0, line.indexOf(",")));
            line = line.substring(line.indexOf(",")+1);
         low[i] = Double.parseDouble(line.substring(0, line.indexOf(",")));
            line = line.substring(line.indexOf(",")+1);
         close[i] = Double.parseDouble(line.substring(0, line.indexOf(",")));
            line = line.substring(line.indexOf(",")+1);
         volume[i] = Double.parseDouble(line.substring(0, line.indexOf(",")));
      }
   }
   
public String toString() {

String toString = "date   open   high   low   close   volume" + "\n";

   for (int l = 0; l < numLines; l++) {
   
      toString = toString + date[l] + "   " + open[l] + "   " 
                          + high[l] + "   " + low[l] + "   " + close[l] 
                          + "   " + volume[l] + "\n";
   }
   
   return toString;
}  

}