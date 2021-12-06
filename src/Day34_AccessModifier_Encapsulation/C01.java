package Day34_AccessModifier_Encapsulation;

public class C01 {
	
	private int sayiPrivate=10;
	// private class �yelerine sadece i�inde bulundu�u class'dan ula�abilirsiniz.
	
	int sayiDefault=20;
	//default class �yelerine sadece i�inde bulundu�u package'dan ula��labilir
	// defauld access modiier'in di�er ismi de package access modifierdir.
	
	protected int sayiProtected=30;
	//Protected class �yelerine i�inde bulundu�u package'daki t�m class'lar
	//ve ba�ka paskage 'lardaki child class'lar ula�abir
	
	public int sayiPublic=40;
	
	// herkes ula�abilir
	

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
