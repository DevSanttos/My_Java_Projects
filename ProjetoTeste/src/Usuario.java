public class Usuario {
    private String nome;
    private String dataNascimento;
    private String habilidade;
    private Pessoa pessoa;

    public Usuario(String nome, String dataNascimento, String habilidade, Pessoa pessoa) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.habilidade = habilidade;
        this.pessoa = pessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getHabilidade() {
        return habilidade;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", habilidade='" + habilidade + '\'' +
                ", pessoa=" + pessoa +
                '}';
    }
}
