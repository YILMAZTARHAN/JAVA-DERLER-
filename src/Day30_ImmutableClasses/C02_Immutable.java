package Day30_ImmutableClasses;

public class C02_Immutable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
		String str="Ali";
		
		for (int i = 0; i <100; i++) {
			str+=" ";
			
		}

		// bu kod �al��t���nda java ka� obje olu�turur ?
		
		// bir obje ba�ta olu�turuldu
		// loop'da ise 100 obje daha olu�turuldu
		// Dolay�s�yla bu kod �al��t���nda biz ekranda hi� bir �ey g�rmeyiz ama
		// Java 101 obje olu�turmu� olur
		// str'in son de�eri ise "Ali             (100 tane bo�luk)         "
		
		
		
	}

}
