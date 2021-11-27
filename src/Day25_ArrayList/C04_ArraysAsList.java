package Day25_ArrayList;


import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		// verilen array'i Arrays class'inden yardým alarak
		// liste'e çevirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String>arraydenList=Arrays.asList(arr);
		
		System.out.println("list : " + arraydenList);
		
	 //	arraydenList.add("F"); // RTE : UnsupportedOperationException:Destekleyen iþlem
		                       // CTE: olmasý için 
		
		
		
		
		
		
		
		
		
		arr[1]="Z";
		
		System.out.println("Array'i deðiþtirdekten sonra, array= " + Arrays.toString(arr));
		System.out.println("Array'i deðiþtirdikten sonra, list = " + arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("List'i deðiþtirdek sonra, list = " + arraydenList);
		System.out.println("List'i deðiþtirdekten sonra, array= " + Arrays.toString(arr));
	}

}
