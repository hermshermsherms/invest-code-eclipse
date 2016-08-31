//Criteria for a DataSet

import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public interface Data {

   String GetType();
   
	/**
	 * Returns 
	 *
	 * @return
	 */
    
	double GetValue();

 	/**
	 * Get the 
	 *
	 * @return 
	 */
    
	int GetNumRows();

	/**
	 * Checks if two providers are equal by checking if their 
     * names are equal (ignoring case).
	 *
	 * @param o
	 *            the object being compared
	 * @return true if the provider names match, false otherwise
	 */
	@Override
	boolean equals(Object o);

	/**
	 * Creates a String representation of a provider.
     * Any double values appearing in the representation are formatted to two decimal places. 
     *
	 * @return the String representation of a transactor
	 */
	@Override
	public String toString();
}
