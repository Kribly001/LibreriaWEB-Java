package libreriaegg.com.demo.repositorios;

import libreriaegg.com.demo.entidades.Foto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FotoRepositorio extends JpaRepository<Foto, String> {

}
