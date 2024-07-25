import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
      public static void main(String[] args) throws IOException {
    
        Scanner entrada = new Scanner(System.in);
        
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        float nota4 = entrada.nextFloat();
        int peso1 = 1;
        int peso2 = 2;
        int peso3 = 3;
        int peso4 = 4;
        float media = ((nota1 * peso2) + (nota2 * peso3) + (nota3 * peso4) + (nota4 * peso1)) / 10;
        
        System.out.printf("Media: %.1f\n", media);
        
        if(media >= 7.0) {
          System.out.println("Aluno aprovado.");
        }
        else if(media >= 5.0 && media <= 6.9) {
          System.out.println("Aluno em exame.");
          
          double notaExame = entrada.nextDouble();
          System.out.printf("Nota do exame: %.1f\n", notaExame);
          
          double notaFinal = (notaExame + media) / 2;
          
          if(notaFinal >= 5.0) {
            System.out.println("Aluno aprovado.");
          }
          else {
            System.out.println("Aluno reprovado.");
          }
          
          System.out.printf("Media final: %.1f\n", notaFinal);
        }
        else {
          System.out.println("Aluno reprovado.");
        }
        
        entrada.close();
        
    }
}
