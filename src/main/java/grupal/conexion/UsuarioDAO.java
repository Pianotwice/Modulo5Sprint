package grupal.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grupal.modelo.Usuario;

public class UsuarioDAO {
    private Connection conexion;

    public UsuarioDAO() {
        // Obtener la conexión al crear una instancia de UsuarioDAO
        conexion = ConexionBD.getInstancia().getConexion();
    }

    // Métodos CRUD
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT idusuario, run, nombre, apellido, fechanacimiento FROM usuario";

        try (PreparedStatement statement = conexion.prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Usuario usuario = new Usuario();
                usuario.setId(resultSet.getInt("idusuario"));
                usuario.setRun(resultSet.getString("run"));
                usuario.setNombre(resultSet.getString("nombre"));
                usuario.setApellido(resultSet.getString("apellido"));
                usuario.setFechaNacimiento(resultSet.getString("fechanacimiento"));
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int id) {
        Usuario usuario = null;
        String consulta = "SELECT idusuario, run, nombre, apellido, fechanacimiento FROM usuario WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    usuario = new Usuario();
                    usuario.setId(resultSet.getInt("idusuario"));
                    usuario.setRun(resultSet.getString("run"));
                    usuario.setNombre(resultSet.getString("nombre"));
                    usuario.setApellido(resultSet.getString("apellido"));
                    usuario.setFechaNacimiento(resultSet.getString("fechanacimiento"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }

    public void agregarUsuario(Usuario usuario) {
        String consulta = "INSERT INTO usuario (run, nombre, apellido, fechanacimiento) VALUES (?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario.getRun());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getFechaNacimiento());

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarUsuario(Usuario usuario) {
        String consulta = "UPDATE usuario SET run = ?, nombre = ?, apellido = ?, fechanacimiento = ? WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, usuario.getRun());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getFechaNacimiento());
            statement.setInt(5, usuario.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarUsuario(int id) {
        String consulta = "DELETE FROM usuario WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}