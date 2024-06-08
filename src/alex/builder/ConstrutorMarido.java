package alex.builder;

public class ConstrutorMarido {
    protected  static  String nome;
    protected static int idade;
    protected static Esposa esposa;
    protected static boolean temFilhos;
    public ConstrutorMarido(String nome, int idade, Esposa esposa) {
        this.nome = nome;
        this.idade = idade;
        this.esposa = esposa;
    }

    public ConstrutorMarido setTemFilhos(boolean temFilhos) {
        this.temFilhos = temFilhos;
        return this;
    }

    public Marido build() {
        return new Marido(this);
    }

}
