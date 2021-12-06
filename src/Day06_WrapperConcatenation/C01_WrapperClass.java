package Day06_WrapperConcatenation;

public class C01_WrapperClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int sayi1=10;
		Integer sayi2=20;
		
		//sayý1. yazdýðýmýzda hiç bir metot çýkmaz,çünkü sayi1 int'dýr yani primitive dir.
		//sayi2. yazdýðýmýzda bir çok metod geliyor.çünkü sayi2 Integer'dir yani wrapper class'dýr.
		
		
		String tel1="3578987";
		String tel2="3245434";
		
		System.out.println(tel1+tel2);
		
		// bu sayýlarý toplamak isterseniz 
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Short.MAX_VALUE);//32767
		
		
		//String caddeNo="B203";
		
		String caddeNo="203";
		String sokakNo="1564" ;
		
		System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo));
		//Integer.Valuof(String numerik ifade) method'u String Olarak kaydedilmiþ numerik ifadeler sayýya çevirir
		// String Ýfadede numerik olmayan bir karakter olursa
		//Java .NumberFormatException hatasý verir ve çalýþmayý durdurur.
		//stops execution
		
		System.out.println("Hello word");
		

	}

}
