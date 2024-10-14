import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à calculadora simples!");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1: Adição (+)");
        System.out.println("2: Subtração (-)");
        System.out.println("3: Multiplicação (*)");
        System.out.println("4: Divisão (/)");

        int escolha = scanner.nextInt();
        double resultado;

        switch (escolha) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("Resultado: %.2f + %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("Resultado: %.2f - %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("Resultado: %.2f * %.2f = %.2f%n", num1, num2, resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.printf("Resultado: %.2f / %.2f = %.2f%n", num1, num2, resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }

        scanner.close();
    }
}
