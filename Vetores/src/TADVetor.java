
public class TADVetor {

	int vetor[];
	
	public TADVetor() {
		
		vetor = new int[5];
	
	}
	
	public void insere(int pos, int valor) {
		
		vetor[pos] = valor;
	
	}
	
	public void print() {
		for (int x: vetor) {
			System.out.println(x);
		}
	}
}
