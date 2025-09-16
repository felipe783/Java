import java.util.Scanner;
import java.util.ArrayList;

/*Simulador de Orçamento Pessoal: Peça ao usuário para inserir receitas e despesas mensais, calcule o saldo e exiba uma
mensagem de alerta se negativo. Use tipos primitivos para valores monetários. Extensão: Relacione a finanças pessoais ou
empresariais em sistemas de ERP.*/

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float receita=0,despesas=0,saldo=0;
        System.out.println("Fale a receita do mes");
        receita=input.nextFloat();
        System.out.println("Fale as despesas do mes");
        despesas=input.nextFloat();
        saldo=receita-despesas;
        if(saldo<0){
            System.out.println("Ta ruim paizão");
        }
        else{
            System.out.println("Ta susa papai");
        }
    }
}
