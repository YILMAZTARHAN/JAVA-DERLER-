package Day44_Iterators_Collections;

import java.util.ArrayList;
import java.util.List;

public class C01_Iterator {

	public static void main(String[] args) {
		
		
	List<Integer>liste=new ArrayList<>();
	
	liste.add(5);
	liste.add(3);
	liste.add(7);
	liste.add(1);
	liste.add(9);
	liste.add(8);
	liste.add(2);
	
	System.out.println(liste);
	
// index kullanmadan t�m elemanlar� 3 eklenmi� yazd�ral�m
	for (Integer each : liste) {
		System.out.print(each+3 + " ");
	}
	
	System.out.println("");
	System.out.println(liste);
	
	for (Integer each : liste) {
		each+=3;
		System.out.print(each + " ");
	}
	
	System.out.println("");
	System.out.println(liste);
	
	// foreach loop
	
	}

}
