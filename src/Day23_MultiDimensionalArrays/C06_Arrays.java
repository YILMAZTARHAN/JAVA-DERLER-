package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
	//Verilen iki array'i birleþtiren
	// ve sonucu birleþikArray isminde bir array'e kaydeden
		// bir matod oluþturun
		
		int arr1[]= {3,5,};
		int arr2[]= {2,4,6};
		
		
		int birlesikArray[]=birlestir(arr1,arr2);
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));
		
		
	

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {// 1.array'in elemanarýný birleþik arraya atadýk
			birlesikArray[i]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) { //2.Arrayý'in elemanlarýný alacaðýz
			
			birlesikArray[i+arr1.length]=arr2[i];
			
		}
		
		
		return birlesikArray;
		
		
	}

}
