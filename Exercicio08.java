import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 08
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final int QUANTIDADE_ALUNOS = 10;
        double[] notas = new double[QUANTIDADE_ALUNOS];

        System.out.println("=== Exercicio 08 - Situacao da turma ===");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6.0) {
                aprovados++;
            } else if (notas[i] >= 4.0) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println();
        System.out.println("Aprovados (nota >= 6): " + aprovados);
        System.out.println("Em recuperacao (4 <= nota < 6): " + recuperacao);
        System.out.println("Reprovados (nota < 4): " + reprovados);

        sc.close();
    }
}
