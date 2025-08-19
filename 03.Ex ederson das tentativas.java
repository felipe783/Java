import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String senhacerta = "1234";
        String usuariocerto = "admin";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o usuario:");
        String usuario = scanner.nextLine();
        System.out.print("Digite a senha:");
        String senha = scanner.nextLine();

        if (senha.equals(senhacerta) && usuario.equals(usuariocerto)){ //esse equals pra objetos (String, List, etc). é o ==
            System.out.println("Senha correta!");
        }else{
            System.out.println("Senha incorreta!");
        }

    }
}
