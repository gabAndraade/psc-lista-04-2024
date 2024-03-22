import java.util.Scanner;
public class Numerosete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1,n2,n3,n4,n5;       
        System.out.println("Digite 5 números de sua escolha: ");
            n1 = scanner.nextDouble();
            n2 = scanner.nextDouble();
            n3 = scanner.nextDouble();
            n4 = scanner.nextDouble();
            n5 = scanner.nextDouble();
            scanner.close();
        double maiorN = Math.max(n1,Math.max(n2,Math.max(n3,Math.max(n4,n5))));
        System.out.println("O maior número é: "+ maiorN);
        
    }
}
