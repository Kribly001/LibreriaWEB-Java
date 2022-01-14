package libreriaegg.com.demo.controladores;

import java.util.Collection;
import java.util.List;
import libreriaegg.com.demo.entidades.Editorial;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.servicios.EditorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EditorialController {

    @Autowired
    private EditorialService editorialService;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/editorial")
    public String listaeditorial(ModelMap modelo) throws Exception {
        List<Editorial> editoriallist = editorialService.listarEditoriales();
        modelo.addAttribute("editoriales", editoriallist);
        return "editoriales.html";

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/editorial/cargareditorial")
    public String agregarEditorial(ModelMap modelo, @RequestParam String nombreEditorial) {
        System.out.println("Editorial:" + nombreEditorial);
        try {
            editorialService.agregarEditorial(nombreEditorial);
            modelo.put("exito", "Registro Exitoso!");
            return "exito2.html";
        } catch (ErroresServicio ex) {

            modelo.put("error", "Error al guardar regirstro, no se ingreso ningun Editorial" );

            return "exito2.html";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/bajaeditorial/{id}")
    public String baja(@PathVariable String id) {

        try {
            editorialService.baja(id);
            return "redirect:/editorial";
        } catch (Exception e) {
            return "redirect:/";
        }

    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/altaeditorial/{id}")
    public String alta(@PathVariable String id) {

        try {
            editorialService.alta(id);
            return "redirect:/editorial";
        } catch (Exception e) {
            return "redirect:/";
        }
    }

}
