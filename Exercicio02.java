import java.util.Locale;

/**
 * Lista 04 - Arrays - Exercicio 02
 */
public class Exercicio02 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        // Criacao do array com new
        double[] precos = new double[3];

        // Atribuicao por indice
        precos[0] = 12.90;
        precos[1] = 5.50;
        precos[2] = 30.00;

        System.out.println("Exercicio 02 - Array com new");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }
    }
}
