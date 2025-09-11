import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.1415926;
        int i = 0, cont = 0;
        float comprimento, largura, Raio1, Raio2;
        ArrayList<Float> C = new ArrayList<>();
        ArrayList<Float> L = new ArrayList<>();
        ArrayList<Float> R1 = new ArrayList<>();
        ArrayList<Float> R2 = new ArrayList<>();
        ArrayList<Double> AreaCirc = new ArrayList<>();
        ArrayList<Float> AreaRet= new ArrayList<>();
        boolean aux = true;
        //O codigo tem que parar em 0,0,0,0
        while (aux) {
            comprimento = input.nextFloat();
            largura = input.nextFloat();
            Raio1 = input.nextFloat();
            Raio2 = input.nextFloat();
            //Se for 0,0,0,0 sai do while
            if (comprimento == 0 && largura == 0 && Raio1 == 0 && Raio2 == 0) {
                break;
            }
            C.add(comprimento);
            L.add(largura);
            R1.add(Raio1);
            R2.add(Raio2);
        }
        //Calculo das areas
        for (i = 0; i < R1.size(); i++) { //Size é pra ver o tamanho
            double aux2=0;
            aux2=(R1.get(i)*R1.get(i))*pi+(R2.get(i)*R2.get(i))*pi; //O get pega o numero na posição "i"
            AreaCirc.add(aux2);
            AreaRet.add(C.get(i)*L.get(i)); //Aqui faz direto o calculo em vez de usar outra variavel
        }
        //Sa porra de if ta errado
        for(i=0;i<AreaRet.size();i++){
            float diametro=R1.get(i)*2+R2.get(i)*2;
            float maiorRaio=Math.max(R1.get(i),R2.get(i));
            if ((diametro <= C.get(i) && maiorRaio*2 <= L.get(i)) || (diametro <= L.get(i) && maiorRaio*2 <= C.get(i))) {
                System.out.println("N");
            }
            else{
                System.out.println("S");
            }
        }
    }
}
