import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Missao {
    static Scanner s = new Scanner(System.in);
    private String nome;
    private String objetivo;
    private String local;
    private String status;
    private ArrayList<String> sobreviventes = new ArrayList<String>();
    private ArrayList<Recurso> recursosColetados;
    private final Set<String> statusValidos = Set.of("Em andamento", "Sucesso", "Fracasso");
    private final Set<String> objetivosValidos = Set.of("Coletar suprimentos", "Resgatar sobreviventes", "Procurar informações");
    private final Map<String, String> statusMap = Map.of(
            "Em andamento", "Ainda não concluída",
            "Sucesso", "Concluída com êxito",
            "Fracasso", "Falhou por algum motivo, como falta de recursos ou mortes");

    public Missao(String nome, String objetivo, String identificadorSobrevivente,String local, String status) {
        this.setNome(nome);
        this.setObjetivo(objetivo);
        this.setLocal(local);
        this.setStatus(status);
        this.setSobreviventes(identificadorSobrevivente);
        recursosColetados = new ArrayList<Recurso>();
    }

    public boolean setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
            return true;
        } else return false;
    }

    public void setObjetivo(String objetivo) {
        while (true) {
            if (!objetivosValidos.contains(objetivo)) {
                System.out.println("Objetivo inválido! Selecinoe um dos objetivos a seguir para proseguir: " + getObjetivosValidos());
                objetivo = s.nextLine();
                continue;
            }
            this.objetivo = objetivo;
            break;
        }
    }

    public boolean setLocal(String local) {
        if (!local.isBlank()) {
            this.local = local;
            return true;
        } else return false;
    }

    public void setStatus(String status) {
        while (true) {
            if (!statusValidos.contains(status)) {
                System.out.println("Status inválido! Selecinoe um dos status a seguir para proseguir: " + getStatusValidos());
                status = s.nextLine();
                continue;
            }
            this.status = status;
            break;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getObjetivo() {
        return this.objetivo;
    }

    public String getLocal() {
        return this.local;
    }

    public String getStatus() {
        return this.status;
    }

    public Set<String> getObjetivosValidos() {
        return this.objetivosValidos;
    }

    public Set<String> getStatusValidos() {
        return this.statusValidos;
    }

    public void setSobreviventes(String identificadorSobrevivente) {
        if (Sobrevivente.getIdentificador().equals(identificadorSobrevivente)) {
            this.sobreviventes.add(identificadorSobrevivente);
        }
    }
    // tornei static o identificador de pessoa
    //Testar esses dois métodos
    public void removeSobreviventes(String identificadorSobrevivente) {
        if (Sobrevivente.getIdentificador().equals(identificadorSobrevivente)) {
            this.sobreviventes.remove(identificadorSobrevivente);
        }
    }

    public ArrayList<String> getSobreviventes() {
        return this.sobreviventes;
    }

    public ArrayList<Recurso> getRecursosColetados() {
        return this.recursosColetados;
    }
}
