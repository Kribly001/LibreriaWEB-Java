package libreriaegg.com.demo.repositorios;

import java.util.List;
import libreriaegg.com.demo.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String> {

    @Query("SELECT a FROM Autor a WHERE a.alta=true")
    public List<Autor> buscarActivos();
}
