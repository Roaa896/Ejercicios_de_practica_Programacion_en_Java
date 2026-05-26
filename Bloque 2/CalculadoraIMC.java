import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso;
        double estatura;
        double imc;

        System.out.print("Ingrese el peso en kg: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese la estatura en metros: ");
        estatura = sc.nextDouble();

        imc = peso / (estatura * estatura);

        System.out.printf("IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Categoria: Bajo peso");
        } else if (imc >= 18.5 && imc <= 24.99) {
            System.out.println("Categoria: Peso normal");
        } else if (imc >= 25 && imc <= 29.99) {
            System.out.println("Categoria: Sobrepeso");
        } else {
            System.out.println("Categoria: Obesidad");
        }

        sc.close();
    }
}