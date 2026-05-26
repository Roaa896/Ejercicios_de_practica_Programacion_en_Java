import java.util.Scanner;

public class SumaSeriesMatematicas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        int sumaNaturales;
        int sumaPares;
        int sumaCuadrados;

        int formulaNaturales;
        int formulaPares;
        int formulaCuadrados;

        sumaNaturales = 0;
        sumaPares = 0;
        sumaCuadrados = 0;

        System.out.print("Ingrese el valor de n: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            sumaNaturales = sumaNaturales + i;

            sumaPares = sumaPares + (2 * i);

            sumaCuadrados = sumaCuadrados + (i * i);
        }

        formulaNaturales = n * (n + 1) / 2;

        formulaPares = n * (n + 1);

        formulaCuadrados = (n * (n + 1) * (2 * n + 1)) / 6;

        System.out.println("Suma naturales: " + sumaNaturales);
        System.out.println("Formula naturales: " + formulaNaturales);

        System.out.println();

        System.out.println("Suma pares: " + sumaPares);
        System.out.println("Formula pares: " + formulaPares);

        System.out.println();

        System.out.println("Suma cuadrados: " + sumaCuadrados);
        System.out.println("Formula cuadrados: " + formulaCuadrados);

        sc.close();
    }
}

