package UI;

import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS = {"Enero","Febrero","Marzo","Abril","Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre","Noviembre", "Diciembre"};

    public static void ShowMenu(){
        System.out.println("Welcome to appointments");
        System.out.println("Seleccione la opción que desea: ");
        int response = 0;
        do {
            System.out.println("1.-Doctor");
            System.out.println("2.-Patient");
            System.out.println("0.-Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    break;
                case 2:
                    response = 0;
                    ShowPatientMenu();
                    break;
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Seleccione una opción válida");
            }
        }while (response !=0);
    }
    public static void ShowPatientMenu(){
        System.out.println("\n\n");
        System.out.println("Patient Menu");
        int response = 0;
        do {
            System.out.println("1.-Book and appointment");
            System.out.println("2.-My appointments");
            System.out.println("0.-Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+".-" + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");

                    break;
                case 0:
                    ShowMenu();
                    break;

            }
        }while (response !=0);
    }
}
