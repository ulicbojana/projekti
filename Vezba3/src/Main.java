import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesi br a");
		int a=unos.nextInt();
		System.out.println("Unesi br b");
		int b=unos.nextInt();
		System.out.println("Unesi br c");
		int c=unos.nextInt();
		
		int sum;
		sum=a+b;
		System.out.println("Suma brojeva a i b je " + sum);
		
		int proiz;
		proiz=sum*c;
		System.out.println("Proizvod sume i c " + proiz);
		
		int inc;
		inc=proiz+2;
		System.out.println("incrementacija + 2  " + inc);
		
		if(inc%2==0){
			System.out.println("Inkrementisani broj je paran");
		}else{
			System.out.println("Broj je neparan");
		}
		
		int jed;
		int des;
		int sto;
		
		sto=inc/100;
		System.out.println("Broj stotina je " + sto);
		jed=inc%10;
		System.out.println("Broj jedinica je " + jed);
		des=(inc/10)%10;
		System.out.println("Broj desetica je " + des);
		
	}

}
