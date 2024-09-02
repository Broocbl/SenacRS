package appjava1.appjava3;

import java.util.Scanner;

public class atividade {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int contDiv = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um n° inteiro: ");

        int numero = entrada.nextInt();

        for(int i = 0; i < numero; i++){
            if (numero % i == 0) {
                contDiv ++;
            }
        }

        switch (contDiv) {
            case 2:
                System.out.println("É primo");
                break;
            default:
            System.out.println("Não é Primo");
                break;
        }
    }
}
