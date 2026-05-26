import java.util.Scanner;

public class RegistroVentasSucursal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] ventas = new double[4][3];

        double mayorVenta = 0;

        int sucursalMayor = 0;
        int productoMayor = 0;

        for (int i = 0; i < ventas.length; i++) {

            for (int j = 0; j < ventas[i].length; j++) {
                System.out.print("Ingrese venta sucursal " + (i + 1) + " producto " + (j + 1) + ": ");
                ventas[i][j] = sc.nextDouble();

                if (ventas[i][j] > mayorVenta) {

                    mayorVenta = ventas[i][j];
                    sucursalMayor = i;
                    productoMayor = j;
                }
            }
        }

        System.out.println("--- Ventas por sucursal ---");

        for (int i = 0; i < ventas.length; i++) {

            double sumaFila = 0;

            for (int j = 0; j < ventas[i].length; j++) {
                sumaFila = sumaFila + ventas[i][j];
            }

            System.out.println("Sucursal " + (i + 1) + ": $" + sumaFila);
        }

        System.out.println();
        System.out.println("--- Ventas por producto ---");

        for (int j = 0; j < ventas[0].length; j++) {

            double sumaColumna = 0;

            for (int i = 0; i < ventas.length; i++) {
                sumaColumna = sumaColumna + ventas[i][j];
            }

            System.out.println("Producto " + (j + 1) + ": $" + sumaColumna);
        }

        System.out.println();
        System.out.println("Venta mas alta: $" + mayorVenta);
        System.out.println("Sucursal: " + (sucursalMayor + 1));
        System.out.println("Producto: " + (productoMayor + 1));

        sc.close();
    }
}