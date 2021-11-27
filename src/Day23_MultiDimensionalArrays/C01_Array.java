package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verieln bir Array'dan istenen deðere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdýrýn
		
		int arr[]= {3,4,5,6,7,8,9,3,5,3,12,45,5,7,13};
		int silinecekEleman=3;
		
		//array'da yeni eleman ekleyemeyiz veya var olan elemanlarý silemeyiz
		// çünkü array'in declare edilen uzunluðu DEÐÝÞMEZ
		
		// Bu soruda istenen elementi sildiðimizde geriye kaç element kalýyor nulmak lazým
		// silinecek sayi adedini bulalým
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		System.out.println(sayac);
		int yeniArrayUzunluk=arr.length-sayac;
		
		// artýk yeni array2i oluþturabiliriz
		
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		//þimdi eski array deki elemanlarý birer birer alýp
		// silinecek elemana eþit olmayanlarý yeni array'e atamalýyýz.
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) {
				yeniArr[index]=arr[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(yeniArr));

	}

}
