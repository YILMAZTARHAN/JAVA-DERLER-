package Day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
	
		String isimler[]= {"Hacer","ainagül","Emine","Murat","Kutlu"};
		
		// isimler arry'inde Murat ismi var mý
		
		// array'da arama yapmadan önce sýralama yapmalýyýz
		
		Arrays.sort(isimler);
		// arrays class'i ile yaptýðýmýzda array'imizi kalýcý olarak deðiþir.
		
		System.out.println(Arrays.toString(isimler));//[Emine, Hacer, Kutlu, Murat, ainagül]
        // sort method'u elementleri natural orde'a göre siralar
		
		isimler[4]="Ainagül";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));//[Ainagül, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat"));
		System.out.println(Arrays.binarySearch(isimler, "Mehmet"));
		System.out.println(Arrays.binarySearch(isimler, "Tuba"));
		System.out.println(Arrays.binarySearch(isimler, "Kursat"));
		
		
	}

}
