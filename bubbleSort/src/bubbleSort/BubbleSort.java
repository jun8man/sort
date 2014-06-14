package bubbleSort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * To test the Bubble Sort.
 * 
 * @author Junya
 *
 */
public class BubbleSort {

	public static void main(String[] args) throws IOException{
		
		// Create array.
		//int[] targets = {2, 1, 5, 4, 3};
		List<Integer> targets = new ArrayList<Integer>();
		
		// Prepare to input data.
		String inputFileName = "C:/cygwin/home/Junya/GitRepo/sort/input.data";
		File inFile = new File(inputFileName);

		// Read and store in array.
		try {
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);
			
			String str = null;
			while( ( str = br.readLine() ) != null ){
				// Parse string to integer and add to list.
				targets.add(Integer.parseInt(str));
			}
			// close BufferReader Object.
			br.close();
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		// Disp the target.
		System.out.print("Initial Data: ");
		Disp.out(targets);
		
		int flag = 0;
		
		// Sort.
		while(flag < targets.size()){
			int index = 0;
			
			while(index < targets.size() - 1){
				// compare and swap.
				if(targets.get(index) > targets.get(index + 1)){
					int tmp = targets.get(index);
					targets.set(index, targets.get(index + 1));
					targets.set((index + 1), tmp);
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