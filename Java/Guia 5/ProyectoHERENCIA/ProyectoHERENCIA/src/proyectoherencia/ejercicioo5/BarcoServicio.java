package proyectoherencia.ejercicioo5;

public abstract class BarcoServicio {

    protected Integer nummastiles;
    protected Integer potenciacvmotor;
    protected Integer cvlujo;
    protected Integer numcamarotes;

    public BarcoServicio() {
    }

    public BarcoServicio(Integer nummastiles, Integer potenciacvmotor, Integer cvlujo, Integer numcamarotes) {
        this.nummastiles = nummastiles;
        this.potenciacvmotor = potenciacvmotor;
        this.cvlujo = cvlujo;
        this.numcamarotes = numcamarotes;
    }

    public Integer getNummastiles() {
        return nummastiles;
    }

    public void setNummastiles(Integer nummastiles) {
        this.nummastiles = nummastiles;
    }

    public Integer getPotenciacvmotor() {
        return potenciacvmotor;
    }

    public void setPotenciacvmotor(Integer potenciacvmotor) {
        this.potenciacvmotor = potenciacvmotor;
    }

    public Integer getCvlujo() {
        return cvlujo;
    }

    public void setCvlujo(Integer cvlujo) {
        this.cvlujo = cvlujo;
    }

    public Integer getNumcamarotes() {
        return numcamarotes;
    }

    public void setNumcamarotes(Integer numcamarotes) {
        this.numcamarotes = numcamarotes;
    }
    
    public abstract void datos();
    public abstract void mostrar();
}
