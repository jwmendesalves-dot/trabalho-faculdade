# Lista 04 — Arrays em Java

Resolução da lista de exercícios sobre **arrays** (vetores) em Java.
São 10 exercícios, cada um em seu próprio arquivo, todos compiláveis e testados.

## Conteúdos praticados

- Declaração de array com lista entre chaves `{}` e com `new`
- Acesso por índice e uso de `length`
- Percorrer arrays com `for` (clássico e `for-each`)
- Acumuladores (soma) e cálculo de média
- Busca de maior / menor valor
- Contagem condicional com `if` / `else if`
- Busca linear em array (valor encontrado / não encontrado)
- Dois arrays ligados pelo mesmo índice (código ↔ preço)
- Validação de entrada e encerramento antecipado (`return`)

## Arquivos

| Arquivo | Exercício | O que faz |
|---|---|---|
| `Exercicio01.java` | 1 | Array com `{}`, imprime quantidade, primeira e última nota |
| `Exercicio02.java` | 2 | Array com `new`, atribui por índice e imprime os 3 preços |
| `Exercicio03.java` | 3 | Lê 4 notas, calcula média e informa aprovado/reprovado |
| `Exercicio04.java` | 4 | Lê 5 preços, imprime todos e o total da compra |
| `Exercicio05.java` | 5 | Segundo array com 10% de desconto (original x com desconto) |
| `Exercicio06.java` | 6 | Juros simples: array de 12 meses com o valor devido |
| `Exercicio07.java` | 7 | 6 salários: maior, menor, média e quantos acima da média |
| `Exercicio08.java` | 8 | 10 notas: aprovados, recuperação e reprovados |
| `Exercicio09.java` | 9 | Busca produto por código (trata "não encontrado") |
| `Exercicio10.java` | 10 | Integrador: caixa de loja com subtotais, total e desconto |

## Como compilar e executar

Requisito: JDK 8 ou superior.

```bash
javac *.java          # compila todos
java Exercicio01      # executa o exercício desejado
```

Para compilar e rodar um só:

```bash
javac Exercicio07.java && java Exercicio07
```

## Observação sobre a leitura de valores

Os exercícios que leem números usam:

```java
Scanner sc = new Scanner(System.in).useLocale(Locale.US);
```

Isso é proposital. O `Scanner` sem essa configuração herda o locale do sistema,
e em português (`pt-BR`) o `nextDouble()` **exige vírgula** (`7,5`). Como o teclado
numérico digita ponto, isso causaria `InputMismatchException`. Lendo com
`Locale.US` o programa aceita `7.5` normalmente.

A **saída**, por outro lado, continua formatada em português (`R$ 12,90`), via:

```java
Locale.setDefault(new Locale("pt", "BR"));
System.out.printf("Produto 1: R$ %.2f%n", preco);
```

Ou seja: entrada com ponto, saída com vírgula.

## Exemplo de saída (Exercício 06)

Empréstimo de R$ 1000,00 a 2% ao mês:

```
Mes 1: R$ 1020,00
Mes 2: R$ 1040,00
Mes 3: R$ 1060,00
...
Mes 12: R$ 1240,00
```

## Exemplo de saída (Exercício 10)

Compra com 3 itens, total acima de R$ 200,00:

```
--- Subtotal por item ---
Item 1: 5 x R$ 10,00 = R$ 50,00
Item 2: 2 x R$ 45,00 = R$ 90,00
Item 3: 3 x R$ 30,00 = R$ 90,00

Total da compra: R$ 230,00
Desconto (5%): R$ 11,50
Valor final a pagar: R$ 218,50
```
