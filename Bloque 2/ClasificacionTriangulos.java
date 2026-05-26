import java.util.Scanner;

public class ClasificacionTriangulos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double lado1;
        double lado2;
        double lado3;

        System.out.print("Ingrese el primer lado: ");
        lado1 = sc.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        lado2 = sc.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        lado3 = sc.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo es equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es isosceles");
            } else {
                System.out.println("El triangulo es escaleno");
            }

        } else {
            System.out.println("No es un triangulo valido");
        }

        sc.close();
    }
}