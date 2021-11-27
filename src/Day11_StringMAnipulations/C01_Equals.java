package Day11_StringMAnipulations;

public class C01_Equals {

	public static void main(String[] args) {
		
	int a=10;
	int b=a+0;
	
	System.out.println(a==b); //true
	
	char ch1='K';
	char ch2='K'+0;
		
		System.out.println(ch1==ch2);//true
		
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";
		String str4=str1+" "+str2;
		
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		// String Variable 'larda == hem deðere hem de referansina bakar dolayýsýyla objeler farklý olduðunda
		// genelde false döner
		// str1.equals(str) ise referanslara deðil SADECE DEGERE BAKAR,
		// eðer case sensitive olarak String deðerleri ayni ise true döner.
		
		
		

	}

}
