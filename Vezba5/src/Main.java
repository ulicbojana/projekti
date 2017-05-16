import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesi br a");
		int a = unos.nextInt();
		System.out.println("Unesi br b");
		int b = unos.nextInt();
		System.out.println("Unesi br c");
		int c = unos.nextInt();
        int br=0; int s=0;
		for (int i = a; i <= b; i++)
			if (i % c == 0)
				br++;
		
				System.out.println("brojeva ima"  + br );
		
				for (int i = a; i <= b; i++)
					if (i % c == 0)
						 s = s + i;
				
						System.out.println(s );
				
	}
}