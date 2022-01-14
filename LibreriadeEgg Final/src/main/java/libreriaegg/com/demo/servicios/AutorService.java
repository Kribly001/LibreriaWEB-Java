package libreriaegg.com.demo.servicios;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import libreriaegg.com.demo.entidades.Autor;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.repositorios.AutorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutorService {

    @Autowired
    private AutorRepositorio autorRepositorio;

    @Transactional
    public Autor agregarAutor(String nombre) throws ErroresServicio {
//        validar(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autor.setAlta(true);
       return autorRepositorio.save(autor);
    }

    @Transactional(readOnly = true)
    public List<Autor> listarAutores() throws Exception {
        return autorRepositorio.findAll();
    }
     @Transactional(readOnly = true)
    public List<Autor> listarActivos() throws Exception {
        return autorRepositorio.findAll();
    }
    @Transactional
    public Autor baja(String id) {
        Autor autor = autorRepositorio.getOne(id);
        autor.setAlta(false);
        return autorRepositorio.save(autor);
    }

    @Transactional
    public Autor alta(String id) {
        Autor autor = autorRepositorio.getOne(id);
        autor.setAlta(true);
        return autorRepositorio.save(autor);
    }

    @Transactional
    public void modificar(String id, String nombre) throws ErroresServicio {
        validar(nombre);
        Optional<Autor> respuesta = autorRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autor.setAlta(true);
            autorRepositorio.save(autor);
        } else {
            throw new ErroresServicio("No se encontro el Autor nombrado");
        }

    }


    private void validar(String nombre) throws ErroresServicio {
        if (nombre == null || nombre.isEmpty()) {
            throw new ErroresServicio("El espacio nombre no puede quedar vacio");
        }

    }

}
