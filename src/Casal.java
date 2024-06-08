import alex.builder.ConstrutorMarido;
import alex.builder.Esposa;
import alex.builder.Marido;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Casal {
    public static void main(String[] args) {
        Esposa esposa = new Esposa("Maria", 32);
        Marido marido = new ConstrutorMarido("Jose", 35, esposa).setTemFilhos(true).build();
        System.out.println("marido "+marido.getNome());
        System.out.println("idade "+marido.getIdade());
        System.out.println("esposa "+marido.getEsposa().getNome());
        System.out.println("idade "+marido.getEsposa().getIdade());
        System.out.println("filhos "+marido.isTemFilhos());
    }
}