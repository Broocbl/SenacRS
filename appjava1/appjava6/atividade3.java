package appjava1.appjava6;

import java.util.Scanner;

public class atividade3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.println("Digite um numero caso queira sair digite um numero negativo: ");
            int valor = entrada.nextInt();

            if (valor < 0) {
                break;
            }

            soma += valor;

        }
        System.out.println("Soma final " + soma);
        entrada.close();
    }
}
