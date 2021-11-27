package Day20_Scope;



public class InstanceVar2 {
	
	String adres="Ankara";
	String dogumyeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ögrenciMi=true;
	boolean izinliMi;
   
	public static void main(String[] args) {
		// instance variable'lara main method'dan direk ulaþýlabilir mi? HAYIR
		// nasýl ulaþýlabilir
		
		InstanceVar2 ali=new InstanceVar2();
		System.out.println(ali.adres);// Ankara
		System.out.println(ali.dogumyeri);// null
		System.out.println(ali.notOrtalamasi);//0.0
		System.out.println(ali.yasOrt);//12.3
		System.out.println(ali.cinsiyet);// E
		System.out.println(ali.karakter);//space
		System.out.println(ali.ögrenciMi);//true
		System.out.println(ali.izinliMi);// false
		
		

	}
	  public static void staticMethod() {
	        // instance variable'lara static method'dan direk ulasilabilir mi ? HAYIR
	        // nasil ulasilabilir ? OBJE OLUSTURARAK
	        
	    }
	    
	    public void staticOlmayanMethod() {
	        // instance variable'lara static olmayan method'dan direk ulasilabilir mi ? EVET
	        
	        
	    }

}


