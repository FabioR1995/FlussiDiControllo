import java.util.Scanner;

public class LancioMoneta {

	public static void main(String[] args) {
		char testaCroce;
		int contaTesta = 0;
		int contaCroce = 0;
		int lanciNonValidi=0;
		int numeroLanci=8;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Inserisci [t] per testa o [c] per croce");
		for(int i=1;i<=numeroLanci;i++) {
			System.out.println(i+" Lancio:");
			testaCroce= tastiera.nextLine().charAt(0);
			if(testaCroce=='t')
				contaTesta++;
			else if(testaCroce=='c')
				contaCroce++;
			else {
				System.out.println("Valore non valido");
				lanciNonValidi++;
			}
		}
		double percentualeTesta =(contaTesta*100)/numeroLanci;
		double percentualeCroce =(contaCroce*100)/numeroLanci;
		System.out.println("Numero di teste: "+contaTesta);
		System.out.println("Numero di croci: "+contaCroce);
		System.out.println("Numero di lanci non validi"+ lanciNonValidi);
		System.out.println("Percentuale di teste: "+ percentualeTesta+"%");
		System.out.println("Percentuali di croci: "+ percentualeCroce+"%");
	}

}
