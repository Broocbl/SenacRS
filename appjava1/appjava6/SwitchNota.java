package appjava1.appjava6;

import java.util.Scanner;

public class SwitchNota {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        String conceito = "";

        System.out.print("Informe a nota: ");
        nota = entrada.nextInt();

        switch (nota) {
            case 10:
                conceito = "A";
                break;
            case 9:
                conceito = "A";
                break;
            case 8:
                conceito = "B";
                break;
            case 7:
                conceito = "B";
                break;
            case 6:
                conceito = "C";
                break;
            case 5:
                conceito = "c";
                break;
            case 4:
                conceito = "D";
                break;
            case 3:
                conceito = "D";
                break;
            case 2:
            case 1:
            case 0:
                conceito = "E";
                
                break;
            default:
            conceito = "";
            
        }
        System.out.println(conceito);
        entrada.close();
    }

}
