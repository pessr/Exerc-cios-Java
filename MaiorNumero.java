import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        
        System.out.println("Digite cinco números (separando por espaço):");

        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número é: " + maior);
        
        scanner.close();
    }
}
