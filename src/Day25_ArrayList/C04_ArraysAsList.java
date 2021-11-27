package Day25_ArrayList;


import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {
		
		// verilen array'i Arrays class'inden yard�m alarak
		// liste'e �evirebiliriz
		
		String arr[]= {"A","b","C","d"};
		
		List<String>arraydenList=Arrays.asList(arr);
		
		System.out.println("list : " + arraydenList);
		
	 //	arraydenList.add("F"); // RTE : UnsupportedOperationException:Destekleyen i�lem
		                       // CTE: olmas� i�in 
		
		
		
		
		
		
		
		
		
		arr[1]="Z";
		
		System.out.println("Array'i de�i�tirdekten sonra, array= " + Arrays.toString(arr));
		System.out.println("Array'i de�i�tirdikten sonra, list = " + arraydenList);
		
		arraydenList.set(3, "D");
		System.out.println("List'i de�i�tirdek sonra, list = " + arraydenList);
		System.out.println("List'i de�i�tirdekten sonra, array= " + Arrays.toString(arr));
	}

}
