package display;

import java.util.List;

public class Disp {
	
	public static void out(List<Integer> array){
				
		for(int i = 0; i < array.size(); i++){
			System.out.print("[" + i + "] : " + array.get(i) + " ");
		}
		System.out.println();
	}

}
