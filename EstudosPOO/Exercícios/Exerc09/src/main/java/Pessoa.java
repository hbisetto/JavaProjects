public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa (String Nome, int Idade, char Sexo){
        this.nome = Nome;
        this.idade = Idade;
        this.sexo = Sexo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void fazerAniver(){
        setIdade(this.idade + 1);
    }
}
