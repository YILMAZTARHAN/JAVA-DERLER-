package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
	//Verilen iki array'i birleştiren
	// ve sonucu birleşikArray isminde bir array'e kaydeden
		// bir matod oluşturun
		
		int arr1[]= {3,5,};
		int arr2[]= {2,4,6};
		
		
		int birlesikArray[]=birlestir(arr1,arr2);
		Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));
		
		
	

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length+arr2.length];
		for (int i = 0; i < arr1.length; i++) {// 1.array'in elemanarını birleşik arraya atadık
			birlesikArray[i]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) { //2.Arrayı'in elemanlarını alacağız
			
			birlesikArray[i+arr1.length]=arr2[i];
			
		}
		
		
		return birlesikArray;
		
		
	}

}
