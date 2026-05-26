import java.util.Scanner;

public class TablaMultiplicarExtendida {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese un numero: ");
        n = sc.nextInt();

        System.out.println();
        System.out.println("Tablas del 1 hasta el " + n);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 12; j++) {

                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }

        sc.close();
    }
}