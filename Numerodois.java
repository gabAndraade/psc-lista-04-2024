import java.util.Scanner;

public class Numerodois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeUsuario;
        String senhaUsuario;
        System.out.println("Digite seu nome de usuário:");
        nomeUsuario = scanner.nextLine();
        System.out.println("Digite sua senha:");
        senhaUsuario = scanner.nextLine();
            while(senhaUsuario.equalsIgnoreCase(nomeUsuario)){
                System.out.println("ERRO. Sua senha não pode ser igual ao seu nome de usuario, tente novamente.");
                System.out.println("Digite seu nome de usuário:");
                nomeUsuario = scanner.nextLine();
                System.out.println("Digite sua senha:");
                senhaUsuario = scanner.nextLine();                
            }
            scanner.close();
    }
    
}
