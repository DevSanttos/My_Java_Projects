package br.com.oliveira.gestao.model;

public enum ListaFuncoes {
    GERENTE(0),
    ENGENHEIRO_DE_SOFTWARE(10),
    PROGRAMADOR(15);

    private final int TAREFAS_SEMANAIS;

    ListaFuncoes(int tarefasSemanais) {
        TAREFAS_SEMANAIS = tarefasSemanais;
    }

    public int getTAREFAS_SEMANAIS() {
        return this.TAREFAS_SEMANAIS;
    }
}
