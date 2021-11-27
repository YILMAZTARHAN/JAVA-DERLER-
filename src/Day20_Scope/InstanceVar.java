package Day20_Scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	// ýnstance variable'larýn scope'unda main method yoktur.
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//System.out.println(notMat);//main metot olduðu için static olmayan variable'lar
		                           // main method'a direk kullanýlamaz veya görüntülenemez
		
		// instance veriable2lara main metod'dn ulaþmak istersek obje oluþturup
		//obje  üzerinden eriþim saðlayabiliriz.
		
		// Scanner scan=new Scanner(System.in);
		// içinde olduðumuz class tan bir obje oluþturalým
		
		InstanceVar yýlmaz=new InstanceVar();
		System.out.println(yýlmaz.notMat);// 50
		
		InstanceVar tarhan=new InstanceVar();
		
		tarhan.notMat=70;
		System.out.println(tarhan.notMat);
        // instance variable'larda deðer atamazsak java ýnstance olarak atanan deðeri alýr.
		//  bu class için notMat=50 gibi
		// ama istersek deðer  de atayabiliriz
		// bu durumda deðer atadýðýmýz obje için yeni deðer geçerli olur.
		
		System.out.println(yýlmaz.notMat);// 50
		
		// Yýlmazýn notunu deðiþtirmek istersek yýlmaz.notMat'a deðer atamaliyýz.
		
		yýlmaz.notMat=90;
		System.out.println(yýlmaz.notMat);// 90
		
		yýlmaz.method2();// method static olmadýðý için main method'dan direk çaðrýlamaz
		
	}
	
	
	public static void staticMetot() {
		//System.out.println(notFen);// instance variable'lara static method'lardan direk ulaþýlamaz.
		
		
	}

    public  void method2() {
    	System.out.println("method2'deki notfen : " + notFen);// Bu method static olmadýðý için instance çalýþýr.
    	//instance variable oluþtururken deðer atanmasa da olur
    	//bu durumda java default deðerler atar
    	//int için default deðer 0'dýr.
    	
    	notFen=100;
    	System.out.println("method2'deki notfen : " + notFen);
    	
	}
	
	
	
	
	
}
