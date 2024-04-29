
public class Main {

	public static void main(String[] args) {
		
		/*
		int[] vetor = new int[10]; // ou int vetor[]
		
		vetor[4] = 50;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(i + " - " + vetor [i]);
			
			
		}
		
		*/
		
		TADpseudoVetor v1 = new TADpseudoVetor();
		v1.insere(1, 25);
		v1.print();
		
		System.out.println("---------");
		
		TADVetor v2 = new TADVetor();
		v2.insere(1, 25);
		v2.print();
		
	}

}
