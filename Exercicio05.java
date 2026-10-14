import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 05
 */
public class Exercicio05 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final int QUANTIDADE_PRODUTOS = 5;
        final double PERCENTUAL_DESCONTO = 10.0;

        double[] precosOriginais = new double[QUANTIDADE_PRODUTOS];
        double[] precosComDesconto = new double[QUANTIDADE_PRODUTOS];

        System.out.println("=== Exercicio 05 - Desconto de 10% ===");
        for (int i = 0; i < precosOriginais.length; i++) {
            System.out.printf("Digite o preco do produto %d: ", i + 1);
            precosOriginais[i] = sc.nextDouble();
        }

        // Segundo array guarda os valores calculados
        for (int i = 0; i < precosOriginais.length; i++) {
            precosComDesconto[i] = precosOriginais[i] - (precosOriginais[i] * PERCENTUAL_DESCONTO / 100.0);
        }

        System.out.println();
        for (int i = 0; i < precosOriginais.length; i++) {
            System.out.printf("Produto %d -> Original: R$ %.2f | Com desconto: R$ %.2f%n",
                    i + 1, precosOriginais[i], precosComDesconto[i]);
        }

        sc.close();
    }
}
