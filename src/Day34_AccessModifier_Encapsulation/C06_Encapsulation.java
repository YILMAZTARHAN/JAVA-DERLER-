package Day34_AccessModifier_Encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {
	
		C05 obj1=new C05();
		
		System.out.println(obj1.getAsgariMaas());
        //obj1.asgariMaas=3000;
		//C05 Class'�nda asgariMaas'� private yap�p getter() kulland���m i�in
		// asgari maas� g�rebiliyorum ama de�i�tiriyorum
        
        //classic acces modifier'lar�m�z ile bir  variable'a ula�abiliyorsak
		// istedi�imiz zaman de�i�tirme secene�imiz de olur
	}

}
