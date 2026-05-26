import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese minutos totales: ");
        int minutos = sc.nextInt();

        int horas = minutos / 60;
        int minutosRest = minutos % 60;
        int segundos = minutos * 60;

        System.out.println("Tiempo ingresado: " + minutos + " minutos");
        System.out.println("Equivale a: " + horas + " horas, " + minutosRest + " minutos, 0 segundos");
        System.out.println("En segundos: " + segundos + " segundos");

        sc.close();
    }
}
    

