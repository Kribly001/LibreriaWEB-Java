package libreriaegg.com.demo.controladores;

import java.util.logging.Level;
import java.util.logging.Logger;
import libreriaegg.com.demo.entidades.Usuario;
import libreriaegg.com.demo.errores.ErroresServicio;
import libreriaegg.com.demo.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foto")
public class FotoController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN','ROLE_USUARIO')")
    @GetMapping("/usuario/{id}")
    public ResponseEntity<byte[]> fotoUsuario(@PathVariable String id) {

        try {
            Usuario usuario = usuarioServicio.buscarPorId(id);
            if (usuario.getFoto() == null) {
                throw new ErroresServicio("El usuario no tiene una foto asignada.");
            }
            byte[] foto = usuario.getFoto().getContenido();

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.IMAGE_JPEG);

            return new ResponseEntity<>(foto, headers, HttpStatus.OK);
        } catch (ErroresServicio ex) {
            Logger.getLogger(FotoController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
