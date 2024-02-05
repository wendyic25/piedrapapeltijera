
            package org.example;

import java.util.Scanner;
import java.util.Random;

    public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            while (true) {
                System.out.println("Elige: 1 - Piedra, 2 - Papel, 3 - Tijera, 0 - Salir");
                int eleccionUsuario = scanner.nextInt();

                if (eleccionUsuario == 0) {
                    System.out.println("Gracias por jugar. ¡Hasta luego!");
                    break;
                }

                if (eleccionUsuario < 1 || eleccionUsuario > 3) {
                    System.out.println("Por favor, elige una opción válida.");
                    continue;
                }

                int eleccionComputadora = random.nextInt(3) + 1;

                System.out.println("La computadora eligió: " + convertirNumeroAMano(eleccionComputadora));

                determinarGanador(eleccionUsuario, eleccionComputadora);
            }

            scanner.close();
        }

        private static String convertirNumeroAMano(int numero) {
            switch (numero) {
                case 1:
                    return "Piedra";
                case 2:
                    return "Papel";
                case 3:
                    return "Tijera";
                default:
                    return "Desconocido";
            }
        }

        private static void determinarGanador(int eleccionUsuario, int eleccionComputadora) {
            if (eleccionUsuario == eleccionComputadora) {
                System.out.println("¡Es un empate!");
            } else if ((eleccionUsuario == 1 && eleccionComputadora == 3) ||
                    (eleccionUsuario == 2 && eleccionComputadora == 1) ||
                    (eleccionUsuario == 3 && eleccionComputadora == 2)) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡La computadora gana!");
            }
        }
    }

    {
    }
}