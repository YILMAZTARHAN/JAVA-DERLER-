package Day48_Maps_TheEND;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
	  //Soru 3 ) Verilen map�te istenen programlama dilini bilen kisileri 
     // list olarak donduren bir method yaziniz.
    // map { 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
   // Istenen dil  java
  // Sonuc  [Ali, Veli]
		
		
		Map<Integer,String>soruMap=MapOlustur.MyMap();
		
		String istenenDil="Java";
		
		dilBilenListesiOlustur(soruMap,istenenDil);
        System.out.println(dilBilenListesiOlustur(soruMap,istenenDil));
	}

	private static List<String> dilBilenListesiOlustur(Map<Integer, String> soruMap, String istenenDil) {
		
		List<String>dilBilenListesi=new ArrayList<>();
		//{ 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
		// Istenen dil  java
		
		soruMap.values();// bana collection d�nd�r�yor
		
		List<String>valueList=new ArrayList<>(soruMap.values());
		//valueList==> eleman say�s� 3 [Ali,Can,Java, Veli,Yan,Java, Ali,Yan,C#]
		// bu i� eleman� tek tek ele al�p split ile b�l�p
		// dil de�eri verilen input'a e�it olanlar�n
		// isim de�erlerini dilBilenListesi'ne ekleyece�im
		
		String parcaliArr[]=new String[3];
		
		
		
		for (String each : valueList) {
			parcaliArr=each.split(",");//[Ali,Can,Java] �eklinde 3 elemanl� bir array getirecek
			
			if (parcaliArr[2].equalsIgnoreCase(istenenDil)) {
				dilBilenListesi.add(parcaliArr[0]);
				
				
			}
			
			
			
		}
		
		
		
		return dilBilenListesi;
		
		
		
	}

}
