package Day35_Encapsulation_Ýnheritance;

public class C02_Setter {

	public static void main(String[] args) {
		
		// öðretmenler öðrencinin notunu girebilsin
		// ama tüm notlarý göremesin
		// sadece geçip geçemediðini görsün
	
		C01 ogr1=new C01();
		
		ogr1.isGecerMi();
		System.out.println(ogr1.isGecerMi());// False
		
		ogr1.setNot(60);
		System.out.println(ogr1.isGecerMi());//true
	}

}
