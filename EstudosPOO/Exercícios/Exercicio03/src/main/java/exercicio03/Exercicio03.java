
package exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Violao v1 = new Violao();
        
        v1.marca = "Rosini";
        v1.modelo = "Presenca Brasil";
        v1.tipo_corda = 'N';
        v1.status();
        if (v1.prontoParaTocar() == true){
            System.out.println("Pronto para Tocar!");
        } else {
            System.out.println("Existe algum problema no violão, conferir.");
        }
        
        Show s1 = new Show();
        
        s1.data = "20-05-2024";
        s1.hora = "20h";
        s1.duracao = "2h";
        s1.cache = 2500.00;
        s1.local = "Bar do Português";
        s1.status();
        s1.fazerShow();
        s1.receberCache(1500.00);
    }
}
