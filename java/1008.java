import java.io.IOException;
import java.util.Scanner; 

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner entrada = new Scanner(System.in);
    		int numeroFuncionario = entrada.nextInt();
    		int horasTrabalhadas = entrada.nextInt();
    		double valorHora = entrada.nextDouble();
    		double salario = horasTrabalhadas * valorHora;
    		
    		System.out.printf("NUMBER = %d\n", numeroFuncionario);
    		System.out.printf("SALARY = U$ %.2f\n", salario);
    		
    		entrada.close();
 
    }
}
