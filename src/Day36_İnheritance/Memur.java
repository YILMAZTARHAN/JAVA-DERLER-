package Day36_�nheritance;

import Day35_Encapsulation_�nheritance.Muhasebe;

public class Memur extends Muhasebe {

	public static void main(String[] args) {
	
		Memur memur1=new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.maasHesapla();
		
		System.out.println(memur1.isim +"'�n maa�� :" + memur1.maas);
		

	}

}
