import java.util.Scanner;

public class BusquedaNombres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[8];
        String buscar;
        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {

            System.out.print("Ingrese el nombre " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.print("Ingrese el nombre a buscar: ");
        buscar = sc.nextLine();

        for (int i = 0; i < nombres.length; i++) {

            if (nombres[i].equalsIgnoreCase(buscar)) {

                System.out.println("Nombre encontrado en la posicion " + i);
                encontrado = true;
            }
        }

        if (encontrado == false) {
            System.out.println("Nombre no encontrado");
        }

        sc.close();
    }
}
