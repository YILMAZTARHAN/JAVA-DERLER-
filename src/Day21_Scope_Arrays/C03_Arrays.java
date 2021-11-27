package Day21_Scope_Arrays;

public class C03_Arrays {

	public static void main(String[] args) {
		// soru 1-Elemanlari “Ali” , Veli”, Ayse” ve Fatma” olan bir array olusturun 
		
	String arr[]=new String[4];
	arr[0]="Ali";
	arr[1]="Veli";
	arr[2]="Ayþe";
	arr[3]="Fatma";
	
	String arr2[]= {"Ali","Veli","Ayþe","Ayþe"};
	
	//Soru 2: Soru 1'deki elemanlardan "Ali" yerine "Can" , Ayþe yerine "Gül atayýn
	
	arr2[0]="Can";
	arr2[2]="Gül";
	
	System.out.println(arr[1]);
	
	// Son elenti yazdýrýn
	System.out.println(arr[arr.length-1]);// Sitringteki length() idi burada sadece length
		
	
	
	
	
	}
}
