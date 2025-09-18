import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Contador de Votos em Eleição: Leia votos (em loop while) até digitar "fim", use for para contar opções e break para encerrar.
Extensão: Expanda para sistemas de votação eletrônica.*/

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        boolean aux=true;
        int i=0;
        ArrayList<String> Votos=new ArrayList<>();
        String fim;
        System.out.println("==========================");
        System.out.println("Candidato Ederson-178");
        System.out.println("Candidato Ederson de Quinta-777");
        System.out.println("==========================");
        while(aux){
            System.out.println("Fale o numero do seu candidato:");
            Votos.add(input.nextLine());
            if(Votos.get(i).equalsIgnoreCase("fim")){
                aux=false;
                break;
            }
            i++;
        }
    }
}
