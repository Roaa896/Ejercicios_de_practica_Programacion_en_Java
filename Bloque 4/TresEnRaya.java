import java.util.Scanner;

public class TresEnRaya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] tablero = new char[3][3];

        int fila;
        int columna;

        char jugador = 'X';
        boolean ganador = false;
        int movimientos = 0;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tablero[i][j] = ' ';
            }
        }

        while (ganador == false && movimientos < 9) {
            System.out.println();

            for (int i = 0; i < 3; i++) {
                System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);

                if (i < 2) {
                    System.out.println("-----------");
                }
            }

            System.out.println();

            System.out.println("Turno del jugador " + jugador);

            System.out.print("Ingrese fila: ");
            fila = sc.nextInt();

            System.out.print("Ingrese columna: ");
            columna = sc.nextInt();

            if (tablero[fila][columna] == ' ') {

                tablero[fila][columna] = jugador;

                movimientos++;

                for (int i = 0; i < 3; i++) {

                    if (tablero[i][0] == jugador &&
                        tablero[i][1] == jugador &&
                        tablero[i][2] == jugador) {

                        ganador = true;
                    }

                    if (tablero[0][i] == jugador &&
                        tablero[1][i] == jugador &&
                        tablero[2][i] == jugador) {

                        ganador = true;
                    }
                }

                if (tablero[0][0] == jugador &&
                    tablero[1][1] == jugador &&
                    tablero[2][2] == jugador) {

                    ganador = true;
                }

                if (tablero[0][2] == jugador &&
                    tablero[1][1] == jugador &&
                    tablero[2][0] == jugador) {

                    ganador = true;
                }

                if (ganador == false) {

                    if (jugador == 'X') {

                        jugador = 'O';

                    } else {

                        jugador = 'X';
                    }
                }

            } else {
                System.out.println("Casilla ocupada");
            }
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println(" " + tablero[i][0] + " | " + tablero[i][1] + " | " + tablero[i][2]);

            if (i < 2) {
                System.out.println("-----------");
            }
        }

        System.out.println();
        if (ganador == true) {

            System.out.println("Gano el jugador " + jugador);
        } else {

            System.out.println("Empate");
        }

        sc.close();
    }
}