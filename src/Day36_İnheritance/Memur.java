package Day36_Ýnheritance;

import Day35_Encapsulation_Ýnheritance.Muhasebe;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
	
		Memur memur1=new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.maasHesapla();
		
		System.out.println(memur1.isim +"'ýn maaþý :" + memur1.maas);
		

	}

}
