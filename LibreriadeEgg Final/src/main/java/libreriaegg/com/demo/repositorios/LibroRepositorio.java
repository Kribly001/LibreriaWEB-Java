package libreriaegg.com.demo.repositorios;

import java.util.List;
import libreriaegg.com.demo.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepositorio extends JpaRepository<Libro, String> {
 @Query("SELECT a FROM Libro a WHERE a.alta=true")
    public List<Libro> buscarActivos();
}
