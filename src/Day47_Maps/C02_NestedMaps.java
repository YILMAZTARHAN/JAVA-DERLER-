package Day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMaps {

	public static void main(String[] args) {
	 // i�i�e map olu�turacaksak en i�erdekinden ba�lamam�z tevsiye olunur 
		
		
		Map<String,String>ogr1Map=new HashMap<>();
		
		ogr1Map.put("isim", "Ali");
		ogr1Map.put("soyisim", "can");
		ogr1Map.put("Brans", "J.dev");
		
Map<String,String>ogr2Map=new HashMap<>();
		
		ogr2Map.put("isim", "Veli");
		ogr2Map.put("soyisim", "Yan");
		ogr2Map.put("Brans", "QA");
		
Map<String,String>ogr3Map=new HashMap<>();
		
		ogr3Map.put("isim", "Ali");
		ogr3Map.put("soyisim", "Yan");
		ogr3Map.put("Brans", "C#");
		
Map<String,String>ogr4Map=new HashMap<>();
		
		ogr4Map.put("isim", "Ay�e");
		ogr4Map.put("soyisim", "can");
		ogr4Map.put("Brans", "QA");
		
		System.out.println("1. ��renci : " +ogr1Map);
		System.out.println("2. ��renci : " +ogr2Map);
		System.out.println("3. ��renci : " +ogr3Map);
		System.out.println("4. ��renci : " +ogr4Map);
		
		
		Map<Integer,Map>sinifMap=new HashMap<>();
		
		sinifMap.put(101, ogr1Map);
		sinifMap.put(102, ogr2Map);
		sinifMap.put(103, ogr3Map);
		sinifMap.put(104, ogr4Map);
		
		System.out.println(sinifMap);
		
		
		

	}

}
