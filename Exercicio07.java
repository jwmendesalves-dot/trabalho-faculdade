import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 07
 * Ler o salario de 6 funcionarios. Imprimir o maior salario, o menor
 * salario, a media com duas casas e quantos funcionarios ganham acima da media.
 */
public class Exercicio07 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        // Scanner le com Locale.US para aceitar valores digitados com ponto (ex: 7.5)
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        final int QUANTIDADE_FUNCIONARIOS = 6;
        double[] salarios = new double[QUANTIDADE_FUNCIONARIOS];
        double soma = 0.0;

        System.out.println("=== Exercicio 07 - Maior, menor e contagem ===");
        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("Digite o salario do funcionario %d: R$ ", i + 1);
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
        }

        double media = soma / salarios.length;

        // Inicializa maior e menor com o primeiro elemento
        double maior = salarios[0];
        double menor = salarios[0];

        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        int acimaDaMedia = 0;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println();
        System.out.printf("Maior salario: R$ %.2f%n", maior);
        System.out.printf("Menor salario: R$ %.2f%n", menor);
        System.out.printf("Media salarial: R$ %.2f%n", media);
        System.out.println("Funcionarios acima da media: " + acimaDaMedia);

        sc.close();
    }
}
