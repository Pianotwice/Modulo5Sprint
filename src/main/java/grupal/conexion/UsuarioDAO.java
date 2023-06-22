package grupal.conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import grupal.modelo.Administrativo;
import grupal.modelo.Cliente;
import grupal.modelo.Profesional;
import grupal.modelo.Usuario;

public class UsuarioDAO {
    private Connection conexion;

    public UsuarioDAO() {
        // Obtener la conexión al crear una instancia de UsuarioDAO
        conexion = ConexionBD.getInstancia().getConexion();
    }

    // Métodos CRUD para Cliente
    public void agregarCliente(Cliente cliente) {
        String consulta = "INSERT INTO usuario (run, nombre, apellido, fechanacimiento, edad, afp, direccion, comuna, telefono, sistemasalud) "
        		+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, cliente.getRun());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getFechaNacimiento());
            statement.setInt(5, cliente.getEdad());
            statement.setString(6, cliente.getAfp());
            statement.setString(7, cliente.getDireccion());
            statement.setString(8, cliente.getComuna());
            statement.setString(9, cliente.getTelefono());
            statement.setInt(10, cliente.getSistemaSalud());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarCliente(Cliente cliente) {
        String consulta = "UPDATE usuario SET run = ?, nombre = ?, apellido = ?, fechanacimiento = ?, edad = ?, afp = ?, direccion = ?, comuna = ?, telefono = ?, sistemasalud = ? WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, cliente.getRun());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getApellido());
            statement.setString(4, cliente.getFechaNacimiento());
            statement.setInt(5, cliente.getEdad());
            statement.setString(6, cliente.getAfp());
            statement.setString(7, cliente.getDireccion());
            statement.setString(8, cliente.getComuna());
            statement.setString(9, cliente.getTelefono());
            statement.setInt(10, cliente.getSistemaSalud());
            statement.setInt(11, cliente.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarCliente(int id) {
        String consulta = "DELETE FROM usuario WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Métodos CRUD para Profesional
    public void agregarProfesional(Profesional profesional) {
        String consulta = "INSERT INTO usuario (run, nombre, apellido, fechanacimiento, titulo, fechaingreso) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, profesional.getRun());
            statement.setString(2, profesional.getNombre());
            statement.setString(3, profesional.getApellido());
            statement.setString(4, profesional.getFechaNacimiento());
            statement.setString(5, profesional.getTitulo());
            statement.setString(6, profesional.getFechaIngreso());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarProfesional(Profesional profesional) {
        String consulta = "UPDATE usuario SET run = ?, nombre = ?, apellido = ?, fechanacimiento = ?, titulo = ?, fechaingreso = ? WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, profesional.getRun());
            statement.setString(2, profesional.getNombre());
            statement.setString(3, profesional.getApellido());
            statement.setString(4, profesional.getFechaNacimiento());
            statement.setString(5, profesional.getTitulo());
            statement.setString(6, profesional.getFechaIngreso());
            statement.setInt(7, profesional.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarProfesional(int id) {
        String consulta = "DELETE FROM usuario WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Métodos CRUD para Administrativo
    public void agregarAdministrativo(Administrativo administrativo) {
        String consulta = "INSERT INTO usuario (run, nombre, apellido, fechanacimiento, area, expprevia) VALUES (?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, administrativo.getRun());
            statement.setString(2, administrativo.getNombre());
            statement.setString(3, administrativo.getApellido());
            statement.setString(4, administrativo.getFechaNacimiento());
            statement.setString(5, administrativo.getArea());
            statement.setString(6, administrativo.getExpPrevia());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void actualizarAdministrativo(Administrativo administrativo) {
        String consulta = "UPDATE usuario SET run = ?, nombre = ?, apellido = ?, fechanacimiento = ?, area = ?, expprevia = ? WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setString(1, administrativo.getRun());
            statement.setString(2, administrativo.getNombre());
            statement.setString(3, administrativo.getApellido());
            statement.setString(4, administrativo.getFechaNacimiento());
            statement.setString(5, administrativo.getArea());
            statement.setString(6, administrativo.getExpPrevia());
            statement.setInt(7, administrativo.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void eliminarAdministrativo(int id) {
        String consulta = "DELETE FROM usuario WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Métodos generales
    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String consulta = "SELECT idusuario, run, nombre, apellido, fechanacimiento, edad, afp, direccion, comuna, telefono, sistemasalud, titulo, fechaingreso, area, expprevia FROM usuario";

        try (PreparedStatement statement = conexion.prepareStatement(consulta);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Usuario usuario = null;

                int edad = resultSet.getInt("edad");
                String afp = resultSet.getString("afp");
                String direccion = resultSet.getString("direccion");
                String comuna = resultSet.getString("comuna");
                String telefono = resultSet.getString("telefono");
                int sistemaSalud = resultSet.getInt("sistemasalud");

                String titulo = resultSet.getString("titulo");
                String fechaIngreso = resultSet.getString("fechaingreso");

                String area = resultSet.getString("area");
                String expPrevia = resultSet.getString("expprevia");

                int id = resultSet.getInt("idusuario");
                String run = resultSet.getString("run");
                String nombre = resultSet.getString("nombre");
                String apellido = resultSet.getString("apellido");
                String fechaNacimiento = resultSet.getString("fechanacimiento");

                if (edad != 0) {
                    Cliente cliente = new Cliente(id, run, nombre, apellido, fechaNacimiento, edad, afp, direccion, comuna, telefono, sistemaSalud);
                    usuario = cliente;
                } else if (titulo != null) {
                    Profesional profesional = new Profesional(id, run, nombre, apellido, fechaNacimiento, titulo, fechaIngreso);
                    usuario = profesional;
                } else if (area != null) {
                    Administrativo administrativo = new Administrativo(id, run, nombre, apellido, fechaNacimiento, area, expPrevia);
                    usuario = administrativo;
                }

                if (usuario != null) {
                    usuarios.add(usuario);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    public Usuario obtenerUsuarioPorId(int id) {
        Usuario usuario = null;
        String consulta = "SELECT idusuario, run, nombre, apellido, fechanacimiento, edad, afp, direccion, comuna, telefono, sistemasalud, titulo, fechaingreso, area, expprevia FROM usuario WHERE idusuario = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consulta)) {
            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int edad = resultSet.getInt("edad");
                    String afp = resultSet.getString("afp");
                    String direccion = resultSet.getString("direccion");
                    String comuna = resultSet.getString("comuna");
                    String telefono = resultSet.getString("telefono");
                    int sistemaSalud = resultSet.getInt("sistemasalud");

                    String titulo = resultSet.getString("titulo");
                    String fechaIngreso = resultSet.getString("fechaingreso");

                    String area = resultSet.getString("area");
                    String expPrevia = resultSet.getString("expprevia");

                    String run = resultSet.getString("run");
                    String nombre = resultSet.getString("nombre");
                    String apellido = resultSet.getString("apellido");
                    String fechaNacimiento = resultSet.getString("fechanacimiento");

                    if (edad != 0) {
                        Cliente cliente = new Cliente(id, run, nombre, apellido, fechaNacimiento, edad, afp, direccion, comuna, telefono, sistemaSalud);
                        usuario = cliente;
                    } else if (titulo != null) {
                        Profesional profesional = new Profesional(id, run, nombre, apellido, fechaNacimiento, titulo, fechaIngreso);
                        usuario = profesional;
                    } else if (area != null) {
                        Administrativo administrativo = new Administrativo(id, run, nombre, apellido, fechaNacimiento, area, expPrevia);
                        usuario = administrativo;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return usuario;
    }
}
