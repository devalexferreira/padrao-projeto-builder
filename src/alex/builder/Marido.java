package alex.builder;

public class Marido {
    private  String nome;
    private int idade;
    private Esposa esposa;
    private boolean temFilhos;

    public Marido(ConstrutorMarido construtorMarido) {
        this.nome = construtorMarido.nome;
        this.idade = construtorMarido.idade;
        this.esposa = construtorMarido.esposa;
        this.temFilhos = construtorMarido.temFilhos;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Esposa getEsposa() {
        return esposa;
    }

    public boolean isTemFilhos() {
        return temFilhos;
    }
}
