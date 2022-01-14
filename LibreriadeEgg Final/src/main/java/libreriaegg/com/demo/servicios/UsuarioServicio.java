package libreriaegg.com.demo.servicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import libreriaegg.com.demo.entidades.Foto;

import libreriaegg.com.demo.entidades.Usuario;
import libreriaegg.com.demo.enums.Rol;
import libreriaegg.com.demo.errores.ErroresServicio;

import libreriaegg.com.demo.repositorios.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UsuarioServicio implements UserDetailsService {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private FotoService fotoServicio;

    @Transactional
    public void registrar(MultipartFile archivo, String nombre, String apellido, String mail, String clave, String clave2) throws ErroresServicio {

        validar(nombre, apellido, mail, clave, clave2);

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setMail(mail);
        usuario.setRol(Rol.USUARIO);

        String encriptada = new BCryptPasswordEncoder().encode(clave);
        usuario.setClave(encriptada);

        usuario.setAlta(new Date());

        Foto foto = fotoServicio.guardar(archivo);
        usuario.setFoto(foto);

        usuarioRepositorio.save(usuario);

    }

    @Transactional
    public void modificar(MultipartFile archivo, String id, String nombre, String apellido, String mail, String clave, String clave2) throws ErroresServicio {

        validar(nombre, apellido, mail, clave, clave2);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setApellido(apellido);
            usuario.setNombre(nombre);
            usuario.setMail(mail);
            String encriptada = new BCryptPasswordEncoder().encode(clave);
            usuario.setClave(encriptada);

            String idFoto = null;
            if (usuario.getFoto() != null) {
                idFoto = usuario.getFoto().getId();
            }

            Foto foto = fotoServicio.actualizar(idFoto, archivo);
            usuario.setFoto(foto);

            usuarioRepositorio.save(usuario);
        } else {

            throw new ErroresServicio("No se encontró el usuario solicitado");
        }

    }

    @Transactional
    public void deshabilitar(String id) throws ErroresServicio {

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setBaja(new Date());
            usuarioRepositorio.save(usuario);
        } else {

            throw new ErroresServicio("No se encontró el usuario solicitado");
        }

    }

    @Transactional
    public void habilitar(String id) throws ErroresServicio {

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            usuario.setBaja(null);
            usuarioRepositorio.save(usuario);
        } else {

            throw new ErroresServicio("No se encontró el usuario solicitado");
        }

    }

    @Transactional
    public void cambiarRol(String id) throws ErroresServicio {

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();

            if (usuario.getRol().equals(Rol.USUARIO)) {

                usuario.setRol(Rol.ADMIN);

            } else if (usuario.getRol().equals(Rol.ADMIN)) {
                usuario.setRol(Rol.USUARIO);
            }
        }
    }

    public void validar(String nombre, String apellido, String mail, String clave, String clave2) throws ErroresServicio {

        if (nombre == null || nombre.isEmpty()) {
            throw new ErroresServicio("El nombre del usuario no puede ser nulo");
        }

        if (apellido == null || apellido.isEmpty()) {
            throw new ErroresServicio("El apellido del usuario no puede ser nulo");
        }

        if (mail == null || mail.isEmpty()) {
            throw new ErroresServicio("El mail no puede ser nulo");
        }

        if (clave == null || clave.isEmpty() || clave.length() <= 6) {
            throw new ErroresServicio("Clave no puede ser nula y debe tener 6 digitos");
        }
        if (!clave.equals(clave2)) {
            throw new ErroresServicio("Las claves deben ser iguales");
        }

    }

    @Override
    public UserDetails loadUserByUsername(String mail) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepositorio.buscarPorMail(mail);

        if (usuario != null) {

            List<GrantedAuthority> permisos = new ArrayList<>();

            //Creo una lista de permisos! 
            GrantedAuthority p1 = new SimpleGrantedAuthority("ROLE_" + usuario.getRol());
            permisos.add(p1);

            //Esto me permite guardar el OBJETO USUARIO LOG, para luego ser utilizado
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);

            session.setAttribute("usuariosession", usuario); // llave + valor

            User user = new User(usuario.getMail(), usuario.getClave(), permisos);

            return user;

        } else {
            return null;
        }

    }

    @Transactional(readOnly = true)
    public Usuario buscarPorId(String id) throws ErroresServicio {

        Optional<Usuario> respuesta = usuarioRepositorio.findById(id);
        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            return usuario;
        } else {

            throw new ErroresServicio("No se encontró el usuario solicitado");
        }

    }

    @Transactional(readOnly = true)
    public List<Usuario> todosLosUsuarios() {

        return usuarioRepositorio.findAll();

    }

}
