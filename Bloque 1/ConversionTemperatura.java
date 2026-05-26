import java.util.Scanner;

public class ConversionTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;
        double k = c + 273.15;

        System.out.printf("Celsius:    %.2f °C\n", c);
        System.out.printf("Fahrenheit: %.2f °F\n", f);
        System.out.printf("Kelvin:     %.2f K\n", k);

        sc.close();
    }
}