package Day35_Encapsulation_�nheritance;

public class Muhasebe extends Personel {

	protected int saatUcreti;
	protected String stat�;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe paramtresiz constructor �al��t�");
	}
	
	
	public static void main(String[] args) {
		
   Muhasebe clsn1=new Muhasebe();
   
   clsn1.isim="Ali";
   System.out.println(clsn1.soyisim);// null
		
		
	
		
		
		
		
		
		

	}

	public int maasHesapla() {
		
		int maas=8*25*saatUcreti;
		return maas;
		
	}
	
	
	
	
}
