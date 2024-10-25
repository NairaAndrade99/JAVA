import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner (System.in);
       
        //Entrada
        System.out.println(" Informe os valores para ser calculados: ");
    
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //Processamento 

        int soma = num1 + num2;
        
        //saída 
        System.out.printf("Resultado %d", soma);

    }
}
