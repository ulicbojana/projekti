import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi broj: ");
		int a = unos.nextInt();
		

		int b=0;
			
				if (a % 2 == 0) {
					for (int i = 0; i < 10; i++) 
				System.out.println(a);
				}
			
			
					
	int br=0;		
	if (a % 2!= 0) {
		
		while(br<5)
			br++;
	System.out.println(a);
	}


		}

	}


/*
 * Napiši program u Javi koji pročita jedan broj preko tipkovnice. Nakon toga
 * program odredi da li je upisani broj paran ili neparan. Ako je paran neka
 * program ispiše taj broj 10 puta pomoću for petlje. U slučaju da je neparan
 * neka program ispiše broj 5 puta pomoću do - while petlje
 */