import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);

    		int codigoPeca1 = entrada.nextInt();
    		int quantidadePeca1 = entrada.nextInt();
    		double valorUnitarioPeca1 = entrada.nextDouble();
    		double valorTotalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
    		
    		int codigoPeca2 = entrada.nextInt();
    		int quantidadePeca2 = entrada.nextInt();
    		double valorUnitarioPeca2 = entrada.nextDouble();
    		double valorTotalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
    		
    		double totalPagar = valorTotalPeca1 + valorTotalPeca2;
    		
    		
    		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPagar);
    		
    		entrada.close();
        
    }
}
