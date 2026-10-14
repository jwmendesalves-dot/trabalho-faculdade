import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 06
 */
public class Exercicio06 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final int QUANTIDADE_MESES = 12;

        System.out.println("=== Exercicio 06 - Juros simples (12 meses) ===");
        System.out.print("Digite o valor do emprestimo: R$ ");
        double valor = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        double taxa = sc.nextDouble();

        double[] valoresDevidos = new double[QUANTIDADE_MESES];

        for (int mes = 1; mes <= valoresDevidos.length; mes++) {
            valoresDevidos[mes - 1] = valor + valor * taxa / 100.0 * mes;
        }

        System.out.println();
        for (int i = 0; i < valoresDevidos.length; i++) {
            System.out.printf("Mes %d: R$ %.2f%n", i + 1, valoresDevidos[i]);
        }

        sc.close();
    }
}
