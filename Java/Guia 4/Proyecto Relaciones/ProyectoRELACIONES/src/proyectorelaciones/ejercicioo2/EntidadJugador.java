package proyectorelaciones.ejercicioo2;

public class EntidadJugador {

    public class Jugador {

        private Short id;
        private String nombre;
        private Boolean mojado;

        public Jugador() {
        }

        public Jugador(Short id, String nombre, Boolean mojado) {
            this.id = id;
            this.nombre = nombre;
            this.mojado = mojado;
        }

        public Short getId() {
            return id;
        }

        public void setId(Short id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public Boolean getMojado() {
            return mojado;
        }

        public void setMojado(Boolean mojado) {
            this.mojado = mojado;
        }

        @Override
        public String toString() {
            return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
        }

    }

}
