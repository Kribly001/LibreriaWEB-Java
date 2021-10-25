
package proyectoherencia.ejercicioo1;


public class Gato extends Animal {
    
    public Gato(String nombre, String alimento, byte edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
     public Gato(){
         super();
     }
  @Override
    public void alimentarse() {// Sobreescribo el metodo abstracto
        System.out.println("El gato se alimenta de: " + this.alimento);
    }
        @Override
    public void tambienhago(){
       
        System.out.println("Mi nombre es:\t" + this.nombre);
        System.out.println("Mi edad:\t" + this.edad);
        System.out.println("Mi raza es:\t" + this.raza);
    }
}
