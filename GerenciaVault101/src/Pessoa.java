import java.util.UUID;

public class Pessoa {
    protected static String identificador = "";
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.identificador = UUID.randomUUID().toString();
        this.nome = nome;
        this.idade = idade;
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
            return true;
        } else return false;
    }

    public boolean setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
            return true;
        } else return false;
    }

    public int getIdade() {
        return this.idade;
    }

    public String getNome() {
        return this.nome;
    }

    public static String getIdentificador() {
        return identificador;
    }

    @Override
    public String toString() {
        return "identificador: " + getIdentificador() + "\n" +
                "nome: " + getNome() + "\n" +
                "idade: " + getIdade();
    }
}
