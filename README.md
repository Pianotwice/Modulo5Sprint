# M5Grupal01
Actividad grupal 01 del módulo 5 en el Bootcamp Full Stack Java

# Codigo para probar la conexion a la base de datos
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/modulo5?useSSL=false", "adminmodulo5", "1234567a.");
			
			if (conn != null) {
				System.out.println("\tConexion correcta.");
			} else {
				System.out.println("\tFalló la conexion.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
