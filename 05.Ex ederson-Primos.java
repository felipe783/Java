import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Fale o primeiro intervalo:");
        int intervalo1 = input.nextInt();
        input.nextLine(); //O enter entra como input dai isso skipa ele
        System.out.println("Fale o segundo intervalo:");
        int intervalo2 = input.nextInt();
        input.nextLine();
        if(intervalo1>intervalo2){
            int aux=intervalo1;
            intervalo1=intervalo2;
            intervalo2=aux;
        }

        for(int i=intervalo1;i<intervalo2;i++){
            boolean primo=true;
            for(int contador=2;contador<i;contador++){
                if(i % contador==0){ //Ver se tem mais de 1 divisor
                    primo=false;
                    break;
                }
            }
            if(primo){
                System.out.printf("\n %d é primo",i);
            }
        }
    }
}
