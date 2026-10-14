import java.util.Locale;
import java.util.Scanner;

/**
 * Lista 04 - Arrays - Exercicio 09
 */
public class Exercicio09 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.println("=== Exercicio 09 - Busca de produto ===");
        System.out.print("Digite o codigo do produto: ");
        int codigoBuscado = sc.nextInt();

        int indiceEncontrado = -1;

        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoBuscado) {
                indiceEncontrado = i;
                break;
            }
        }

        System.out.println();
        if (indiceEncontrado != -1) {
            System.out.printf("Codigo %d -> Preco: R$ %.2f%n",
                    codigos[indiceEncontrado], precos[indiceEncontrado]);
        } else {
            System.out.println("Produto nao encontrado para o codigo " + codigoBuscado + ".");
        }

        sc.close();
    }
}
