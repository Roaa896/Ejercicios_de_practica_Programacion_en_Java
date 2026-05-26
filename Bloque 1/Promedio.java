import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota final: ");
        double nf = sc.nextDouble();

        double definitiva = (n1 * 0.30) + (n2 * 0.30) + (nf * 0.40);

        String resultado;
        if (definitiva >= 3.0) {
            resultado = "Aprueba";
        } else {
            resultado = "Reprueba";
        }
         
        System.out.printf("Nota definitiva: %.2f\n", definitiva);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}