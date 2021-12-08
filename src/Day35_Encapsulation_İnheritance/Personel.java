package Day35_Encapsulation_Ýnheritance;

public class Personel {
	
	protected String isim;
	protected String soyisim;
	protected boolean calýsýyorMu;
	protected String telNo;
	protected int yas;
	
	Personel(){
		System.out.println("Personel paramtresiz constructor çalýþtý");
	}
	
	
	//Eger variable'lara access modifier yazmazsak java access modifier olarak default
	// access modifier atar boyle olursa sadece o package altindaki child classlar
	//Personel clas'ini inherit edebilir
	//baska package'lardaki child claslarin da personeli inherit edebilmesi icin
	//variable ve methodlarin access modifier'larini protected yapariz
	//public yapsak da inherit edilebilir ama biz herkesin erismesini degil
	//sadece child clas'larin erismesini istedigimizden protected tercih ederiz
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
