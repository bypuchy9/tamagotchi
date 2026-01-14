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
            System.out.println("(x_x) :( Game Over ):");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
        else if (saciedad <= 4) {
            System.out.println("(o_o) Tengo hambre!");
            System.out.println("/|x|\\");
            System.out.println(" | |");
        }
        else if (energia <= 4) {
            System.out.println("(-_-) Zzz");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
        else if (diversion <= 4) {
            System.out.println("(-_-) Estoy aburrido");
            System.out.println("/|_|\\");
            System.out.println("/ \\");
        }
        else {
            System.out.println("(^_^) Estoy feliz!");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }

        System.out.println("Saciedad: " + saciedad);
        System.out.println("Energia: " + energia);
        System.out.println("Diversion: " + diversion);
    }

    //
    private static void comer() {
        saciedad += 2;
        diversion -= 1;
        energia -= 1;

        if (saciedad > 10) saciedad = 10;
        if (diversion < 0) diversion = 0;
        if (energia < 0) energia = 0;

        mostrarEstado();
    }
}
