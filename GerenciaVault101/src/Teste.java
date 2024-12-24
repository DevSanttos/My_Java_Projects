import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        Sobrevivente sobrevivente1 = new Sobrevivente("Jonathan", 20, "Ativo");
        Recurso recurso1 = new Recurso("Água", 100);
        Recurso recurso2 = new Recurso("Comida", 47);
        Missao missao1 = new Missao("Caçada ao João", "Coletar suprimentos", "Oliveira", "Em andamento");
        Missao missao2 = new Missao("Caçada ao Kauã", "Resgatar sobreviventes", "Ibirama", "Sucesso");
        Vault vault1 = new Vault();
        vault1.addMissoesRealizadas(missao2);
        vault1.addMissoesAndamento(missao1);
        System.out.println("Missões realizadas: " + vault1.getMissoesRealizadas() + "\n");
        System.out.println("Missões em andamento: " + vault1.getMissoesAndamento() + "\n");
        vault1.addRecurso(recurso1);
        vault1.addRecurso(recurso2);
        System.out.println("Lista recursos: " + vault1.getRecursos() + "\n");
        vault1.addSobreviventes(sobrevivente1);
        System.out.println("Lista Sobreviventes: " + vault1.getSobreviventes() + "\n");



        System.out.println(sobrevivente1.toString());
    }
}
