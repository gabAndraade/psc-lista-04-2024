import java.util.Scanner;

public class Numerocinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paisA;
        int paisB;
        double taxaA;
        double taxaB;
        String res;

        do{
        System.out.println("Informe a população e a taxa de crescimento inicial do país A.");
        paisA = scanner.nextInt();
        taxaA = scanner.nextDouble()/100;
        System.out.println("Informe a população e a taxa de crescimento inicial do país B.");
        paisB = scanner.nextInt();
        taxaB = scanner.nextDouble()/100;
        scanner.nextLine();

        int anos = 0;
        while(paisA <= paisB){
        paisA += paisA * taxaA;
        paisB += paisB * taxaB;
        anos++;       
        }
        System.out.println("A quantidade de anos necessários para o país A passar o país B é: "+anos+"anos");
        System.out.println("Digite 'R' para repetir a operação.Caso queira sair digite 'Q'.");
        res = scanner.nextLine();
        
        if (res.equalsIgnoreCase("q")) {
            System.out.println("Encerrando...");
            scanner.close();
            return;
            
                           
        }        
        }while(res.equalsIgnoreCase("r"));
        scanner.close();
        }
    }
