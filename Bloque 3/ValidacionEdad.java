import java.util.Scanner;

public class ValidacionEdad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        while (edad < 1 || edad > 120) {

            System.out.println("Edad invalida");

            System.out.print("Ingrese nuevamente su edad: ");
            edad = sc.nextInt();
        }

        if (edad >= 1 && edad <= 12) {
            System.out.println("Etapa: Niñez");

        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Etapa: Adolescencia");

        } else if (edad >= 18 && edad <= 25) {
            System.out.println("Etapa: Juventud");

        } else if (edad >= 26 && edad <= 59) {
            System.out.println("Etapa: Adultez");

        } else {
            System.out.println("Etapa: Tercera edad");
        }

        sc.close();
    }
}