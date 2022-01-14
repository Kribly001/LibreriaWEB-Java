package libreriaegg.com.demo.controladores;

import java.util.List;
import libreriaegg.com.demo.entidades.Autor;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.servicios.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AutorController {

    @Autowired
    private AutorService autorService;


    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/autores")
    public String listaeditorial(ModelMap modelo) throws Exception {
        List<Autor> autoreslist = autorService.listarAutores();
        modelo.addAttribute("autores", autoreslist);
        return "autores.html";

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/autores/cargarAutor")
    public String agregarAutor(ModelMap modelo, @RequestParam String nombre) {
        System.out.println("Autor:" + nombre);
        try {
            autorService.agregarAutor(nombre);
            modelo.put("exito", "Registro Exitoso!");
            return "exito2.html";
        } catch (ErroresServicio ex) {

            modelo.put("error", "Error al guardar registro, no se ingreso ningun Nombre");

            return "exito2.html";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/bajaautor/{id}")
    public String baja(@PathVariable String id) {

        try {
            autorService.baja(id);
            return "redirect:/autores";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/altaautor/{id}")
    public String alta(@PathVariable String id) {

        try {
            autorService.alta(id);
            return "redirect:/autores";
        } catch (Exception e) {
            return "redirect:/";
        }
    }

}
