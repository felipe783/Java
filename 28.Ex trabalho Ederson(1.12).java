import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float temp;
        int clima;
        System.out.print("Fale a temperatura:");
        temp= input.nextFloat();
        System.out.print("Fale o clime[Sol=1,Chuva=2]:");
        clima=input.nextInt();
        switch(clima){ //Ve o clima
            case 1: //Sol
                if(temp<0){

                }
                else{
                    if(temp>0 && temp<=20){

                    }
                    else{ //Maior q 20

                    }
                }
                break;
            case 2: //Chuva
                if(temp<0){

                }
                else{
                    if(temp>0 && temp<=20){

                    }
                    else{ //Maior q 20

                    }
                }
                break;
        }
    }
}
