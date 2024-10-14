import java.util.Scanner;

public class ContarVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine().toLowerCase();
        int contadorVogais = 0;
        
        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVogais++;
            }
        }
        
        System.out.println("Número de vogais: " + contadorVogais);
        
        scanner.close();
    }
}
