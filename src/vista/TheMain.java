package vista;

import java.util.Scanner;

public class TheMain {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);

        int opcion = 0;

        System.out.println("");
        System.out.println("1: suma de polinomios");
        System.out.println("2: multipliacion de polinomios de polinomios");
        System.out.println("3: si desea salir del programa");
        System.out.println("");
        System.out.print("eliga la opcion que desea realizar: ");
        opcion = tcld.nextInt();

        if(opcion>0 && opcion<4) {
            do {
                System.out.println("");
                System.out.println("1: suma de polinomios");
                System.out.println("2: multipliacion de polinomios");
                System.out.println("3: si desea salir del programa");
                System.out.println("");
                System.out.print("eliga la opcion que desea realizar: ");
                opcion = tcld.nextInt();

                switch (opcion) {
                    case 1:
                    case 2:
                    case 3:
                        System.out.println("Programa finalizado con exito");
                        break;
                }
            } while (opcion!=3);
        }else {
            System.out.println("la opcion ingresada es incorrecta");
        }
    }
}
