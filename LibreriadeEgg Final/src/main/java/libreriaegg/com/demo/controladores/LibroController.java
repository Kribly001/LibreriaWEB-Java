package libreriaegg.com.demo.controladores;

import java.util.List;
import libreriaegg.com.demo.entidades.Libro;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.servicios.AutorService;
import libreriaegg.com.demo.servicios.EditorialService;
import libreriaegg.com.demo.servicios.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class LibroController {

    @Autowired
    private AutorService autorService;
    @Autowired
    private LibroService libroService;
    @Autowired
    private EditorialService editorialService;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/inicio/autor")
    public String autor() {
        return "autor.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @PostMapping("/inicio/autor/cargarAutor")
    public String cargarAutor(ModelMap modelo, @RequestParam(required = false) Long ISBN, @RequestParam String titulo, @RequestParam(required = false) Integer anio, @RequestParam String nombre, @RequestParam String nombreEditorial, @RequestParam (required = false)  Integer ejemplares,@RequestParam (required = false) Integer ejemplaresPrestados,@RequestParam (required = false) Integer ejemplaresRestantes) {
        System.out.println("ISBN" + ISBN + "TITULO" + titulo + "AÑO" + anio + "NOMBRE" + nombre + "NOMBRE EDITORIAL" + nombreEditorial);
        try {
            libroService.agregarLibro(ISBN, titulo, anio,ejemplares,ejemplaresPrestados,ejemplaresRestantes, autorService.agregarAutor(nombre), editorialService.agregarEditorial(nombreEditorial));

            modelo.put("exito", "Registro Exitoso!");
            return "autor.html";
        } catch (ErroresServicio ex) {

            modelo.put("error", "Error al guardar formulario, faltan datos");

            return "autor.html";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/lista")
    public String lista(ModelMap modelo) {
        List<Libro> libroslist = libroService.listarLibros();
        modelo.addAttribute("libros", libroslist);
        return "tablas.html";

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/modificar/{id}")
    public String modificar(ModelMap model, @PathVariable String id, ModelMap modelo) {
        modelo.put("libro", libroService.getOne(id));
        return "modificarAutor.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @PostMapping("/modificar/{id}")
    public String modificar(ModelMap modelo,@PathVariable String id, @RequestParam(required = false) Long ISBN, @RequestParam String titulo, @RequestParam(required = false) Integer anio,@RequestParam (required = false)  Integer ejemplares,@RequestParam (required = false) Integer ejemplaresPrestados,@RequestParam (required = false) Integer ejemplaresRestantes) {
        try {
            libroService.modificar(id, ISBN, titulo, anio, ejemplares, ejemplaresPrestados, ejemplaresRestantes);
            modelo.put("exito", "Modificacion exitosa");

            return "inicio.html";
        } catch (ErroresServicio ex) {
            modelo.put("error", "Falto algun dato");
            return "modificarAutor.html";
        }
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/baja/{id}")
    public String baja(@PathVariable String id) {

        try {
            libroService.baja(id);
            return "redirect:/lista";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/alta/{id}")
    public String alta(@PathVariable String id) {

        try {
            libroService.alta(id);
            return "redirect:/lista";
        } catch (Exception e) {
            return "redirect:/";
        }
    }

    @PreAuthorize("hasAnyRole('ROLE_USUARIO')")
    @GetMapping("/libroexito")
    public String libroexito() {
        return "exitolibroobtenido.html";
    }
}
