
package libreriaegg.com.demo.servicios;


import java.util.Optional;
import libreriaegg.com.demo.entidades.Foto;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.repositorios.FotoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FotoService {

    @Autowired
    private FotoRepositorio fotoRepositorio;

    @Transactional
    public Foto guardar(MultipartFile archivo) throws ErroresServicio {

        if (archivo != null && !archivo.isEmpty()) {
            try {
                Foto foto = new Foto();
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fotoRepositorio.save(foto);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;

    }

   @Transactional
    public Foto actualizar(String idFoto, MultipartFile archivo) throws ErroresServicio{
    
        if (archivo != null) {
            try {
        
                Foto foto = new Foto();
                
                if (idFoto != null) {
                    Optional<Foto> respuesta = fotoRepositorio.findById(idFoto);
                    if (respuesta.isPresent()) {
                        foto = respuesta.get();
                    }
                }
                
                foto.setMime(archivo.getContentType());
                foto.setNombre(archivo.getName());
                foto.setContenido(archivo.getBytes());

                return fotoRepositorio.save(foto);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;

        
    }
    
}
