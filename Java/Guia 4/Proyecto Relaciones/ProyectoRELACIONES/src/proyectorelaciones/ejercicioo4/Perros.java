package proyectorelaciones.ejercicioo4;
//dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase

public enum Perros {
    PITBULL("Pochi", "Pitbull", 2, 40), CANICHE("Morita", "Caniche", 1, 30);
    private String nombre;
    private String raza;
    private Integer edad;
    private Integer tamaño;

    private Perros(String nombre, String raza, Integer edad, Integer tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public Integer getTamaño() {
        return tamaño;
    }

}