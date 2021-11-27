package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		//MultiDimensional Array'ler i� i�e konulmu� arrayler demektir.
		// Array olu�turmak i�in iki y�ntemimiz vard�
		// 1.y�ntem �nce declare edip sonra deger atama
		
		int arr[][]=new int [3][2];// outer array'i 3 elemanl�
		                           // her bir inner arry ise 2 elemanl� olan MDArray olu�turur
		// bu y�ntemle olu�turdu�umuzda inner array'lerin heps, ayni boyutta olmal�d�r.
		System.out.println(Arrays.toString(arr));// direk outer array�i yazd�rmak istedi�imizde
		                                         // i�indeki elemanlar non-primitive oldu�undan
		                                         // referanslar� yazd�r�r
		                                         //  [[I@a09ee92, [I@30f39991, [I@452b3a41]

	
	
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		
		System.out.println(Arrays.deepToString(arr));
		
		// Array olu�turmak i�in iki y�ntemimiz vard�
		// 2.y�ntem declare edip hem de de�er atama
		
		int arr2[][]={{0},{1,2,3},{6,7,8,9}  };
		System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]
		System.out.println(Arrays.toString(arr2[2]));//[6, 7, 8, 9]
		System.out.println(arr2[2][1]);//7
		
	}

}
