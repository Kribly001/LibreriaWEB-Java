package proyectorelaciones.ejercicioo5;

public enum Pelicula {
    PELICULA1("Rapidos y furiosos 9", 210, 17, "Justin Lin"),
    PELICULA2("Spiderman", 150, 14, "Sam Raimi"),
    PELICULA3("Shrek 4", 130, 5, "Andrew Adamson");
    private String nombre;
    private Integer duracion;
    private Integer edadmin;
    private String director;

    private Pelicula(String nombre, Integer duracion, Integer edadmin, String director) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadmin = edadmin;
        this.director = director;
    }

    public Integer getEdadmin() {
        return edadmin;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public String getDirector() {
        return director;
    }

}
