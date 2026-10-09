import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int jugador = 0, maquina = 0;

        System.out.println("Juego de PIEDRA, PAPEL O TIJERA");

        while (true) {
            System.out.println("\n 1=Piedra  2=Papel  3=Tijera (0=Salir): ");
            int eleccion = sc.nextInt();

            if (eleccion == 0) {
                break;
            }

            if (eleccion < 1 || eleccion > 3) {
                System.out.println(" X Opcion invalida");
                continue;
            }

            int pc = rnd.nextInt(3) + 1;

            String textoJugador;
            if (eleccion == 1) textoJugador = "Piedra";
            else if (eleccion == 2) textoJugador = "Papel";
            else textoJugador = "Tijera";

            String textoMaquina;
            if (pc == 1) textoMaquina = "Piedra";
            else if (pc == 2) textoMaquina = "Papel";
            else textoMaquina = "Tijera";

            System.out.println("Tu: " + textoJugador + " | Maquina: " + textoMaquina);

            if (eleccion == pc) {
                System.out.println("Empate");
            } else if ((eleccion == 1 && pc == 3)
                    || (eleccion == 2 && pc == 1)
                    || (eleccion == 3 && pc == 2)) {
                System.out.println("¡Ganaste!");
                jugador++;
            } else {
                System.out.println(" X Perdiste");
                maquina++;
            }

            System.out.println("Marcador -> Tu: " + jugador + " | Maquina: " + maquina);
        }

        System.out.println("\nFinal -> Tu: " + jugador + " | Maquina: " + maquina);

        sc.close();
    }
}