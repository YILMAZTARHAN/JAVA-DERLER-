package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C07_CopyOf {

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
			
			int birlesikArray[]=Arrays.copyOf(arr1, arr1.length+arr2.length);
			//[3,5,7,10,0,0,0]
			
			for (int i = 0; i < arr2.length; i++) { //2.Arrayý'in elemanlarýný alacaðýz
				
				birlesikArray[i+arr1.length]=arr2[i];
				
			}
			
			
			return birlesikArray;
			
			//System.out.println(Arrays.toString(birlesikArray));
		}

	}