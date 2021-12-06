package Day34_AccessModifier_Encapsulation;

public class C01 {
	
	private int sayiPrivate=10;
	// private class üyelerine sadece içinde bulunduðu class'dan ulaþabilirsiniz.
	
	int sayiDefault=20;
	//default class üyelerine sadece içinde bulunduðu package'dan ulaþýlabilir
	// defauld access modiier'in diðer ismi de package access modifierdir.
	
	protected int sayiProtected=30;
	//Protected class üyelerine içinde bulunduðu package'daki tüm class'lar
	//ve baþka paskage 'lardaki child class'lar ulaþabir
	
	public int sayiPublic=40;
	
	// herkes ulaþabilir
	

	public static void main(String[] args) {
	
		C01 obj=new C01();
		
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
        System.out.println(obj.sayiPublic);
	}
      public void staticOlmayanMethod() {
    	  
     C01 obj=new C01();
     
	System.out.println(obj.sayiPrivate);
	System.out.println(obj.sayiDefault);
	System.out.println(obj.sayiProtected);
    System.out.println(obj.sayiPublic);
}
}
