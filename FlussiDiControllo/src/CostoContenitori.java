import java.util.Scanner;

public class CostoContenitori {

	public static void main(String[] args) {
		double volumeCilindro;
		double raggioCilindro;
		double altezzaCilindro;
		double prezzoCilindro;
		String fine;
		String fineLowerCase;
		Scanner tastiera= new Scanner(System.in);
		do{
			System.out.println("Inserisci il volume del cilindro:");
			volumeCilindro= tastiera.nextDouble();
			System.out.println("Inserisci il raggio del cilindro:");
			raggioCilindro= tastiera.nextDouble();
			altezzaCilindro= volumeCilindro/(Math.PI*raggioCilindro*raggioCilindro);
			System.out.println("L' altezza del cilindro e': "+altezzaCilindro);
			prezzoCilindro= 2*Math.PI*raggioCilindro*(raggioCilindro+altezzaCilindro);
			System.out.println("Il prezzo del cilindro e': "+ prezzoCilindro);
			System.out.println("Vuoi calcolare il prezzo di altri contenitori? [si] o [no]");
			fine= tastiera.next();
			fineLowerCase=fine.toLowerCase();
		}while(fineLowerCase.equals("si"));
	}

}
