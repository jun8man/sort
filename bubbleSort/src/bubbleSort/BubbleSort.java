package bubbleSort;


import getTargetList.getTargetList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import display.Disp;

/**
 * To test the Bubble Sort.
 * 
 * @author Junya
 *
 */
public class BubbleSort {

	public static void main(String[] args) throws IOException{
		
		// Create array.
		List<Integer> targets = new ArrayList<Integer>();
		targets = getTargetList.get();

		int flag = 0; // Index for Head.
		int count = 0; // To count swapping. 
		
		// Sort.
		while(flag < targets.size()){
			int index = 0;
			
			while(index < targets.size() - 1){
				// compare and swap.
				if(targets.get(index) > targets.get(index + 1)){
					int tmp = targets.get(index);
					targets.set(index, targets.get(index + 1));
					targets.set((index + 1), tmp);
					count++;
				}
				index++;
			}
			System.out.print("Result #" + flag++ + " : ");
			Disp.out(targets);
		}
		// Display the result of sort.
		System.out.print("Final Result : ");
		Disp.out(targets);
		System.out.print("Total Swapping : " + count);
	}

}