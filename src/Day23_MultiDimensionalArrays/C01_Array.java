package Day23_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_Array {

	public static void main(String[] args) {
		// verieln bir Array'dan istenen de�ere sahip elementleri silip
		// kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazd�r�n
		
		int arr[]= {3,4,5,6,7,8,9,3,5,3,12,45,5,7,13};
		int silinecekEleman=3;
		
		//array'da yeni eleman ekleyemeyiz veya var olan elemanlar� silemeyiz
		// ��nk� array'in declare edilen uzunlu�u DE���MEZ
		
		// Bu soruda istenen elementi sildi�imizde geriye ka� element kal�yor nulmak laz�m
		// silinecek sayi adedini bulal�m
		
		int sayac=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==silinecekEleman) {
				sayac++;
			}
		}
		System.out.println(sayac);
		int yeniArrayUzunluk=arr.length-sayac;
		
		// art�k yeni array2i olu�turabiliriz
		
		int yeniArr[]=new int[yeniArrayUzunluk];
		
		//�imdi eski array deki elemanlar� birer birer al�p
		// silinecek elemana e�it olmayanlar� yeni array'e atamal�y�z.
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
