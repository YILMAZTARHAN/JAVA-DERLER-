package Day06_WrapperConcatenation;

public class C01_WrapperClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi1=10;
		Integer sayi2=20;
		
		//say�1. yazd���m�zda hi� bir metot ��kmaz,��nk� sayi1 int'd�r yani primitive dir.
		//sayi2. yazd���m�zda bir �ok metod geliyor.��nk� sayi2 Integer'dir yani wrapper class'd�r.
		
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);
		
		// bu say�lar� toplamak isterseniz 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Short.MAX_VALUE);//32767
		
		
		//String caddeNo="B203";
		
		String caddeNo="203";
		String sokakNo="1564" ;
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		//Integer.Valuof(String numerik ifade) method'u String Olarak kaydedilmi� numerik ifadeler say�ya �evirir
		// String �fadede numerik olmayan bir karakter olursa
		//Java .NumberFormatException hatas� verir ve �al��may� durdurur.
		//stops execution
		
		System.out.println("Hello word");
		

	}

}
