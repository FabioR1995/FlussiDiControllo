import java.util.Scanner;

public class InvertiStringa {

	public static void main(String[] args) {
		String parola;
		String inversa ="";
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci una parola");
		parola= tastiera.nextLine();
		for(int j=parola.length()-1;j>=0;j--)
			inversa=inversa+parola.charAt(j);
		System.out.println("La parola inversa e': "+ inversa );
	}

}
