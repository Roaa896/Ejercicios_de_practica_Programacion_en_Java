import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.print("Altura del rectángulo: ");
        double altura = sc.nextDouble();

        System.out.print("Radio del círculo: ");
        double radio = sc.nextDouble();

        double areaRect = base * altura;
        double perimetroRect = 2 * (base + altura);

        double areaCirculo = Math.PI * radio * radio;
        double circunferencia = 2 * Math.PI * radio;

        System.out.printf("Área rectángulo: %.2f\n", areaRect);
        System.out.printf("Perímetro rectángulo: %.2f\n", perimetroRect);
        System.out.printf("Área círculo: %.2f\n", areaCirculo);
        System.out.printf("Circunferencia: %.2f\n", circunferencia);

        sc.close();
    }
}