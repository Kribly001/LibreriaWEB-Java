package proyectorelaciones.ejercicioo2;

import java.util.HashSet;
import proyectorelaciones.ejercicioo2.EntidadJugador.Jugador;

public class EntidadJuego {

    public class Juego {

        private HashSet<Jugador> jugadores = new HashSet();
        private RevolverDeAgua revolver = new RevolverDeAgua();

        public Juego() {
        }

        public HashSet<Jugador> getJugadores() {
            return jugadores;
        }

        public void setJugadores(HashSet<Jugador> jugadores) {
            this.jugadores = jugadores;
        }

        public RevolverDeAgua getRevolver() {
            return revolver;
        }

        public void setRevolver(RevolverDeAgua revolver) {
            this.revolver = revolver;
        }

        @Override
        public String toString() {
            return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
        }

    }

}
