import java.util.Scanner;

public class MediaGeometrica {

	public static void main(String[] args) {
		double prodottoNumero = 1;
		double numero;
		int numeriInseriti;
		Scanner tastiera= new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
		numeriInseriti= tastiera.nextInt();
		for(int i=1; i<=numeriInseriti;i++){
			System.out.println("Inserisci il "+i+" valore");
			numero= tastiera.nextDouble();
			if(numero>=0)
				prodottoNumero= prodottoNumero*numero;
			else{
				while(!(numero>=0)){
					System.out.println("Valore non valido, inserisci un valore positivo");
					numero= tastiera.nextDouble();
				}
			}
		}
		double mediaGeometrica=Math.pow(prodottoNumero, 1.0/numeriInseriti);
		System.out.println("La media geometrica e': "+ mediaGeometrica);
	}

}
