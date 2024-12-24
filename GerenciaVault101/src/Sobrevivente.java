import java.util.*;

public class Sobrevivente extends Pessoa {
    static Scanner s = new Scanner(System.in);
    private String status;
    private final int quantMaxHabilidades = 3;
    private final String[] armazenaHabilidades = new String[quantMaxHabilidades];
    private final Set<String> habilidadesSelecionadas = new HashSet<>();
    private final Set<String> habilidadesValidas = Set.of("Engenharia", "Medicina", "Combate", "Exploração", "Culinária", "Diplomacia", "Hackeamento", "Furtividade");
    private final Set<String> statusValidos = Set.of("Ativo", "Doente", "Ferido", "Mortos");
    private final Map<String, String> habilidadesMap = Map.of(
            "Engenharia", "habilidade de construir e reparar máquinas",
            "Medicina", "habilidade de tratar ferimentos e doenças",
            "Combate", "habilidade de lutar com armas ou corpo a corpo",
            "Exploração", "habilidade de navegar e mapear áreas desconhecidas",
            "Culinária", "habilidade de preparar comida com recursos escassos",
            "Diplomacia", "habilidade de negociar com outros grupos",
            "Hackeamento", "habilidade de invadir sistemas de segurança",
            "Furtividade", "habilidade de evitar detecção durante missões");

    public Sobrevivente(String nome, int idade, String status) {
        super(nome, idade);
        this.setStatus(status);
    }

    public Set<String> getHabilidadesDisponiveis() {
        return habilidadesValidas;
    }

    public String[] setHabilidades() {
        for (int i = 0; i < quantMaxHabilidades; i++) {
            while (true) {
                System.out.println("Informe a " + (i + 1) + "º habilidade");
                String habilidade = s.next();

                if (!habilidadesValidas.contains(habilidade)) {
                    System.out.println("Habilidade Inválida! Selecione uma das habilidades a seguir: " + getHabilidadesDisponiveis());
                    continue;
                }
                if (!habilidadesSelecionadas.add(habilidade)) {
                    System.out.println("Habilidade já selecionada! Selecione novamente!");
                    continue;
                }
                armazenaHabilidades[i] = habilidade;
                break;
            }
        }
        return armazenaHabilidades;
    }

    public String getHabilidadesSelecionadas() {
        return Arrays.toString(this.armazenaHabilidades);
    }

    public void retornaDescricaoHabilidade(String habilidade) {
        while (true) {
            if (!habilidadesValidas.contains(habilidade)) {
                System.out.println("Habilidade inválida! Selecione uma das habilidades a seguir: " + getHabilidadesDisponiveis());
                habilidade = s.next();
                continue;
            }
            System.out.println("Descrição da habilidade selecionada: " + habilidadesMap.get(habilidade));
            break;
        }
    }

    public void setStatus(String status) {
        while (true) {
            if (!statusValidos.contains(status)) {
                System.out.println("Status inválido! Selecinoe um dos status a seguir: " + getStatusValidos());
                ;
                status = s.next();
                continue;
            }
            this.status = status;
            break;
        }
    }

    public String getStatus() {
        return this.status;
    }

    public Set<String> getStatusValidos() {
        return this.statusValidos;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Status: " + getStatus() + "\n" +
                "Habilidades selecionadas: " + getHabilidadesSelecionadas();

    }
}
