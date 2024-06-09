
public class PraticaAgregClasses {

    public static void main(String[] args) {
        Gato fuba = new Gato();
        fuba.setNome("Fubá");
        fuba.setCor("Metade laranja, metade branco");
        fuba.setPeso(5.0f);
        
        Gato preciosa = new Gato();
        preciosa.setNome("Preciosa");
        preciosa.setCor("Preta Lemure");
        preciosa.setPeso(12.0f);
        
        fuba.status();
        preciosa.status();
        
        Contato cont1 = new Contato();
        cont1.resultado(fuba, preciosa);
    }
}
