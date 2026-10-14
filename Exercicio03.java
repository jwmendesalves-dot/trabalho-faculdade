import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 03
 */

public class Exercicio03 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final int QUANTIDADE_NOTAS = 4;
        double[] notas = new double[QUANTIDADE_NOTAS];
        double soma = 0.0;

        System.out.println("=== Exercicio 03 - Media das notas ===");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a %d%c nota: ", i + 1, 'a');
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.printf("Media: %.2f%n", media);
        if (media >= 6.0) {
            System.out.println("Situacao: APROVADO");
        } else {
            System.out.println("Situacao: REPROVADO");
        }

        sc.close();
    }
}
