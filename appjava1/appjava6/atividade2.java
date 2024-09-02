package appjava1.appjava6;

import java.util.Scanner;

public class atividade2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor =0;
        int maior = 0;

        for(int i = 0; i <= 10; i++){
            System.out.print("Digite o"+ i +"° inteiro: ");
            valor = entrada.nextInt();
        if (valor > maior) {
            maior = valor;
        }
        }
        entrada.close();
        System.out.println("O maior numero é: "+ maior);
    }
}
