import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
        public static void main(String[] args) throws IOException {
      
        Scanner entrada = new Scanner(System.in);
        
        int inicioJogo = entrada.nextInt();
        int fimJogo = entrada.nextInt();
        int tempo;
        
        if(inicioJogo < fimJogo) {
          tempo = fimJogo - inicioJogo;
        }
        else {
          tempo = 24 - inicioJogo + fimJogo;
        }
        
        System.out.printf("O JOGO DUROU %d HORA(S)\n", tempo);
        
        entrada.close();
 
    }
}
