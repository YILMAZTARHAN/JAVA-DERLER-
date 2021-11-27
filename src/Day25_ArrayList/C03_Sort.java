package Day25_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_Sort {

	public static void main(String[] args) {
		
		List<String> isimler=new ArrayList<>();
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler);
		
		// s�ralama yapmak istiyorsak a�a��daki methodu kullanabiliriz
		
		Collections.sort(isimler);
		System.out.println(isimler);
		
		isimler.add("filiz");
		
		System.out.println(isimler);
		Collections.sort(isimler);
		System.out.println(isimler);
		
		
		
		

	}

}
