package Day13_StringManipulation;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayýsýný 
		// 1000 den büyük olup olmadýðýný yazdýrýn.
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", "");
		
		if (Integer.valueOf(sonuc)>1000) {
		    System.out.println("Bulunan sonuc sayýsý 1000'den çok");
			
		} else {
			System.out.println("Bulunan sonuc sayýsý 1000'den az");
		}
		
		

	}

}
