import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeroSecreto;
        int intento;
        int contador;

        numeroSecreto = (int)(Math.random() * 100) + 1;

        contador = 0;

        System.out.println("Adivina el numero entre 1 y 100");

        do {

            System.out.print("Ingrese un numero: ");
            intento = sc.nextInt();

            contador++;

            if (intento < numeroSecreto) {

                System.out.println("El numero es mayor");

            } else if (intento > numeroSecreto) {

                System.out.println("El numero es menor");

            } else {

                System.out.println("Correcto");
            }

        } while (intento != numeroSecreto);

        System.out.println("Intentos realizados: " + contador);

        sc.close();
    }
}
