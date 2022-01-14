package libreriaegg.com.demo.servicios;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import libreriaegg.com.demo.entidades.Autor;
import libreriaegg.com.demo.entidades.Editorial;
import libreriaegg.com.demo.entidades.Foto;
import libreriaegg.com.demo.entidades.Libro;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.repositorios.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.multipart.MultipartFile;

@Service
public class LibroService {

    @Autowired
    private LibroRepositorio libroRepositorio;
    @Autowired
    private AutorService autorService;
    @Autowired
    private EditorialService editorialService;
    @Autowired
    private FotoService fotoServicio;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void agregarLibro(Long ISBN, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes, Autor autor, Editorial editorial) throws ErroresServicio {
        validar(ISBN, titulo, anio);
        Libro libro = new Libro();
        libro.setISBN(ISBN);
        libro.setTitulo(titulo);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes(ejemplaresRestantes);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        libro.setAnio(anio);
        libro.setAlta(true);
        libroRepositorio.save(libro);

    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public void modificar(String id, Long ISBN, String titulo, Integer anio, Integer ejemplares, Integer ejemplaresPrestados, Integer ejemplaresRestantes) throws ErroresServicio {
        validar(ISBN, titulo, anio);
        Optional<Libro> respuesta = libroRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Libro libro = respuesta.get();
            libro.setISBN(ISBN);
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setId(id);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAlta(true);
            libroRepositorio.save(libro);

        } else {
            throw new ErroresServicio("No se encontro el libro nombrado");
        }

    }

    @Transactional(readOnly = true)
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Transactional(readOnly = true)
    public Collection<Libro> listarActivos() throws Exception {
        return libroRepositorio.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Libro baja(String id) {
        Libro libro = libroRepositorio.getOne(id);
        libro.setAlta(false);
        return libroRepositorio.save(libro);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    public Libro alta(String id) {
        Libro libro = libroRepositorio.getOne(id);
        libro.setAlta(true);
        return libroRepositorio.save(libro);
    }

    @Transactional(readOnly = true)
    public Libro getOne(String id) {
        return libroRepositorio.getOne(id);
    }

    private void validar(Long ISBN, String titulo, Integer anio) throws ErroresServicio {
        if (ISBN == null) {
            throw new ErroresServicio("Los espacios año, ISBN y titulo no pueden quedar vacios");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new ErroresServicio("Los espacios año, ISBN y titulo no pueden quedar vacios");
        }
        if (anio == null) {
            throw new ErroresServicio("Los espacios año, ISBN y titulo no pueden quedar vacios");
        }
    }

}
