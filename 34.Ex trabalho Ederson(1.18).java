import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

/*Validador de CPF: Desenvolva uma função que verifique validade de CPF (algoritmo padrão), retornando boolean. Chame
com escopo controlado. Extensão: Integre em sistemas de cadastro governamental ou e-commerce.*/

public class Main {
    //o int[] fala q é um vetor pro programa
    /**Muda o cpf de string pra numero**/
    public static int[] transformar(String cpf) {
        int[] cpf_int = new int[12];
        int i;
        /**transforma o cpf em numero**/
        for (i = 0; i < 11; i++) {
            /*Tranforma cada numero em Int,o 0 tem um numero ascii de 48,basicamente oq ce ta fazendo é 48-numero
            Ex:o 1 em ascii é 49 o codigo ira fazer 49-48,isso dara 1 em valor numerico*/
            cpf_int[i] = cpf.charAt(i) - '0';
        }
        return cpf_int;
        //Ele devolve o objeto "cpf_int" com os valores preenchidos em cada posição
    }
    /**Valida o cpf**/
    public static boolean validar(String cpf){
        int[] cpf_int = transformar(cpf); /*chama a função transformar*/
        char primeiro;
        boolean aux=true;
        int i,cont=0,j=10,multiplicação=0,soma=0,verificador_01=0,verificador_02=0;
        /**Validar tamanho,e cpf com os mesmos numero**/
        if(cpf.length() != 11){
            return false;
        }
        primeiro = cpf.charAt(0);
        /*Preencher o vetor e ver se todos os numeros são iguais*/
        for(i=0;i<11;i++){
            if(cpf.charAt(i)==primeiro){
                cont++;
            }
        }
        if(cont==11){
            return false;
        }
        /**Validar os digitos**/
        //Primeiro digito verificador
        while(aux){
            for(i=0;i<9;i++){
                multiplicação=cpf_int[i]*j;
                j--;
                soma+=multiplicação;
            }
            if(soma%11==0 || soma%11==1){
                verificador_01=0;
            }
            else{
                verificador_01=11-(soma%11);
            }
            //Segundo digito verificador
            soma=0;
            multiplicação=0;
            j=11;
            for(i=0;i<10;i++){
                multiplicação=cpf_int[i]*j;
                j--;
                soma+=multiplicação;
            }
            soma += verificador_01*2;
            if(soma%11==0 || soma%11==1){
                verificador_02=0;
            }
            else{
                verificador_02=11-(soma%11);
            }
            aux=false;
            break;
        }
        if(verificador_01==cpf_int[9] && verificador_02==cpf_int[10] ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        String cpf;
        boolean Cpf_validado;
        System.out.println("Digite o cpf[sem pontos/traços]:");
        cpf = input.nextLine();
        Cpf_validado=validar(cpf); //Aqui ja chama a função,e define o valor da variavel
        if(Cpf_validado){
            System.out.println("Cpf valido");
        }
        else{
            System.out.println("Cpf invalido");
        }
        /*Aqui ele puxa a função validar,então ele volta pra cima,e como a validar tambem puxa a transformar então as duas
        são puxadas*/
    }
}
