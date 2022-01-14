package libreriaegg.com.demo.controladores;

import java.util.List;
import libreriaegg.com.demo.entidades.Usuario;

import libreriaegg.com.demo.errores.ErroresServicio;

import libreriaegg.com.demo.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class PortalControlador {

    @Autowired
    private UsuarioServicio usuarioservicio;

    @GetMapping("/")
    public String index(ModelMap modelo) {
        List<Usuario> usuariosActivos = usuarioservicio.todosLosUsuarios();
        //Recordar que utilizo el modelo,para viajar con la llave usuarios al HTML la lista usuariosactivos
        modelo.addAttribute("usuarios", usuariosActivos);
        return "index.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/inicio")
    public String inicio(ModelMap modelo) {
        List<Usuario> usuarios = usuarioservicio.todosLosUsuarios();

        modelo.addAttribute("usuarios", usuarios);

        return "inicio.html";
    }
    
    

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, @RequestParam(required = false) String logout, ModelMap model) {
        if (error != null) {
            model.put("error", "Usuario o clave incorrectos");
        }
        if (logout != null) {
            model.put("logout", "Ha salido correctamente.");
        }
        return "login.html";
    }

    @GetMapping("/registro")
    public String registro(ModelMap modelo) {

        return "registro.html";
    }

    @PostMapping("/registrar")
    public String registrar(ModelMap modelo, MultipartFile archivo, @RequestParam String nombre, @RequestParam String apellido, @RequestParam String mail, @RequestParam String clave1, @RequestParam String clave2) {

        try {
            usuarioservicio.registrar(archivo, nombre, apellido, mail, clave1, clave2);
              modelo.put("exito", "Registro Exitoso, Bienvenido!");
            return "exito.html";
        } catch (ErroresServicio ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("apellido", apellido);
            modelo.put("mail", mail);
            modelo.put("clave1", clave1);
            modelo.put("clave2", clave2);
            return "registro.html";
        }

    }

}
//    @GetMapping("/inicio/tablas")
//    public String modificar() {
//        return "tablas.html";
//    }

