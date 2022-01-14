package libreriaegg.com.demo.controladores;

import java.util.List;
import libreriaegg.com.demo.entidades.Usuario;
import libreriaegg.com.demo.servicios.UsuarioServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UsuarioServicio usuarioServicio;


    @GetMapping("/dashboard")
    public String inicioAdmin(ModelMap modelo) {

        List<Usuario> usuarios = usuarioServicio.todosLosUsuarios();

        modelo.put("usuarios", usuarios);

        return "dashboard.html";
    }

    @GetMapping("/habilitar/{id}")
    public String habilitar(ModelMap modelo, @PathVariable String id) {
        try {
            usuarioServicio.habilitar(id);
            return "redirect:/admin/dashboard";
        } catch (Exception e) {
            modelo.put("error", "No fue posible habilitar");
            return "dashboard.html";
        }
    }


    @GetMapping("/deshabilitar/{id}")
    public String deshabilitar(ModelMap modelo, @PathVariable String id) {
        try {
            usuarioServicio.deshabilitar(id);
            return "redirect:/admin/dashboard";
        } catch (Exception e) {
            modelo.put("error", "No fue posible deshabilitar");
            return "dashboard.html";
        }
    }


    @GetMapping("/cambiar_rol/{id}")
    public String cambiarRol(ModelMap modelo, @PathVariable String id) {
        try {
            usuarioServicio.cambiarRol(id);
            modelo.put("exito", "Rol modificado con Exito!");
            return "redirect:/admin/dashboard";
        } catch (Exception e) {
            modelo.put("error", "No fue posible reasignar el rol");
            return "dashboard.html";
        }
    }

}
