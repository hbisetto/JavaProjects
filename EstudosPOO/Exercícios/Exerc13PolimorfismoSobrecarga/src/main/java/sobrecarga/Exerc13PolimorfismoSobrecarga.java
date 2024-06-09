package sobrecarga;

public class Exerc13PolimorfismoSobrecarga {

    public static void main(String[] args) {
        
        Mamifero x = new Mamifero();
        Lobo l = new Lobo();
        Cachorro c = new Cachorro();
        
        x.emitirSom();  // Ex. de sobreposição
        l.emitirSom();  // Ex. de sobreposição
        c.emitirSom();  // Ex. de sobreposição
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
