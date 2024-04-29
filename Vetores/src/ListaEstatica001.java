
public class ListaEstatica001 {
    
    int[] vetor;
    int tamanho;
    
    public ListaEstatica001(){
        vetor = new int[10];
        tamanho = 0;
    }
    
    public int tamanho(){
        return tamanho;
    }
    
    public void insereInicio(int valor){
        for (int i = tamanho; i > 0; i--){
            vetor[i] = vetor[i-1];
        }
        vetor[0] = valor;
        tamanho++;
    }
    
    public void insereMeio(int pos, int valor){
        for (int i = tamanho; i > pos; i--){
            vetor[i] = vetor[i-1];
        }
        vetor[pos] = valor;
        tamanho++;
    }
    
    public void insereFim(int valor){
        vetor[tamanho] = valor;
        tamanho++;
    } 
    
    public void insere(int pos, int valor){
        if (temEspaco()) {
            if (testaPos(pos)){
                if (pos == 0){
                    insereInicio(valor);
                } else if (pos == (tamanho)){
                    insereFim(valor);
                } else {
                    insereMeio(pos, valor);
                }
            }
        }
    }
    
    
     public void insere(int valor){
        if (temEspaco()) {
            if (tamanho == 0){
                insereInicio(valor);
            } else {
                insereFim(valor);
            }
        }
    }
    
    public boolean testaPos(int pos){
        return ((pos >= 0) && (pos < (tamanho)));
    }
    
    public boolean temEspaco(){
        return (tamanho < (vetor.length-1));
    }
    
    public void print(){
        System.out.println("-------------------");
        for (int i = 0; i < tamanho; i++){
            System.out.println(vetor[i]);
        }
    }
    
     public void printV(){
        for (int x : vetor){
            System.out.println(x);
        }
    }
    
}
