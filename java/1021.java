import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
    Scanner entrada = new Scanner(System.in);
    
    double valorMonetario = entrada.nextDouble();
    
    System.out.println("NOTAS:");
    
    System.out.printf("%d nota(s) de R$ 100.00\n", (int)valorMonetario/100);
    valorMonetario %= 100;
    
    System.out.printf("%d nota(s) de R$ 50.00\n", (int)valorMonetario/50);
    valorMonetario %= 50;
    
    System.out.printf("%d nota(s) de R$ 20.00\n", (int)valorMonetario/20);
    valorMonetario %= 20;
    
    System.out.printf("%d nota(s) de R$ 10.00\n", (int)valorMonetario/10);
    valorMonetario %= 10;
    
    System.out.printf("%d nota(s) de R$ 5.00\n", (int)valorMonetario/5);
    valorMonetario %= 5;
    
    System.out.printf("%d nota(s) de R$ 2.00\n", (int)valorMonetario/2);
    valorMonetario %= 2;
    
    System.out.println("MOEDAS:");
    valorMonetario *= 100;
    
    System.out.printf("%d moeda(s) de R$ 1.00\n", (int)valorMonetario/100);
    valorMonetario %= 100;
    
    System.out.printf("%d moeda(s) de R$ 0.50\n", (int)valorMonetario/50);
    valorMonetario %= 50;
    
    System.out.printf("%d moeda(s) de R$ 0.25\n", (int)valorMonetario/25);
    valorMonetario %= 25;
    
    System.out.printf("%d moeda(s) de R$ 0.10\n", (int)valorMonetario/10);
    valorMonetario %= 10;
    
    System.out.printf("%d moeda(s) de R$ 0.05\n", (int)valorMonetario/5);
    valorMonetario %= 5;
    
    System.out.printf("%d moeda(s) de R$ 0.01\n", (int)valorMonetario/1);
    
    entrada.close();
 
    }
 
}
