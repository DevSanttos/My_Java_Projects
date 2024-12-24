import java.util.ArrayList;

public class Vault {
    private final ArrayList<Sobrevivente> sobreviventes;
    private final ArrayList<Recurso> recursos;
    private final ArrayList<Missao> missoesRealizadas;
    private final ArrayList<Missao> missoesAndamento;

    public Vault() {
        sobreviventes = new ArrayList<Sobrevivente>();
        recursos = new ArrayList<Recurso>();
        missoesRealizadas = new ArrayList<Missao>();
        missoesAndamento = new ArrayList<Missao>();
    }

    public void addSobreviventes(Sobrevivente sobrevivente) {
        this.sobreviventes.add(sobrevivente);
    }

    public void addRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }

    public boolean addMissoesRealizadas(Missao missoesRealizadas) {
        if (missoesRealizadas.getStatus().equals("Sucesso")) {
            this.missoesRealizadas.add(missoesRealizadas);
            return true;
        } else return false;
    }

    public boolean addMissoesAndamento(Missao missaoAndamento) {
        if (missaoAndamento.getStatus().equals("Em andamento")) {
            this.missoesAndamento.add(missaoAndamento);
            return true;
        } else return false;
    }

    public void removeSobreviventes(Sobrevivente sobrevivente) {
        this.sobreviventes.remove(sobrevivente);
    }

    public void removeRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
    }

    public void removeMissoesRealizadas(Missao missoesRealizadas) {
        this.missoesRealizadas.remove(missoesRealizadas);
    }

    public void removeMissoesAndamento(Missao missaoAndamento) {
        this.missoesAndamento.remove(missaoAndamento);
    }

    public ArrayList<Sobrevivente> getSobreviventes() {
        return this.sobreviventes;
    }

    public ArrayList<Recurso> getRecursos() {
        return this.recursos;
    }

    public ArrayList<Missao> getMissoesRealizadas() {
        return this.missoesRealizadas;
    }

    public ArrayList<Missao> getMissoesAndamento() {
        return this.missoesAndamento;
    }
}
