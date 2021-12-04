package Day30_ImmutableClasses;

public class C02_Immutable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		String str="Ali";
		
		for (int i = 0; i <100; i++) {
			str+=" ";
			
		}

		// bu kod çalýþtýðýnda java kaç obje oluþturur ?
		
		// bir obje baþta oluþturuldu
		// loop'da ise 100 obje daha oluþturuldu
		// Dolayýsýyla bu kod çalýþtýðýnda biz ekranda hiç bir þey görmeyiz ama
		// Java 101 obje oluþturmuþ olur
		// str'in son deðeri ise "Ali             (100 tane boþluk)         "
		
		
		
	}

}
