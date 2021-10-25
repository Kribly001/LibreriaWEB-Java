package proyectoherencia.ejercicioo5;

import java.util.Date;

public enum Barco {
    BARCO1((new Date(1985 - 1900, 7 - 1, 23)), 345687, 150),
    BARCO2((new Date(1990 - 1900, 5 - 1, 19)), 046273, 200),
    BARCO3((new Date(2001 - 1900, 9 - 1, 23)), 994528, 310),
    BARCO4((new Date(2008 - 1900, 10 - 1, 19)),385382, 365);
    private Date fabricacion;
    private Integer matricula;
    private double eslora;

    private Barco(Date fabricacion, Integer matricula, double eslora) {
        this.fabricacion = fabricacion;
        this.matricula = matricula;
        this.eslora = eslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

}
