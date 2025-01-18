public enum Pessoa {
    PESSOA_PADRAO(1),
    PESSOA_ESPECIAL(2),
    PESSOA_FISICA(3),
    PESSOA_JURIDICA(4);

    private final int VALOR;

    Pessoa(int valor) {
        this.VALOR = valor;
    }

    public int getVALOR() {
        return this.VALOR;
    }
}
