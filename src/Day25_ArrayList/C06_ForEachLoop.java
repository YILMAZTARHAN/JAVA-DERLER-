package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

	public static void main(String[] args) {
		// Bazen index iele hiç uðraþmadan bir arry veya listedeki tüm elemanlarý
		// gözden geçirmek isteriz.
		
		int arr[]= {1,2,3,5,3,2,7};
		
		// bu array'i esnek bir list yapmak istiyorum
		
		List<Integer>yeniList=new ArrayList<>();
		
		/*for (int i = 0; i < arr.length; i++) {
			
			yeniList.add(arr[i]);
			
		}
         System.out.println(yeniList);*/
         
		for (int each:arr) {// arr deki herbir(each) int'i bana getir
			
			yeniList.add(each);
			
			
			
		}
		System.out.println(yeniList);
		
		// Eðer bir list veya arry'in tüm elemanlarýný elden geçirmek istiyorsak
		// ve sýralama önemli deðilse
		// for_each loop kullanýrýz
	}

}
