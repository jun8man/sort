package bubbleSort;

public class Disp {
	
	public static void out(int[] array){
				
		for(int i = 0; i < array.length; i++){
			System.out.print("[" + i + "] : " + array[i] + " ");
		}
		System.out.println();
	}

}
