package Day29_StaticBlock_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
	// bir list oluþturalým
	// sonra list elemanlarýný deðiþtir method'u yazýp orada
	// list elemanlarýndan bazýlarýný deðiþtirelim
    // method void olsun
	// main method'a döndükten sonra yeniden list'i yazdýralým
		
		List<String>harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
		
		listElemanlarDegistir(harfler);//[D, B, C]
		System.out.println("Main Method'a dönünce list: " + harfler);
		
		//java'da list ve Array gibi objeler için de pass By Value geçerlidir
		// Yani farklý  bir method'a array veya List'e yeni deðer atamna yaparsanýz
		// orjinal array veya list deðiþmez
		
		
		listDegistir(harfler); // method 'da yeni deðer atadýðým halde harfler listesi deðiþmedi
		System.out.println("List'e yeni list atadýktan sonra Main Method'a dönünce list: " + harfler);
	}

	private static void listDegistir(List<String> harfler) {
	harfler=new ArrayList<>();
	System.out.println("List'e yani deðer atayýnca " + harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		
		harfler.set(0, "D");
		System.out.println("Method'da Deðiþtirdiðimiz list: " + harfler);
		
	}

}
