package Day25_ArrayList;


import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		// verilen array'i Arrays class'inden yardım alarak
		// liste'e çevirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String>arraydenList=Arrays.asList(arr);
		
		System.out.println("list : " + arraydenList);
		
	 //	arraydenList.add("F"); // RTE : UnsupportedOperationException:Destekleyen işlem
		                       // CTE: olması için 
		
		
		
		
		
		
		
		
		
		arr[1]="Z";
		
		System.out.println("Array'i değiştirdekten sonra, array= " + Arrays.toString(arr));
		System.out.println("Array'i değiştirdikten sonra, list = " + arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("List'i değiştirdek sonra, list = " + arraydenList);
		System.out.println("List'i değiştirdekten sonra, array= " + Arrays.toString(arr));
	}

}
