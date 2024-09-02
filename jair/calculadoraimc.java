package jair;

import java.util.Scanner;

public class calculadoraimc {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float altura, peso, imc;
        String resultado = null;
        System.out.println(".: Calculadora de IMC :.");
        System.out.print("Informe a altura: ");
        altura = ler.nextFloat();
        System.out.println("Informe seu peso: ");
        peso = ler.nextFloat();
        imc = peso / (altura * altura);

        if (imc < 16) {
            resultado = "Magrelin";
        } else if (imc < 16.9) {
            resultado = "magrelo";
        } else if (imc < 18.5) {
            resultado = "magreza leve";
        } else if (imc < 24.9) {
            resultado = "peso ideal";
        } else if (imc < 29.9) {
            resultado = "sobrepeso";
        } else if (imc < 34.9) {
            resultado = "Obesidade 1";
        } else if (imc < 39.9) {
            resultado = "Obesidade 2";
        } else {
            resultado = "GORDAO DA XJ";
        }

        System.out.println("seu imc é: " + imc +"\n"+ resultado);
    }

}
