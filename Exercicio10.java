import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 10 (Integrador)
 */
public class Exercicio10 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final double LIMITE_DESCONTO = 200.00;
        final double PERCENTUAL_DESCONTO = 5.0;

        System.out.println("=== Exercicio 10 - Caixa de loja ===");
        System.out.print("Digite a quantidade de itens da compra: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Quantidade invalida! A compra deve ter pelo menos 1 item.");
            sc.close();
            return;
        }

        double[] precosUnitarios = new double[n];
        int[] quantidades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%nItem %d:%n", i + 1);
            System.out.print("  Preco unitario: R$ ");
            precosUnitarios[i] = sc.nextDouble();

            System.out.print("  Quantidade: ");
            quantidades[i] = sc.nextInt();
        }

        double total = 0.0;

        System.out.println();
        System.out.println("--- Subtotal por item ---");
        for (int i = 0; i < n; i++) {
            double subtotal = precosUnitarios[i] * quantidades[i];
            total += subtotal;
            System.out.printf("Item %d: %d x R$ %.2f = R$ %.2f%n",
                    i + 1, quantidades[i], precosUnitarios[i], subtotal);
        }

        double desconto = 0.0;
        if (total > LIMITE_DESCONTO) {
            desconto = total * PERCENTUAL_DESCONTO / 100.0;
        }

        double valorFinal = total - desconto;

        System.out.println();
        System.out.printf("Total da compra: R$ %.2f%n", total);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n", PERCENTUAL_DESCONTO, desconto);
        System.out.printf("Valor final a pagar: R$ %.2f%n", valorFinal);

        sc.close();
    }
}
