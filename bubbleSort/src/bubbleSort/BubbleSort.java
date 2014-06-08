package bubbleSort;

/**
 * To test the Bubble Sort.
 * 
 * @author Junya
 *
 */
public class BubbleSort {

	public static void main(String[] args){
		
		// Create array.
		int[] targets = {2, 1, 5, 4, 3};
		
		// Disp the target.
		System.out.print("Initial Data: ");
		Disp.out(targets);
		
		int flag = 0;
		
		// Sort.
		while(flag < targets.length){
			int index = 0;
			
			while(index < targets.length - 1){
				// compare and swap.
				if(targets[index] > targets[index + 1]){
					int tmp = targets[index];
					targets[index] = targets[index + 1];
					targets[index + 1] = tmp;
				}
				index++;
			}
			System.out.print("Result #" + flag++ + " : ");
			Disp.out(targets);
		}
		// Display the result of sort.
		System.out.print("Final Result : ");
		Disp.out(targets);
	}

}