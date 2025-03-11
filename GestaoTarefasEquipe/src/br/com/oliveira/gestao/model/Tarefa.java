package br.com.oliveira.gestao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

public class Tarefa {
    private String titulo;
    private String descricao;
    private Date prazo;
    private String status;
    private final Set<String> statusValidos = Set.of("pendente", "em andamento", "concluído");

    public Tarefa(String titulo, String descricao, Date prazo, String status) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setPrazo(prazo);
        this.status = "pendente";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<String> getStatusValidos() {
        return statusValidos;
    }
}
