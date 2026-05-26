import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota;

        System.out.print("Ingrese la nota: ");
        nota = sc.nextDouble();

        if (nota >= 4.6 && nota <= 5.0) {
            System.out.println("A - Excelente");
        } else if (nota >= 4.0) {
            System.out.println("B - Sobresaliente");
        } else if (nota >= 3.5) {
            System.out.println("C - Aceptable");
        } else if (nota >= 3.0) {
            System.out.println("D - Aprobado minimo");
        } else {
            System.out.println("F - Reprobado");
        }

        sc.close();
    }
}
