package Day35_Encapsulation_�nheritance;

public class C02_Setter {

	public static void main(String[] args) {
		
		// ��retmenler ��rencinin notunu girebilsin
		// ama t�m notlar� g�remesin
		// sadece ge�ip ge�emedi�ini g�rs�n
	
		C01 ogr1=new C01();
		
		ogr1.isGecerMi();
		System.out.println(ogr1.isGecerMi());// False
		
		ogr1.setNot(60);
		System.out.println(ogr1.isGecerMi());//true
	}

}
