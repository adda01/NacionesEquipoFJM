package naciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	public static void competicion(ArrayList<Partido> partidos,ArrayList<Arbitro> arbitros,ArrayList<Estadio> estadios) {
		
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < partidos.size(); i++) {
			
			a = (int)Math.floor(Math.random()*5);
			b = (int)Math.floor(Math.random()*3);

			estadios.get(a).addPartido(partidos.get(i));
			partidos.get(i).jugar(estadios.get(a),arbitros.get(b));

		}
		
	} 
	
	public static void crearEstadios(ArrayList<Estadio> estadios) {
		
		String nombre;
		int capacidad = 0;
	     ArrayList<Partido> partidos = new ArrayList<Partido>();
		
		for (int i = 0; i < 6; i++) {
			
			nombre = "estadio" + i;
			capacidad = (int)Math.floor(Math.random()*10000);
			
			Estadio estadio= new Estadio(partidos,capacidad,nombre);
			estadios.add(estadio);
		}

	}
	
	public static void crearPartidos(ArrayList<Partido> partidos, ArrayList<Equipo> equipos, ArrayList<Arbitro> arbitros){
		
	     for (int i = 0; i < equipos.size(); i++) {
	    	 
	    	 for (int j = i+1; j < equipos.size(); j++) {
	    		 	 
	    		 Partido partido = new Partido(equipos.get(i),equipos.get(j),arbitros);
	    		 System.out.println(partido);
	    		 partidos.add(partido);
			}
	    	 
		}
	     		
	}
	
	public static void ponerAlineacion (ArrayList<Entrenador> entrenadores) {
		 for (Entrenador entrenador : entrenadores) {
             entrenador.ponerAlineacion();
             }
		
	}

	public static void crearArbitros(ArrayList<Arbitro> arbitros) {
		
		String nombreA;
		String apellidoA;
		String nombre;
		int precisionA ;
		double peso;
		String acta;
		
		for (int i = 0; i < 4; i++) {
			
			nombreA = "nombre" + i;
			apellidoA = "apellido" + i;
			nombre = nombreA + apellidoA;
			peso = Math.floor(Math.random()*100);
			precisionA=(int) Math.floor(Math.random()*100);
			acta = "acta" + i;
			
			Arbitro arbitro= new Arbitro(nombreA,apellidoA,nombre,precisionA,peso,acta);
			arbitros.add(arbitro);
		}
		 for (Arbitro arbitro : arbitros) {
	            System.out.println(arbitro);
	            }
				if(arbitros.size()==4) {
			 
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
						   
						   conexion.setAutoCommit(true);
						   
						   Statement sentencia = conexion.createStatement();
						   
						   sentencia.executeQuery("SELECT * FROM arbitro");
						   
						
						 
						   
						 
						  
						   sentencia.close();
						   conexion.close();
						   
						
						
					}
					
					catch(SQLException ex) {
						   
						   System.out.println(ex.getMessage());
					
				}
					
					@SuppressWarnings("resource")
					   Scanner sc = new Scanner(System.in);
					   sc.useDelimiter("\n");
					   sc.useLocale(Locale.US);
				}
		
	}
	
	public static void crearEntrenadores(ArrayList<Entrenador> entrenadores) {
		
		String nombreE;
		String apellidoE;
		String nombre;
		int experiencia;
		double peso;
		
		for (int i = 0; i < 30; i++) {
			
			nombreE = "nombre" + i;
			apellidoE = "apellido" + i;
			nombre = nombreE + apellidoE;
			peso = Math.floor(Math.random()*100); 
			experiencia=(int) Math.floor(Math.random()*100);
			
			Entrenador entrenador= new Entrenador(nombreE,apellidoE,nombre,peso,experiencia);
			entrenadores.add(entrenador);
		}
		if(entrenadores.size() == 30) {
			
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
	            
	            conexion.setAutoCommit(true);
	            
	            Statement sentencia = conexion.createStatement();
	            
	            sentencia.executeQuery("SELECT * FROM entrenador");
	            
	           // Statement sentencia2 = conexion.createStatement();
	            
	            //sentencia2.executeQuery("INSERT INTO entrenador  ( 'nombreE','apellidoE','peso','experiencia'");
	           
	           // sentencia2.close();
	            sentencia.close();
	            conexion.close();
				
			
			}
			
			catch(SQLException ex) {
            	
            	System.out.println(ex.getMessage());
            }

			 @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
	            sc.useDelimiter("\n");
	            sc.useLocale(Locale.US);
			
			}
		
		
		
	}
	
	public static void crearJugadores(ArrayList<Jugador> jugadores) {
		
		String nombreJ;
		String apellidoJ;
		String nombre;
		int fuerza;
		int resistencia;
		int velocidad;
		int media;
		double peso;
		
		for (int i = 0; i < 180; i++) {
			
			nombreJ = "nombre" + i;
			apellidoJ = "apellido" + i;
			 nombre = nombreJ + apellidoJ;
			 peso = Math.floor(Math.random()*100);
			 velocidad =(int) Math.floor(Math.random()*100);
			 fuerza =(int) Math.floor(Math.random()*100);
			 resistencia =(int) Math.floor(Math.random()*100);
			 media = (fuerza + resistencia + velocidad) / 3;
			
			
			Jugador jugador = new Jugador(nombreJ,apellidoJ,nombre,peso,velocidad,fuerza,resistencia,media);
			jugadores.add(jugador);
			if(jugadores.size()==180) {
				
				try {
						 Connection conexion;
	
							String basedatos = "naciones";
							String host = "localhost";
							String port = "3306";
							String parAdic = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
							String urlConnection = "jdbc:mysql://" + host + ":" + port + "/" + basedatos + parAdic;
							String user = "root";
							String pwd = "";
							
	//			            Connection connection = DriverManager.getConnection(
	//			            	    "jdbc:mariadb://localhost:3306/database_name",
	//			            	    "user", "password"
	//			            	);
							
							conexion = DriverManager.getConnection(urlConnection, user, pwd);
							
							conexion.setAutoCommit(true);
							
							Statement sentencia = conexion.createStatement();
							
							sentencia.executeQuery("SELECT * FROM jugador");
							
						//    Statement sentencia2 = conexion.createStatement();
							
						  //  sentencia2.executeQuery("INSERT INTO jugador ('nombreJ','apellidoJ','fuerza','resistencia','velocidad','peso'");
						   
						  //  sentencia2.close();
							sentencia.close();
							conexion.close();
					}
							
							catch(SQLException ex) {
								
								System.out.println(ex.getMessage());
							}
	
	
						   //  Creo el scanner
						   
							Scanner sc = new Scanner(System.in);
							sc.useDelimiter("\n");
							sc.useLocale(Locale.US);
							
							
						  
					
					}
				
				
				}
			}
			

			
		
	
    public static ArrayList<Equipo> crearEquipos(ArrayList<Jugador> jugadores, ArrayList<Entrenador> entrenadores) {
        ArrayList<Equipo> equipos = new ArrayList<>();
        if (jugadores.size() > 1 && entrenadores.size() > 1) {
            int contJugadores = 0;
            int contEntrenadores = 0;
            int contEquipos = 0;
            for (int i = 0; i < 6; i++) {
                equipos.add(new Equipo());
                contEquipos++;
                System.out.println(contEquipos++);
                for (int j = 0; j < 30; j++) {
                    equipos.get(i).addJugador(jugadores.get(contJugadores));
                    jugadores.get(contJugadores).setEquipo(equipos.get(i));
                    contJugadores++;
                }
                for (int h = 0; h < 5; h++) {
                    equipos.get(i).addEntrenador(entrenadores.get(contEntrenadores));
                    entrenadores.get(contEntrenadores).setEquipo(equipos.get(i));
                    contEntrenadores++;
                }
            }
           
            for (Equipo equipo : equipos) {
            System.out.println(equipo);
            }

        } 
        else {
            System.out.println(" No se ha podido crear...");
        }
        return equipos;
    }
    	
	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     int opcionElegida = 0;
	     

	     ArrayList<Equipo> equipos = new ArrayList<Equipo>();
	     ArrayList<Estadio> estadios = new ArrayList<Estadio>();
	     ArrayList<Arbitro> arbitros = new ArrayList<Arbitro>();
	     ArrayList<Partido> partidos = new ArrayList<Partido>();
	     ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	     ArrayList<Entrenador> entrenadores = new ArrayList<Entrenador>();
	     
	         do
				{
					System.out.println("AAAAAAAAAAAAAAAAAAAAA");
					System.out.println("1. Crear Jugadores");
					System.out.println("2. Crear Entrenadores.");
					System.out.println("3. Crear Equipos ");
					System.out.println("4. Crear Arbitros.");
					System.out.println("5. Mostrar Jugadores");
					System.out.println("6. Mostrar Equipos.");
					System.out.println("7. Mostrar Entrenadores");
					System.out.println("8. Mostrar Arbitros.");
					System.out.println("9. Alineacion");
					System.out.println("10. Insertar Arbitros");
					System.out.println("11. Insertar Jugadores");
					System.out.println("12. Insertar Entrenadores");
					System.out.println("13. Insertar Equipos.");
					System.out.println("14. Insertar Estadio.");
					System.out.println("15. Salir");
					opcionElegida = sc.nextInt();
	
					switch (opcionElegida) {
					case 1:
						crearJugadores(jugadores);
						break;
					case 2:
						crearEntrenadores(entrenadores);
						break;
					case 3:
						equipos = crearEquipos(jugadores, entrenadores);
						
						break;
					case 4:
						crearArbitros(arbitros);
						break;
					case 5:
						for (Jugador jugador : jugadores) {
						 System.out.println(jugador);
						 }
						break;
					case 6:
						
						for (Equipo equipo: equipos) {
							 System.out.println(equipo);
							 }
						break;
					case 7:
						for (Entrenador entrenador: entrenadores) {
							 System.out.println(entrenador);
							 }
						
						break;
					case 8:
						for (Arbitro arbitro: arbitros) {
							 System.out.println(arbitro);
						}
						
						break;
					case 9:
		   
						ponerAlineacion(entrenadores);
						break;
					case 10:
						for(int i = 0; i < arbitros.size(); i++) {
						Inserts.insertarArbitros(1, 80, "Miguel", "Canto",78, "Dos expulsiones");
					}
						break;
						
					case 11:
						for(int i = 0; i <jugadores.size(); i++) {
						Inserts.insertarJugadores(1,"Jaula","Adda",1, 70, 67, 80, 65);
						}
						break;
					case 12:
						for(int i = 0; i < entrenadores.size(); i++) {
						Inserts.insertarEntrenadores(1,"Fer","Nevot",1 ,62,90);
						}
						break;
					case 13:
						for(int i = 0; i < equipos.size(); i++) {
						Inserts.insertarEquipos(1,"Inglaterra", 6,2,1,3);
						}
						break;
					case 14:
						for(int i = 0; i < 6; i++) {
						Inserts.insertarEstadios(1,11, 20000,"RICO PEREZ",3);
						}
						break;
					default:
						System.out.println("Valor introducido incorrecto.");
						break;
					}
				}
				while( opcionElegida != 15 );
				
				sc.close();
			}
	    }


		


