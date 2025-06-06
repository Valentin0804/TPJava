package main;

import dao.UsuarioDAO;
import modelo.Usuario;

public class Main {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // Crear usuario nuevo
        Usuario nuevo = new Usuario("Lucía", "lucia@mail.com", "secreta", true);
        dao.agregarUsuario(nuevo);

        // Mostrar usuario por ID
        Usuario buscado = dao.obtenerPorId(nuevo.getId());
        System.out.println("Usuario encontrado: " + buscado.getNombre());

        // Listar todos
        System.out.println("Listado:");
        for (Usuario u : dao.listarUsuarios()) {
            System.out.println(u.getId() + " - " + u.getNombre());
        }

        // Modificar
        nuevo.setNombre("Lucía Gómez");
        dao.modificarUsuario(nuevo);

        // Eliminar
        // dao.eliminarUsuario(nuevo.getId());
    }
}
