/**
 * 
 */
package selectionSort;

import getTargetList.getTargetList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import display.Disp;

/**
 * To test the selection sort.
 * 
 * @author Junya
 *
 */
public class selectionSort {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// Create array.
		List<Integer> targets = new ArrayList<Integer>();
		targets = getTargetList.get();

		int i; // Index for Head.
		int j; // Index for other than Head.
		int min; // Minumum value.
		int tmp; // To swap.
		int count = 0; // To count swapping. 
		
		// Sort.
		for(i = 0; i < targets.size(); i++){
			// set minimum value's index.
			min = i;
			
			// search the minimum value's index.
			for(j = i + 1; j < targets.size(); j++){
				if(targets.get(min) > targets.get(j)){
					min = j; 
					count++;
				}
			}
			
			// swap.
			tmp = targets.get(i);
			targets.set(i, targets.get(min));
			targets.set(min, tmp);
			
			System.out.print("Result #" + i + " : ");
			Disp.out(targets);
		}
		// Display the result of sort.
		System.out.print("Final Result : ");
		Disp.out(targets);
		System.out.print("Total Swapping : " + count);
	}

}
