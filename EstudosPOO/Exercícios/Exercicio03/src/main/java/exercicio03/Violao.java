package exercicio03;

import java.util.Random;

public class Violao {
    String marca;
    String modelo;
    char tipo_corda;
    boolean afinacao;
    boolean todas_as_cordas;
    
    Random random = new Random();
    
    int numeroAleatorio1 = random.nextInt(100);
    int numeroAleatorio2 = random.nextInt(100);
    
    public Violao(){
        this.afinacao = numeroAleatorio1 % 2 == 0;
        this.todas_as_cordas = numeroAleatorio2 % 2 == 0;
    }
    
    void afinar(){
        if (afinacao == false){
            this.afinacao = true;
        } else{
            System.out.println("Violão já afinado");
        }
    }
    
    void trocarCorda(){
        if (todas_as_cordas == false){
            System.out.println("Trocando as cordas estouradas");
            this.todas_as_cordas = true;
        } else {
            System.out.println("Todas as cordas estão ok");
        }        
    }
    
    boolean prontoParaTocar(){
        if ((todas_as_cordas == true) && (afinacao == true)){
            return true;
        } else {
            return false;
        }
    }
    
    void status(){
        System.out.println(
                "Dados do violão: marca " + this.marca + ", "
                + "modelo : " + this.modelo + " , tipos de corda (" + 
                this.tipo_corda + ") . Afinado ? " + this.afinacao +
                ". Todas as cordas? " + this.todas_as_cordas + " ."
        );
    }
}
