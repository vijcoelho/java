import dao.UsuarioDAO;
import entidades.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario u = new Usuario();
        u.setNome("Rodrigo");
        u.setLogin("Rod12");
        u.setSenha("Rod12345");
        u.setEmail("Rod@gmail.com");

        new UsuarioDAO().cadastrarUsuario(u);
    }
}
