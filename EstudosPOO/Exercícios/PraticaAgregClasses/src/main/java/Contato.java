
import java.util.Random;

public class Contato {
    private Gato parado;
    private Gato afrontoso;
    private boolean status;

    public Gato getParado() {
        return parado;
    }

    public void setParado(Gato parado) {
        this.parado = parado;
    }

    public Gato getAfrontoso() {
        return afrontoso;
    }

    public void setAfrontoso(Gato afrontoso) {
        this.afrontoso = afrontoso;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void resultado(Gato parado, Gato atentado){
        System.out.println("### Contato acontecendo ###");
        System.out.println(parado.getNome() + " está parado, quieto(a).");
        parado.cochilar();
        System.out.println(atentado.getNome() + " se aproxima...");
        
        Random aleatorio = new Random();
        int num = aleatorio.nextInt(3);
        switch(num){
            case 0:
                atentado.arranhar();
                parado.arranhar();
                System.out.println("Sara, venha aqui ver...");
                break;
            case 1:
                atentado.brincar();
                parado.miar();
                parado.cochilar();
                System.out.println("Sara, venha aqui ver...");
                break;
            case 2:
                atentado.miar();
                parado.cochilar();
                atentado.cochilar();
                System.out.println("Sara, venha aqui ver...");
                break;
        }
        
        
    }
    
}
