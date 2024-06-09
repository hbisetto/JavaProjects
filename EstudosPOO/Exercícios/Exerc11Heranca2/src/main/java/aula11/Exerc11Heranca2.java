package aula11;
public class Exerc11Heranca2 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        
        Aluno a1 = new Aluno();
        a1.setNome("Joao");
        a1.setMatricula(111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Josias");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        
        Tecnico t1 = new Tecnico();
        t1.setNome("Julles");
        t1.setCurso("TADS");
        t1.setMatricula(2222);
        t1.setRegistroProfissional("RP:12381/12");
        
        Professor p1 = new Professor();
        p1.setNome("Escaláfio");
        p1.setIdade(55);
        p1.setSalario(5000.00f);
        p1.setEspecialidade("Lógica de Programação");
   
    }
}
