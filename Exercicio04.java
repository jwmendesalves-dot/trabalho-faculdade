import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 04
 * Ler o preco de 5 produtos. Imprimir todos os precos lidos e, ao final,
 * o total da compra com duas casas.
 */
public class Exercicio04 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        // Scanner le com Locale.US para aceitar valores digitados com ponto (ex: 7.5)
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final int QUANTIDADE_PRODUTOS = 5;
        double[] precos = new double[QUANTIDADE_PRODUTOS];
        double total = 0.0;

        System.out.println("=== Exercicio 04 - Total da compra ===");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Digite o preco do produto %d: ", i + 1);
            precos[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("Precos lidos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, precos[i]);
            total += precos[i]; // acumulador
        }

        System.out.printf("%nTotal da compra: R$ %.2f%n", total);

        sc.close();
    }
}
