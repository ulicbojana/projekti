
public class Main {

	public static void main(String[] args) {
		String recenica = "Danas je ponedeljak a sutra je utorak";
		 
        for (int i = 0; i < recenica.length(); i++) {
            if (recenica.charAt(i) == ' ')
                System.out.println();
            else
                System.out.print(recenica.charAt(i));
        }
    }
}

	


