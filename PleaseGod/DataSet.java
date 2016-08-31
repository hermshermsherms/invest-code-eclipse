//This is an outline for the many different types of chart values (ie original data, STDEV, Peaks...)
//One stock will have an array of data sets

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataSet implements Data {

Scanner keyboard = new Scanner(System.in);

/**
 * Stores the type of data set
 */  
   protected String type;

/**
 * Stores the ID of a Provider (for the switch)
 */  
   protected int numRows;
   
/**
 * The 2D array of data
 */
   protected double[][] array;

/**
 * Constructs a DataSet
 */
public DataSet() {

}

/**
 * Prompts user to fill in the information of a certain provider
 *
 * @param   kb    The Scanner sent from the ProviderListDriver
 */ 
public void create(Scanner kb) {
}

/**
 * Getter method for DataSet's type
 */   
public String GetType(){
   return type;
}

/**
 * Getter method for DataSet's number of rows
 */   
public int GetNumRows() {
   return numRows;
}

public double GetValue() {
   return 99999;
}


/**
 * Getter method for the DataSet's array
 */   
public double[][] GetArray(){
   return array;
}

  
/**
 * A description of what the Provider offers and specific information
 *
 * @return    toString    the string including all the information of a Provider
 */    
public String toString() {
   String toString = String.format(type); //you want to add the array
   return type;
}

}