package libreriaegg.com.demo.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import libreriaegg.com.demo.entidades.Editorial;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.repositorios.EditorialRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EditorialService {

    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Transactional
    public Editorial agregarEditorial(String nombreEditorial) throws ErroresServicio {
//        validar(nombreEditorial);
        Editorial editorial = new Editorial();
    
        editorial.setNombreEditorial(nombreEditorial);
        editorial.setAlta(true);
       return editorialRepositorio.save(editorial);
    }

    @Transactional(readOnly = true)
    public List<Editorial> listarEditoriales() throws Exception {
        return editorialRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public List<Editorial> listarActivos() throws Exception {
        return editorialRepositorio.findAll();
    }

    @Transactional
    public Editorial baja(String id) {
        Editorial editorial = editorialRepositorio.getOne(id);
        editorial.setAlta(false);
        return editorialRepositorio.save(editorial);
    }

    @Transactional
    public Editorial alta(String id) {
        Editorial editorial = editorialRepositorio.getOne(id);
        editorial.setAlta(true);
        return editorialRepositorio.save(editorial);
    }

    @Transactional
    public void modificar(String id, String nombreEditorial) throws ErroresServicio {
        validar(nombreEditorial);
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombreEditorial(nombreEditorial);
            editorial.setAlta(true);
            editorialRepositorio.save(editorial);
        } else {
            throw new ErroresServicio("No se encontro el Editorial nombrado");
        }

    }

    private void validar(String nombreEditorial) throws ErroresServicio {
        if (nombreEditorial == null || nombreEditorial.isEmpty()) {
            throw new ErroresServicio("El espacio nombre pueden quedar vacio");
        }

    }
}
