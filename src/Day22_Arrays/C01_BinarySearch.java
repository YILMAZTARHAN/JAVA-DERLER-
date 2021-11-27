package Day22_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
	
		String isimler[]= {"Hacer","ainag�l","Emine","Murat","Kutlu"};
		
		// isimler arry'inde Murat ismi var m�
		
		// array'da arama yapmadan �nce s�ralama yapmal�y�z
		
		Arrays.sort(isimler);
		// arrays class'i ile yapt���m�zda array'imizi kal�c� olarak de�i�ir.
		
		System.out.println(Arrays.toString(isimler));//[Emine, Hacer, Kutlu, Murat, ainag�l]
        // sort method'u elementleri natural orde'a g�re siralar
		
		isimler[4]="Ainag�l";
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));//[Ainag�l, Emine, Hacer, Kutlu, Murat]
		
		System.out.println(Arrays.binarySearch(isimler, "Murat"));
		System.out.println(Arrays.binarySearch(isimler, "Mehmet"));
		System.out.println(Arrays.binarySearch(isimler, "Tuba"));
		System.out.println(Arrays.binarySearch(isimler, "Kursat"));
		
		
	}

}
