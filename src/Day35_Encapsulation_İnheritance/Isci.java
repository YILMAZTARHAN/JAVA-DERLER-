package Day35_Encapsulation_Ýnheritance;

public class Isci extends Muhasebe {

	protected String statu;
	protected String meslegi;
	protected String sendika;
	
	
	
	
	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.meslegi="Kaynakçý";
		isci1.saatUcreti=20;
		isci1.isim="Emine";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.isim+"'in maaþý : " +isci1.maas);
		
		
	}

}
