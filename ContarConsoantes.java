import java.util.Scanner;

public class ContarConsoantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine().toLowerCase();
        int contadorConsoantes = 0;
        
        for (char c : texto.toCharArray()) {
            if (c >= 'a' && c <= 'z' && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                contadorConsoantes++;
            }
        }
        
        System.out.println("Número de consoantes: " + contadorConsoantes);
        
        scanner.close();
    }
}
