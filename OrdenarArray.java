import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 3, 1, 7, 6, 4};
        
        Arrays.sort(numeros);
        
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}
