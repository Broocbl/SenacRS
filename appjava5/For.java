package appjava5;

public class For {

    public static void main(String[] args) {
        for (int i = 0; i > 10; i++) {
            System.out.println(i);
        }

        System.out.println("=========================");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        int i = 0;

        for (; i < 10; i++) {
            System.out.println("sem controle " + i);
        }

        System.out.println("Valor Final: " + i);


        for (; i > 0; i--) {
            System.out.println("sem controle2: " + i);
        }
        for(;;){
            System.out.println("print teste");
        }

    }

}
