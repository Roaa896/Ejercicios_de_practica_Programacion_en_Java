import java.util.Scanner;

public class AnioBisiestoDiaSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio;
        int dia;

        System.out.print("Ingrese un año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }

        System.out.print("Ingrese un numero del 1 al 7: ");
        dia = sc.nextInt();

        switch (dia) {

            case 1:
                System.out.println("Lunes");
                break;

            case 2:
                System.out.println("Martes");
                break;

            case 3:
                System.out.println("Miercoles");
                break;

            case 4:
                System.out.println("Jueves");
                break;

            case 5:
                System.out.println("Viernes");
                break;

            case 6:
                System.out.println("Sabado");
                break;

            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("Numero invalido");
        }

        sc.close();
    }
}
