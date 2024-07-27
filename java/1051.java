import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
        public static void main(String[] args) throws IOException {
      
        Scanner entrada = new Scanner(System.in);
        double salario = entrada.nextDouble();
        double imposto;
        
        if(salario >= 0 && salario <= 2000) {
          System.out.println("Isento");
        }
        else if (salario > 2000.01 && salario <= 3000) {
          imposto = (salario - 2000) * 0.08;
          System.out.printf("R$ %.2f\n", imposto);
        }
        else if (salario > 3000.01 && salario <= 4500) {
          imposto = (salario - 3000) * 0.18 + (1000 * 0.08);
          System.out.printf("R$ %.2f\n", imposto);
        }
        else if (salario > 4500) {
          imposto = (salario - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
          System.out.printf("R$ %.2f\n", imposto);
        }
        
        entrada.close();
 
    }
 
}
