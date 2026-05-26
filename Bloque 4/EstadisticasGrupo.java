import java.util.Scanner;

public class EstadisticasGrupo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];

        double suma = 0;
        double mayor;
        double menor;

        int posicionMayor = 0;
        int posicionMenor = 0;

        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            suma = suma + notas[i];
        }

        mayor = notas[0];
        menor = notas[0];

        for (int i = 0; i < notas.length; i++) {

            if (notas[i] > mayor) {
                mayor = notas[i];
                posicionMayor = i;
            }

            if (notas[i] < menor) {
                menor = notas[i];
                posicionMenor = i;
            }

            if (notas[i] >= 3.0) {
                aprobados++;

            } else {
                reprobados++;
            }
        }

        System.out.println("Promedio: " + (suma / notas.length));

        System.out.println("Nota mayor: " + mayor);
        System.out.println("Posicion mayor: " + posicionMayor);

        System.out.println("Nota menor: " + menor);
        System.out.println("Posicion menor: " + posicionMenor);

        System.out.println("Aprobados: " + aprobados);

        System.out.println("Reprobados: " + reprobados);

        sc.close();
    }
}