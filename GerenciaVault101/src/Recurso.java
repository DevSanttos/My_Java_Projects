import java.util.*;

public class Recurso {
    static Scanner s = new Scanner(System.in);
    private final String identificador;
    private String nome;
    private int quantidade;
    private final Set<String> nomeValidos = Set.of("Água", "Comida", "Munição", "Remédio", "Partes Mecânicas");
    private final Map<String, String> nomeMap = Map.of(
            "Água", "Fundamental para hidratação",
            "Comida", "Necessária para manter os sobreviventes ativos",
            "Munição", "Usada para armas de defesa e combate",
            "Remédio", "Usados para curar doenças e ferimentos",
            "Partes Mecânicas", "Usadas para construir ou consertar itens no Vault");

    public Recurso(String nome, int quantidade) {
        this.identificador = UUID.randomUUID().toString();
        this.setNome(nome); 
        this.setQuantidade(quantidade);
    }

    public String retornaDescricaoRecurso(String nome) {
        String texto = "";
        while (true) {
            if (!nomeValidos.contains(nome)) {
                System.out.println("Recurso Inválida! Selecione uma dos recursos a seguir: " + nomeValidos);
                nome = s.next();
                continue;
            }
            texto += "Descrição da habilidade selecionada: " + nomeMap.get(nome) + "\n";
            break;
        }
        return texto;
    }

    public void setNome(String nome) {
        while (true) {
            if (!nomeValidos.contains(nome)) {
                System.out.println("Habilidade Inválida! Selecione uma das habilidades a seguir: " + nomeValidos);
                nome = s.next();
                continue;
            }
            this.nome = nome;
            break;
        }
    }

    public boolean setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
            return true;
        } else return false;
    }

    public String getNome() {
        return this.nome;
    }

    public Set<String> getNomeDispniveis() {
        return this.nomeValidos;
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString() {
        return "Identificador do recurso: " + getIdentificador() + "\n" +
                "Nome do recurso: " + getNome() + "\n" +
                "Quantidade de recurso: " + getQuantidade() + "\n" +
                retornaDescricaoRecurso(nome);
    }
}