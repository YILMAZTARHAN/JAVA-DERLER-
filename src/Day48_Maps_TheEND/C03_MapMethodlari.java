package Day48_Maps_TheEND;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class C03_MapMethodlari {

	public static void main(String[] args) {
		
		Map<Integer,String>ornek=MapOlustur.MyMap();
		
		System.out.println(ornek);
		
		ornek.containsKey(110);
		System.out.println(ornek.containsKey(110));//False
		System.out.println(ornek.containsValue("JAVA"));//
		System.out.println(ornek.containsValue("Mustafa,Kan,JAVA"));//true
		
		Set<Entry<Integer, String>> entrySet=ornek.entrySet();
		
		int sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : " +each);
			sayac++;
			
		}

		System.out.println(ornek.getOrDefault(110,"girilen key map'de yok"));
		System.out.println(ornek.getOrDefault(103,"girilen key map'de var"));
		
		ornek.putIfAbsent(103,"Ali,Yan,C#");
		ornek.putIfAbsent(110,"Fikri,Yan,Qa");
		
        sayac=1;
		
		for (Entry<Integer, String> each : entrySet) {
			System.out.println(sayac+".entry : " +each);
			sayac++;
		}
		
		String maptenString=ornek.toString();
		
		System.out.println(maptenString);
		
	}

}
