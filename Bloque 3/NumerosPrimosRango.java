import java.util.Scanner;

public class NumerosPrimosRango {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;
        int b;

        int cantidad;
        int suma;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        cantidad = 0;
        suma = 0;

        System.out.print("Primos entre " + a + " y " + b + ": ");

        for (int i = a; i <= b; i++) {

            if (i > 1) {

                int divisor = 2;
                boolean primo = true;

                while (divisor <= Math.sqrt(i)) {

                    if (i % divisor == 0) {
                        primo = false;
                    }

                    divisor++;
                }

                if (primo) {
                    System.out.print(i + " ");
                    cantidad++;
                    suma = suma + i;
                }
            }
        }

        System.out.println();
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}