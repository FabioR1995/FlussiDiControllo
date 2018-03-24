import java.util.Scanner;

public class ContaSpazi {

	public static void main(String[] args) {
		char spazio=' ';
		String frase;
		int contaSpazi = 0;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci una frase:");
		frase = tastiera.nextLine();
		for (int i=0;i<frase.length();i++) 
			if(frase.charAt(i)==spazio)
				contaSpazi++;
		System.out.println("Gli spazi definiti sono: "+ contaSpazi);
	}	
}
	
