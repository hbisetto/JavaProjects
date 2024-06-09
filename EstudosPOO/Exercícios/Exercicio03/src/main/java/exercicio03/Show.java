package exercicio03;

public class Show {
    String data;
    String hora;
    String duracao;
    String local;
    Double cache;
    
    void fazerShow(){
        System.out.println("Começando o show!");
    }
    
    void cancelarShow(){
        System.out.println("Show cancelado");
    }
    
    void receberCache(Double cache){
        System.out.println("Cachê combinado " + this.cache);
        System.out.println("Cachê recebido " + cache);
    }
    
    void status(){
        System.out.println(
                "Data do show: " + this.data + ", hora marcada: " 
                + this.hora + ", duracao: " + this.duracao +
                ", local: " + this.local + ", cachê combinado: " +
                this.cache
        );
    }
}
