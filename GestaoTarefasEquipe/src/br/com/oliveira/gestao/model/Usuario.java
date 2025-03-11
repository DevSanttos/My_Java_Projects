package br.com.oliveira.gestao.model;

public class Usuario {
    private String nome;
    private String email;
    private String funcao;

    public Usuario(String nome, String email, String funcao) {
        this.setNome(nome);
        this.setEmail(email);
        this.setFuncao(funcao);
    }

    public String getNome() {
        return this.nome;
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
            return true;
        } else return false;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean setEmail(String email) {
        if (!email.isBlank()) {
            this.email = email;
            return true;
        } else return false;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public boolean setFuncao(String funcao) {
        //verificar se a função está contida na lista de funções disponibilizada pela empresa
        this.funcao = funcao;
        return true;
    }
}
