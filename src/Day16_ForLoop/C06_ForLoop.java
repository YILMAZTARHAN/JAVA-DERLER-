package Day16_ForLoop;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
	//	Soru 5) Kullanicidan 100�den kucuk bir tamsayi isteyin. 
     //    1�den baslayarak girilen sayiya kadar 3�un veya 5�in kati olan sayilari yazdirin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("L�tfen Y�zden k���k bir say� giriniz...");
		int num=scan.nextInt();
		
		
for (int i = 1; i <=num ; i++) {
			
	if (i%3==0 || i%5==0) {
		System.out.print(i + " ");
			}
			
		}
		
		
		scan.close();
		
		
		

	}

}
