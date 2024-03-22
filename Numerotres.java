import java.util.Scanner;
public class Numerotres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            while (nome.length()<3){
                System.out.println("Seu nome deve ter no mínimo três caracteres. Tente novamente.");
                nome = scanner.nextLine();               
            }
        System.out.println("Informe sua idade:");
            int idade = scanner.nextInt();
            while (idade <0 || idade > 150) {
                System.out.println("Sua idade deve ser entre 0 e 150, tente novamente.");
                System.out.println("Informe sua idade:");
                idade = scanner.nextInt();
            }
        System.out.println("Informe seu salário:");
            double salario = scanner.nextDouble();
            while (salario<=0) {
            System.out.println("Valor inválido. Tente novamente.");
                salario = scanner.nextDouble();
            }
        scanner.nextLine();
        System.out.println("Seu sexo (Digite 'f' para feminino, 'm' para masculino):");
            String sexo = scanner.nextLine();
                while(!sexo.equalsIgnoreCase("f")  || !sexo.equalsIgnoreCase("m")){
                    System.out.println("Digite apenas 'f' ou 'm'");
                    sexo= scanner.nextLine();
                }
        
        System.out.println("Informe seu estado civil( 's', 'c', 'v', 'd')");
            String estadoC = scanner.nextLine();
                while(!estadoC.equalsIgnoreCase("s") && !estadoC.equalsIgnoreCase("c") && !estadoC.equalsIgnoreCase("v") && !estadoC.equalsIgnoreCase("d")){
                    System.out.println("Digite apenas:'s', 'c', 'v', 'd'");
                    estadoC=scanner.nextLine();
                }
        
        scanner.close();
    }
    
}
