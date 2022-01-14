package libreriaegg.com.demo.entidades;

import com.sun.istack.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity

public class Editorial {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @NotNull
    @Column(nullable = false)
    private String nombreEditorial;
    @NotNull
    private boolean alta;

    public Editorial() {
    }

    public Editorial(String id, String nombreEditorial, boolean alta) {
        this.id = id;
        this.nombreEditorial = nombreEditorial;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public boolean isAlta() {
        return alta;
    }

    public void setAlta(boolean alta) {
        this.alta = alta;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombreEditorial=" + nombreEditorial + ", alta=" + alta + '}';
    }

    

 
}
