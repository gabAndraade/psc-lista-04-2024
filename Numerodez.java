import java.util.Scanner;
public class Numerodez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1;
        double n2;
        System.out.println("Digite 2 números inteiros de sua escolha: ");
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            while (n1 == n2){
                System.out.println("Os números não podem ser os mesmos. Tente novamente.");
                n1 = scanner.nextDouble();
                n2 = scanner.nextDouble();                
            }
            scanner.close();
            double maiorN = Math.max(n1,n2);
            double menorN = Math.min(n1,n2);
            System.out.println("Os número inteiros que estão no intervalo entre eles são: ");
            
            for (double numero = menorN + 1; numero < maiorN; numero++ ){
                System.out.println(numero);



            }
            
            
        
    }
    
}
