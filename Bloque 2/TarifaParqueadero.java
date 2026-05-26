import java.util.Scanner;

public class TarifaParqueadero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tipo;
        int horas;
        int total = 0;

        System.out.println("1. Moto");
        System.out.println("2. Carro");
        System.out.println("3. Camioneta");

        System.out.print("Ingrese el tipo de vehiculo: ");
        tipo = sc.nextInt();

        System.out.print("Ingrese las horas: ");
        horas = sc.nextInt();

        switch (tipo) {

            case 1:
                total = 2000;

                if (horas > 1) {
                    total = total + ((horas - 1) * 1500);
                }

                System.out.println("Total a pagar: $" + total);
                break;

            case 2:
                total = 4000;

                if (horas > 1) {
                    total = total + ((horas - 1) * 3000);
                }

                System.out.println("Total a pagar: $" + total);
                break;

            case 3:
                total = 5000;

                if (horas > 1) {
                    total = total + ((horas - 1) * 4000);
                }

                System.out.println("Total a pagar: $" + total);
                break;

            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}
