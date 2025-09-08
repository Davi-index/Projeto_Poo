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