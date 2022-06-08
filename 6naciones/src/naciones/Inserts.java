package naciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Inserts {
	
	
	public static void insertarArbitros(int id_arbitro,int peso, String nombreA, String apellidoA, int precisionA, String acta) {
		

		
		try {
			
			Connection conexion;

            String basedatos = "naciones";
            String host = "localhost";
            String port = "3306";
            String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
            String user = "root";
            String pwd = "";

            //Class.forName("com.mysql.jdbc.Driver");    // No necesario desde SE 6.0
            //Class.forName("com.mysql.cj.jdbc.Driver"); // para MySQL 8.0, no necesario
            conexion = DriverManager.getConnection(urlConnection, user, pwd);

            // Hace commit automaticamente
            conexion.setAutoCommit(true);

            // Creo una sentencia
         //   Statement statement = conexion.createStatement();
			
			String SQL = "INSERT INTO arbitro VALUES (NULL,?,?,?,?,?)";
			

            // SQL para crear una direccion
          

            PreparedStatement sentencia = conexion.prepareStatement(SQL);

            
            sentencia.setInt(1, peso);
            sentencia.setString(2, nombreA);
            sentencia.setString(3, apellidoA);
            sentencia.setInt(4, precisionA);
            sentencia.setString(5, acta);

            // Inserto una direccion
            sentencia.executeUpdate();

           
            
            System.out.println("Llamada agregada con éxito a la base de datos.");
            
            sentencia.close();
            conexion.close();
			
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
			
		}
		
	}
	
	
	public static void insertarJugadores (int id_jugador, String nombreJ, String apellidoJ, int equipo, int velocidad, int fuerza, int resistencia, int peso) {
		
try {
			
			Connection conexion;

            String basedatos = "naciones";
            String host = "localhost";
            String port = "3306";
            String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
            String user = "root";
            String pwd = "";

            
            conexion = DriverManager.getConnection(urlConnection, user, pwd);

            // Hace commit automaticamente
            conexion.setAutoCommit(true);

            // Creo una sentencia
         //   Statement statement = conexion.createStatement();
			
			String SQL = "INSERT INTO jugador VALUES (NULL,?,?,?,?,?,?,?)";
			

            // SQL para crear una direccion
          

            PreparedStatement sentencia = conexion.prepareStatement(SQL);

            
            sentencia.setString(1, nombreJ);
            sentencia.setString(2, apellidoJ);
            sentencia.setInt(3, equipo);
            sentencia.setInt(4, velocidad);
            sentencia.setInt(5, fuerza);
            sentencia.setInt(6, resistencia);
            sentencia.setInt(7, peso);

            // Inserto una direccion
            sentencia.executeUpdate();

           
            
            System.out.println("Llamada agregada con éxito a la base de datos.");
            
            sentencia.close();
            conexion.close();
			
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
			
		}
		
	}
	
	public static void insertarEntrenadores( int id_entrenador, String nombreE, String apellidoE, int peso, int experiencia, int equipo ) {
		
try {
			
			Connection conexion;

            String basedatos = "naciones";
            String host = "localhost";
            String port = "3306";
            String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
            String user = "root";
            String pwd = "";

            //Class.forName("com.mysql.jdbc.Driver");    // No necesario desde SE 6.0
            //Class.forName("com.mysql.cj.jdbc.Driver"); // para MySQL 8.0, no necesario
            conexion = DriverManager.getConnection(urlConnection, user, pwd);

            // Hace commit automaticamente
            conexion.setAutoCommit(true);

            // Creo una sentencia
         //   Statement statement = conexion.createStatement();
			
			String SQL = "INSERT INTO entrenador VALUES (NULL,?,?,?,?,?)";
			

            // SQL para crear una direccion
          

            PreparedStatement sentencia = conexion.prepareStatement(SQL);

           
            sentencia.setString(1, nombreE);
            sentencia.setString(2, apellidoE);
            sentencia.setInt(3, peso);
            sentencia.setInt(4, experiencia);
            sentencia.setInt(5, equipo);
         
           

            // Inserto una direccion
            sentencia.executeUpdate();

           
            
            System.out.println("Llamada agregada con éxito a la base de datos.");
            
            sentencia.close();
            conexion.close();
			
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
			
		}
		
	}
	
	public static void insertarEquipos (int id_equipo, String nombre_nacion, int partidos_jugados, int partidos_perdidos, int partidos_empatados, int partidos_ganados) {
		
try {
			
			Connection conexion;

            String basedatos = "naciones";
            String host = "localhost";
            String port = "3306";
            String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
            String user = "root";
            String pwd = "";

            //Class.forName("com.mysql.jdbc.Driver");    // No necesario desde SE 6.0
            //Class.forName("com.mysql.cj.jdbc.Driver"); // para MySQL 8.0, no necesario
            conexion = DriverManager.getConnection(urlConnection, user, pwd);

            // Hace commit automaticamente
            conexion.setAutoCommit(true);

            // Creo una sentencia
         //   Statement statement = conexion.createStatement();
			
			String SQL = "INSERT INTO equipo VALUES (NULL,?,?,?,?,?)";
			

            // SQL para crear una direccion
          

            PreparedStatement sentencia = conexion.prepareStatement(SQL);

           
            sentencia.setString(1, nombre_nacion);
            sentencia.setInt(2, partidos_jugados);
            sentencia.setInt(3, partidos_perdidos);
            sentencia.setInt(4, partidos_empatados);
            sentencia.setInt(5, partidos_ganados);
         
           

            // Inserto una direccion
            sentencia.executeUpdate();

           
            
            System.out.println("Llamada agregada con éxito a la base de datos.");
            
            sentencia.close();
            conexion.close();
			
		}catch (SQLException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
			
		}
		
	}
	public static void insertarEstadios (int id_estadio, int registro_partidos, int capacidad, String NOMBRE, int partido) {
		
		try {
					
					Connection conexion;

		            String basedatos = "naciones";
		            String host = "localhost";
		            String port = "3306";
		            String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		            String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
		            String user = "root";
		            String pwd = "";

		            
		            conexion = DriverManager.getConnection(urlConnection, user, pwd);

		            // Hace commit automaticamente
		            conexion.setAutoCommit(true);

		            // Creo una sentencia
		         //   Statement statement = conexion.createStatement();
					
					String SQL = "INSERT INTO estadio VALUES (NULL,?,?,?,?)";
					

		            // SQL para crear una direccion
		          

		            PreparedStatement sentencia = conexion.prepareStatement(SQL);

		            sentencia.setInt(1, registro_partidos);
		            sentencia.setInt(2, capacidad);
		            sentencia.setString(3, NOMBRE);
		            sentencia.setInt(4, partido);
		          
		           
		           
		            // Inserto una direccion
		            sentencia.executeUpdate();

		           
		            
		            System.out.println("Llamada agregada con éxito a la base de datos.");
		            
		            sentencia.close();
		            conexion.close();
					
				}catch (SQLException e){
					e.printStackTrace();
					System.out.println(e.getMessage());
					System.out.println("Error!, la llamada no pudo ser agregada a la base de datos.");
					
				}
				
			}

}
