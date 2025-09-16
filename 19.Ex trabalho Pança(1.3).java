import java.util.Scanner;
import java.util.ArrayList;

/*Gerenciador de Tarefas Simples: Escreva um programa que leia uma lista de tarefas diárias (via entrada de texto) e as exiba
formatadas no console, com numeração. Demonstre uso de comentários e boas práticas. Extensão: Expanda para um app de
produtividade em engenharia de software.*/

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lista; //Aqui declara o vetor
        lista=new String[]{"LImpar casa","Cuidar do cachorro","Lavar louça","Lavar roupa","Arrumar quarto"}; //aqui define os valores nele
        int i;
        for(i=0;i<lista.length;i++){//aqui printa o vetor,com o I sendo o contador
            System.out.printf("\n%d-%s",i+1,lista[i]);
        }
    }
}
