package Day20_Scope;

public class InstanceVar {

	int notMat=50;
	int notFen;
	// �nstance variable'lar�n scope'unda main method yoktur.
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		//System.out.println(notMat);//main metot oldu�u i�in static olmayan variable'lar
		                           // main method'a direk kullan�lamaz veya g�r�nt�lenemez
		
		// instance veriable2lara main metod'dn ula�mak istersek obje olu�turup
		//obje  �zerinden eri�im sa�layabiliriz.
		
		// Scanner scan=new Scanner(System.in);
		// i�inde oldu�umuz class tan bir obje olu�tural�m
		
		InstanceVar y�lmaz=new InstanceVar();
		System.out.println(y�lmaz.notMat);// 50
		
		InstanceVar tarhan=new InstanceVar();
		
		tarhan.notMat=70;
		System.out.println(tarhan.notMat);
        // instance variable'larda de�er atamazsak java �nstance olarak atanan de�eri al�r.
		//  bu class i�in notMat=50 gibi
		// ama istersek de�er  de atayabiliriz
		// bu durumda de�er atad���m�z obje i�in yeni de�er ge�erli olur.
		
		System.out.println(y�lmaz.notMat);// 50
		
		// Y�lmaz�n notunu de�i�tirmek istersek y�lmaz.notMat'a de�er atamaliy�z.
		
		y�lmaz.notMat=90;
		System.out.println(y�lmaz.notMat);// 90
		
		y�lmaz.method2();// method static olmad��� i�in main method'dan direk �a�r�lamaz
		
	}
	
	
	public static void staticMetot() {
		//System.out.println(notFen);// instance variable'lara static method'lardan direk ula��lamaz.
		
		
	}

    public  void method2() {
    	System.out.println("method2'deki notfen : " + notFen);// Bu method static olmad��� i�in instance �al���r.
    	//instance variable olu�tururken de�er atanmasa da olur
    	//bu durumda java default de�erler atar
    	//int i�in default de�er 0'd�r.
    	
    	notFen=100;
    	System.out.println("method2'deki notfen : " + notFen);
    	
	}
	
	
	
	
	
}
