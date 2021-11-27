package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C02_MDArrays {

	public static void main(String[] args) {
		//MultiDimensional Array'ler iç içe konulmuþ arrayler demektir.
		// Array oluþturmak için iki yöntemimiz vardý
		// 1.yöntem önce declare edip sonra deger atama
		
		int arr[][]=new int [3][2];// outer array'i 3 elemanlý
		                           // her bir inner arry ise 2 elemanlý olan MDArray oluþturur
		// bu yöntemle oluþturduðumuzda inner array'lerin heps, ayni boyutta olmalýdýr.
		System.out.println(Arrays.toString(arr));// direk outer array£i yazdýrmak istediðimizde
		                                         // içindeki elemanlar non-primitive olduðundan
		                                         // referanslarý yazdýrýr
		                                         //  [[I@a09ee92, [I@30f39991, [I@452b3a41]

	
	
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
		
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		
		System.out.println(Arrays.deepToString(arr));
		
		// Array oluþturmak için iki yöntemimiz vardý
		// 2.yöntem declare edip hem de deðer atama
		
		int arr2[][]={{0},{1,2,3},{6,7,8,9}  };
		System.out.println(Arrays.deepToString(arr2));//[[0], [1, 2, 3], [6, 7, 8, 9]]
		System.out.println(Arrays.toString(arr2[2]));//[6, 7, 8, 9]
		System.out.println(arr2[2][1]);//7
		
	}

}
