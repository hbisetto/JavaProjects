package aula11;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    
    private void praticar(){
        System.out.println(this.nome + " é um Aluno Técnico e está praticando");
    }

        
}
