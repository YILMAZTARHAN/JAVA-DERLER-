package Day35_Encapsulation_�nheritance;

public class Isci extends Muhasebe {

	protected String statu;
	protected String meslegi;
	protected String sendika;
	
	
	
	
	public static void main(String[] args) {
		
		Isci isci1=new Isci();
		isci1.meslegi="Kaynak��";
		isci1.saatUcreti=20;
		isci1.isim="Emine";
		isci1.maas=isci1.maasHesapla();
		
		System.out.println(isci1.isim+"'in maa�� : " +isci1.maas);
		
		
	}

}
