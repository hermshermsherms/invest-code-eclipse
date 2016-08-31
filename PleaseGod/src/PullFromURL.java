import java.net.*;
import java.util.Scanner;
import java.io.*;

public class PullFromURL {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What stock do you want to add to the database?");
		String input = scanner.nextLine();
		String baseUrl = "http://chart.finance.yahoo.com/table.csv?s=";
		String endUrl = "&a=6&b=26&c=2016&d=7&e=26&f=2016&g=d&ignore=.csv";
		String urlFull = baseUrl+input+endUrl;
		URL oracle  = new URL(urlFull);
		BufferedReader in = new BufferedReader(
				new InputStreamReader(oracle.openStream()));
		String[] stockArray = new String[60];
		String inputLine = "";
		int i = 0;
		int lineCounter = 0;
		//in.readLine(); //skip first line
		while((inputLine = in.readLine()) != null){
			stockArray[i] = inputLine; //fill array
			i++;
			lineCounter++;
		}
		in.close();

		int j;
		for(j=0;j<lineCounter;j++){ //print array
			System.out.println(stockArray[j]);
		}
	}
}


