import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = scanner.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a + " " + b);
        
        for (int i = 2; i < n; i++) {
            int proximo = a + b;
            System.out.print(" " + proximo);
            a = b;
            b = proximo;
        }
        
        System.out.println();
        scanner.close();
    }
}
