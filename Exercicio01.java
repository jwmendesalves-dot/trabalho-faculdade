import java.util.Locale;

/**
 * Lista 04 - Arrays - Exercicio 01
 * As notas de um aluno sao {7.5, 6.0, 8.0, 5.5}.
 * Criar o array com lista entre chaves e imprimir a quantidade de notas,
 * a primeira nota e a ultima nota (ultimo indice obtido por meio de length).
 */
public class Exercicio01 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        // Criacao do array com lista entre chaves
        double[] notas = {7.5, 6.0, 8.0, 5.5};

        int quantidade = notas.length;
        int ultimoIndice = notas.length - 1;

        System.out.println("=== Exercicio 01 - Declaracao e acesso ===");
        System.out.println("Quantidade de notas: " + quantidade);
        System.out.printf(new Locale("pt", "BR"), "Primeira nota: %.1f%n", notas[0]);
        System.out.printf("Ultima nota: %.1f%n", notas[ultimoIndice]);
    }
}
