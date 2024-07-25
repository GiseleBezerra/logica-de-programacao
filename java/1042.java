import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner entrada = new Scanner(System.in);
		
        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        int valor3 = entrada.nextInt();
        int[] valores = {valor1, valor2, valor3};
        int [] valores_ordenados = Arrays.copyOf(valores, valores.length);
        Arrays.sort(valores_ordenados);
        
        for(int i = 0; i < valores_ordenados.length; i++) {
          System.out.println(valores_ordenados[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < valores.length; i++) {
          System.out.println(valores[i]);
        }
        
        entrada.close();
    }
 
}
