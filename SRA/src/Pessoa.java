import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    //private Enum<hobby, genero, formacao>;
    private String time;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
