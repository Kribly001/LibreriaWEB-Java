package proyectorelaciones.ejercicioo1;

public enum Personas {
    AGUSTIN("Agustin Perez", 34, 4623878, "Pitbull"), JUAN("Juan Gomez", 21, 6745986, "Caniche");
    private String nombre;
    private Integer edad;
    private Integer dni;
    private String perro;

    private Personas(String nombre, Integer edad, Integer dni, String perro) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getDni() {
        return dni;
    }

    public String getPerro() {
        return perro;
    }

}
