package proyectoherencia.ejercicioo5;

public class Barcotipo1 extends BarcoServicio {

    public Barcotipo1(Integer nummastiles, Integer potenciacvmotor, Integer cvlujo, Integer numcamarotes) {
        super(nummastiles, potenciacvmotor, cvlujo, numcamarotes);
    }

    @Override
    public void datos() {
        Barco.BARCO1.getFabricacion();
        Barco.BARCO1.getMatricula();
        Barco.BARCO1.getEslora();
    }

    @Override
    public void mostrar() {
        System.out.println("Cantidad de mastiles:\t" + this.nummastiles);
        System.out.println("Potencia de motor:\t" + this.potenciacvmotor);
        System.out.println("Numero de camarotes:\t" + this.numcamarotes);
        System.out.println("Barco de lujo:\t" + this.cvlujo);
    }
    

}
