import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;

    public static void main(String[] args) {
        int opcion;
        do {
            opcion = menuPrincipal();

            if (opcion == 1) {
                mostrarEstado();
            } else if (opcion == 2) {
                comer();
            } else if (opcion == 3) {
                jugar();
            } else if (opcion == 4) {
                dormir();
            }

        } while (opcion != 0);
    }


    private static int menuPrincipal() {
        int opcion;
        do {
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("----------------");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4);
        return opcion;
    }

    private static void mostrarEstado() {

        if (saciedad <= 0 || energia <= 0 || diversion <= 0) {
            System.out.println("(x_x) Game Over");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
        else if (saciedad <= 4) {
            System.out.println("(o_o) Tengo hambre");
            System.out.println("/|x|\\");
            System.out.println(" | |");
        }
        else if (energia <= 4) {
            System.out.println("(-_-) Estoy cansado");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
        else if (diversion <= 4) {
            System.out.println("(-_-) Estoy aburrido");
            System.out.println("/|_|\\");
            System.out.println("/ \\");
        }
        else {
            System.out.println("(^_^) Estoy feliz");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }

        System.out.println("Saciedad: " + saciedad);
        System.out.println("Energia: " + energia);
        System.out.println("Diversion: " + diversion);
    }

    //
    private static void comer() {
        saciedad += 4;
        diversion -= 1;
        energia -= 1;

        if (saciedad > 10) saciedad = 10;
        if (diversion < 0) diversion = 0;
        if (energia < 0) energia = 0;

        mostrarEstado();
    }

    //
    private static void jugar() {
        diversion += 2;
        energia -= 2;
        saciedad -= 1;

        if (diversion > 10) diversion = 10;
        if (energia < 0) energia = 0;
        if (saciedad < 0) saciedad = 0;

        mostrarEstado();
    }
    private static void dormir() {
        energia += 4;
        saciedad -= 2;
        diversion -= 1;

        if (energia > 10) energia = 10;
        if (saciedad < 0) saciedad = 0;
        if (diversion < 0) diversion = 0;

        mostrarEstado();
    }

}
