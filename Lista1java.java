package lista;
import java.util.Scanner;

public class Lista1java {

    public static void questao2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade mínima: ");
        double quantidadeMinima = scanner.nextDouble();

        System.out.print("Digite a quantidade máxima: ");
        double quantidadeMaxima = scanner.nextDouble();

        double estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;

        System.out.println("O estoque médio da peça é: " + estoqueMedio);

        scanner.close();
    }

    public static void questao1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: " + valorReal);

        scanner.close();
    }

    public static void main(String[] args) {
        questao2();
        // Para testar questao1, descomente a linha abaixo:
        // questao1()
    }
}

// questão 3
public static void questao3() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Identificação do vendedor: ");
    String identificacaoVendedor = scanner.nextLine();

    System.out.print("Código da peça: ");
    String codigoPeca = scanner.nextLine();

    System.out.print("Preço unitário da peça: ");
    double precoUnitario = scanner.nextDouble();

    System.out.print("Quantidade vendida: ");
    int quantidadeVendida = scanner.nextInt();

    double totalVenda = precoUnitario * quantidadeVendida;
    double comissao = totalVenda * 0.05;

    System.out.println("Vendedor: " + identificacaoVendedor);
    System.out.println("Código da peça: " + codigoPeca);
    System.out.println("Total da venda: R$ " + totalVenda);
    System.out.println("Comissão: R$ " + comissao);

    scanner.close();
}

public static class questao4 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int C = scanner.nextInt();
        System.out.print("Digite o valor de D: ");
        int D = scanner.nextInt();

        System.out.println("Adições:");
        System.out.println("A + B = " + (A + B));
        System.out.println("A + C = " + (A + C));
        System.out.println("A + D = " + (A + D));
        System.out.println("B + C = " + (B + C));
        System.out.println("B + D = " + (B + D));
        System.out.println("C + D = " + (C + D));

        System.out.println("Multiplicações:");
        System.out.println("A * B = " + (A * B));
        System.out.println("A * C = " + (A * C));
        System.out.println("A * D = " + (A * D));
        System.out.println("B * C = " + (B * C));
        System.out.println("B * D = " + (B * D));
        System.out.println("C * D = " + (C * D));

        scanner.close();
    }
}

public static class questao5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempo * velocidadeMedia;
        double litrosUsados = distancia / 12.0;

        System.out.println("Velocidade média: " + velocidadeMedia + " km/h");
        System.out.println("Tempo gasto: " + tempo + " horas");
        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros utilizados: " + litrosUsados);

        scanner.close();
    }
}

public static class questao6 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (9 * celsius + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        scanner.close();
    }
}

public static class questao7 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + celsius);

        scanner.close();
    }
}

public static class questao8 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da lata de óleo: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        double altura = scanner.nextDouble();

        double volume = 3.14159 * raio * raio * altura;

        System.out.println("O volume da lata de óleo é: " + volume);

        scanner.close();
    }
}

public static class questao9 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();

        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = anos * 365 + meses * 30 + dias;

        System.out.println("A idade expressa apenas em dias é: " + idadeEmDias);

        scanner.close();
    }
}

public static class questao10 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Igual");
        } else {
            System.out.println("Não igual");
        }

        if (num1 > num2) {
            System.out.println("Maior");
        }

        if (num1 < num2) {
            System.out.println("Menor");
        }

        if (num1 >= num2) {
            System.out.println("Maior ou igual");
        }

        if (num1 <= num2) {
            System.out.println("Menor ou igual");
        }

        scanner.close();
    }
}
// Nível 2: Estruturas Condicionais
// questão 1
public static class questao01 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        System.out.println("Valores antes da troca:");
        System.out.println("A = " + A + ", B = " + B);

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Valores depois da troca:");
        System.out.println("A = " + A + ", B = " + B);

        scanner.close();
    }
}
// questão 2
public static class questao02 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();

        int modulo;
        if (x >= 0) {
            modulo = x;
        } else {
            modulo = x * -1;
        }

        System.out.println("O módulo do número é: " + modulo);

        scanner.close();
    }
}

// questão 3
public static class questao03 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordena em ordem crescente
        java.util.Arrays.sort(numeros);

        System.out.print("Ordem crescente: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        System.out.print("Ordem decrescente: ");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}
// questão 4
public static class questao04 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        int diferenca = maior - menor;

        System.out.println("A diferença do maior para o menor é: " + diferenca);

        scanner.close();
    }
}
// questão 5
public static class questao05 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a " + i + "ª nota: ");
            somaNotas += scanner.nextDouble();
        }

        double media = somaNotas / 4;

        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else {
            System.out.print("Média menor que 7. Digite a nota da recuperação: ");
            double notaRecuperacao = scanner.nextDouble();
            double novaMedia = (media + notaRecuperacao) / 2;

            if (novaMedia >= 7) {
                System.out.println("Aluno aprovado na recuperação! Média final: " + novaMedia);
            } else {
                System.out.println("Aluno reprovado. Média final: " + novaMedia);
            }
        }

        scanner.close();
    }
}
// questão 6
public static class questao06 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.println("Os dois números são iguais: " + num1);
        } else {
            double maior = Math.max(num1, num2);
            double menor = Math.min(num1, num2);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        }

        scanner.close();
    }
}
//questão 7
public static class questao07 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        try {
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 9) {
                System.out.println("valor válido");
            } else {
                System.out.println("valor inválido");
            }
        } catch (Exception e) {
            System.out.println("erro");
        }

        scanner.close();
    }
}
// questão 8
public static class questao08 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro (código): ");
        int codigo = scanner.nextInt();

        switch (codigo) {
            case 1:
                System.out.println("um");
                break;
            case 2:
                System.out.println("dois");
                break;
            case 3:
                System.out.println("três");
                break;
            default:
                System.out.println("Código inválido");
        }

        scanner.close();
    }
}
//questão 9
public static class questao09 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double B = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double C = scanner.nextDouble();

        if (A < B + C && B < A + C && C < A + B) {
            if (A == B && B == C) {
                System.out.println("Triângulo equilátero");
            } else if (A == B || A == C || B == C) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }

        scanner.close();
    }
}
// questão 10
public static class questao010 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        // Lê valor de a
        do {
            System.out.print("Digite o valor de a (maior que zero): ");
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (a <= 0);

        // Lê valor de b
        do {
            System.out.print("Digite o valor de b (maior que zero): ");
            b = scanner.nextInt();
            if (b <= 0) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (b <= 0);

        // Lê valor de c
        do {
            System.out.print("Digite o valor de c (maior que zero): ");
            c = scanner.nextInt();
            if (c <= 0) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (c <= 0);

        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));

        System.out.println("Menor valor multiplicado pelo maior: " + (menor * maior));
        System.out.println("Maior valor dividido pelo menor: " + ((double)maior / menor));

        scanner.close();
    }
}
//qustão 11
public static class questao11 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");
        }

        scanner.close();
    }
}
//questao 12
public static class questao12 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        Integer A = null;
        Integer B = null;

        if (numero >= 0) {
            A = numero;
        } else {
            B = numero;
        }

        System.out.println("A: " + (A != null ? A : "null") + ", B: " + (B != null ? B : "null"));

        scanner.close();
    }
}
