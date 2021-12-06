package Day34_AccessModifier_Encapsulation;

public class C06_Encapsulation {

	public static void main(String[] args) {
	
		C05 obj1=new C05();
		
		System.out.println(obj1.getAsgariMaas());
        //obj1.asgariMaas=3000;
		//C05 Class'ýnda asgariMaas'ý private yapýp getter() kullandýðým için
		// asgari maasý görebiliyorum ama deðiþtiriyorum
        
        //classic acces modifier'larýmýz ile bir  variable'a ulaþabiliyorsak
		// istediðimiz zaman deðiþtirme seceneðimiz de olur
	}

}
