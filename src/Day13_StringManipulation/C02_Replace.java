package Day13_StringManipulation;

public class C02_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 say�s�n� 
		// 1000 den b�y�k olup olmad���n� yazd�r�n.
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", "");
		
		if (Integer.valueOf(sonuc)>1000) {
		    System.out.println("Bulunan sonuc say�s� 1000'den �ok");
			
		} else {
			System.out.println("Bulunan sonuc say�s� 1000'den az");
		}
		
		

	}

}
