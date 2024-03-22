import java.util.Scanner;

public class Numeroum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;
        System.out.println("Coloque uma nota entre 0 e 10:");
        nota = scanner.nextInt();
            while(nota <0 || nota > 10){
                System.out.println("Este valor está invalido.Tente novamente.");
                nota=scanner.nextInt();                
            }
            scanner.close();        
    }
    
}