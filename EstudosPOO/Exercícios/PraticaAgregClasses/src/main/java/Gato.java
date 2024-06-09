
import java.util.Random;

public class Gato {
    private String nome;
    private String cor;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void status(){
        System.out.println("#######################");
        System.out.println("Nome: " + this.nome);
        System.out.println("Cor: " + this.cor);
        System.out.println("Peso: " + this.peso);
        System.out.println("");
    }
    
    public void comer(){
        System.out.println(this.nome + " está comendo (pra variar...)");
    }
    
    public void miar(){
        Random aleat = new Random();
        int num = aleat.nextInt(3);
        
        switch(num){
            case 0:
                System.out.println(this.nome + ": ...Miau...");
                break;
            case 1:
                System.out.println(this.nome +" : Miiiiiiaaaaauuuuuu!");
                break;
            case 2:
                System.out.println(this.nome + " : Miau(baixinho)...");
                break;
        }
    }
    
    public void brincar(){
        System.out.println(this.nome + " está brincando");
    }
    
    public void arranhar(){
        System.out.println(this.nome + " está arranhando");
    }
    
    public void cochilar(){
        System.out.println(this.nome + ": zzzzzzzzZZZZZZZZZZzzzzzzz...");
    }
}
