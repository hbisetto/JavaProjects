
public class TADpseudoVetor {

	int p1;
	int p2;
	int p3;
	int p4;
	int p5;
	
	public TADpseudoVetor () {
		p1 = 0;
		p2 = 0;
		p3 = 0; 
		p4 = 0;
		p5 = 0;
	}
	
	public void insere(int pos, int valor) {
		switch(pos) {
			case 0:
				p1 = valor;
				break;
				
			case 1:
				p2 = valor;
				break;
				
			case 2:
				p3 = valor;
				break;
				
			case 3:
				p4 = valor;
				break;
				
			case 4:
				p5 = valor;
				break;
		}
	}
	
	public void print() {
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}
	
	
	
}
