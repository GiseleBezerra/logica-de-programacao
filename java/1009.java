import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
    		String nome = entrada.next();
    		double salario = entrada.nextDouble();
    		double vendas = entrada.nextDouble();
    		vendas *= 0.15;
    		salario += vendas;
    		
    		System.out.printf("TOTAL = R$ %.2f\n", salario);
    		
    		entrada.close();
 
    }
}
