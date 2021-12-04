package Day32_Varargs_StringBuilder;

public class C02_Varargs {

	public static void main(String[] args) {
		topla(5,8,10,13,15,0);
		
		// varargs list gibi davran�r ama
		// array methodlar� ile �al���r

	}

	private static void topla(int...say�lar ) {
		
		int toplam=0;
		
		for (int each:say�lar) {
			toplam+=each;
		}
		System.out.println("Girilen Say�lar�n Toplam� : " + toplam);
	}

}
