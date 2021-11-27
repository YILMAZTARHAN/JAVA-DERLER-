package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
	//Verilen iki array'i birle�tiren
	// ve sonucu birle�ikArray isminde bir array'e kaydeden
		// bir matod olu�turun
		
		int arr1[]= {3,5,};
		int arr2[]= {2,4,6};
		
		
		int birlesikArray[]=birlestir(arr1,arr2);
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));
		
		
	

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {// 1.array'in elemanar�n� birle�ik arraya atad�k
			birlesikArray[i]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) { //2.Array�'in elemanlar�n� alaca��z
			
			birlesikArray[i+arr1.length]=arr2[i];
			
		}
		
		
		return birlesikArray;
		
		
	}

}
