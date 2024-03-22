import java.util.Scanner;

public class Numerocinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paisB;
        int paisA;
        double taxaA;
        double taxaB;
        String reset;


        System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país A: ");
            paisA = scanner.nextInt();
            taxaA = scanner.nextDouble();
        System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país B: ");
            paisB = scanner.nextInt();
            taxaB = scanner.nextDouble();
        while(paisA < 0 || paisB < 0 || taxaA < 0 || taxaB < 0){
                System.out.println("Há um valor inválido, tente novamente.");
                System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país A: ");
                    paisA = scanner.nextInt();
                    taxaA = scanner.nextDouble();
                System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país B: ");
                    paisB = scanner.nextInt();
                    taxaB = scanner.nextDouble();
        }
        
        int qntdAnos = 0;
        while(paisA<=paisB){ 
            paisA *= taxaA;
            paisB *= taxaB;
            System.out.println(paisA);
            qntdAnos++;          
        }
        System.out.println("A quantidade de anos possiveis para o paísA passar o paísB é: " + qntdAnos + "anos");

        
        System.out.println("Digite R para fazer a repetição do programa.Caso queira sair digite Q.");
        scanner.nextLine();
        reset = scanner.nextLine();
        while(reset.equalsIgnoreCase("R")) {
            if (reset.equalsIgnoreCase("Q")) {
                System.out.println("Encerrando...");
                break;
                
                
            }
        System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país A: ");
            paisA = scanner.nextInt();
            taxaA = scanner.nextDouble();
        System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país B: ");
            paisB = scanner.nextInt();
            taxaB = scanner.nextDouble();
            while(paisA < 0 || paisB < 0 || taxaA < 0 || taxaB < 0){
                System.out.println("Há um valor inválido, tente novamente.");
                System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país A: ");
                    paisA = scanner.nextInt();
                    taxaA = scanner.nextDouble();
                System.out.println("Informe quantos habitantes e a taxa de crescimento anual do país B: ");
                    paisB = scanner.nextInt();
                    taxaB = scanner.nextDouble();
                   
        }                                
        System.out.println("A quantidade de anos possiveis para o paísA passar o paísB é: " + qntdAnos + "anos");            
        }             
        scanner.close();    
    }
    
    
}
