package naciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	
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
		int precision;
		double peso;
		
		for (int i = 0; i < 4; i++) {
			
			nombreA = "nombre" + i;
			apellidoA = "apellido" + i;
			nombre = nombreA + apellidoA;
			peso = Math.floor(Math.random()*100);
			precision=(int) Math.floor(Math.random()*100);
			
			Arbitro arbitro= new Arbitro(nombreA,apellidoA,nombre,peso,precision);
			arbitros.add(arbitro);
		}
		 for (Arbitro arbitro : arbitros) {
	            System.out.println(arbitro);
	            }
		
	}
	
	public static void crearEntrenadores(ArrayList<Entrenador> entrenadores) {
		
		String nombreA;
		String apellidoA;
		String nombre;
		int experiencia;
		double peso;
		
		for (int i = 0; i < 30; i++) {
			
			nombreA = "nombre" + i;
			apellidoA = "apellido" + i;
			nombre = nombreA + apellidoA;
			peso = Math.floor(Math.random()*100); 
			experiencia=(int) Math.floor(Math.random()*100);
			
			Entrenador entrenador= new Entrenador(nombreA,apellidoA,nombre,peso,experiencia);
			entrenadores.add(entrenador);
		}
		
	}
	
	public static void crearJugadores(ArrayList<Jugador> jugadores) {
		
		String nombreA;
		String apellidoA;
		String nombre;
		int fuerza;
		int resis;
		int vel;
		int media;
		double peso;
		
		for (int i = 0; i < 180; i++) {
			
			nombreA = "nombre" + i;
			apellidoA = "apellido" + i;
			 nombre = nombreA + apellidoA;
			 fuerza =(int) Math.floor(Math.random()*100);
			 resis =(int) Math.floor(Math.random()*100);
			 vel =(int) Math.floor(Math.random()*100);
			 media = (fuerza + resis + vel) / 3;
			 peso = Math.floor(Math.random()*100);
			
			Jugador jugador = new Jugador(nombreA,apellidoA,nombre,peso,fuerza,resis,vel,media);
			jugadores.add(jugador);
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
	            System.out.println("1. Crear Cosas");
	            System.out.println("2. no.");
	            System.out.println("3. no.");
	            System.out.println("4. no.");
	            System.out.println("5. Mostrar Jugadores");
	            System.out.println("6. Mostrar Equipos.");
	            System.out.println("7. Competicion");
	            System.out.println("8. Crear partidos.");
	            System.out.println("9.Alineacion");
	            System.out.println("10. Salir.");
	            opcionElegida = sc.nextInt();

	            switch (opcionElegida) {
	            case 1:
	                crearJugadores(jugadores);
	                crearEntrenadores(entrenadores);
	                crearArbitros(arbitros);
	                crearEstadios(estadios);
	                equipos = crearEquipos(jugadores, entrenadores);
	                break;
	            case 2:
	            	
	                break;
	            case 3:
	            	
	                
	                break;
	            case 4:
	               
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
	            	competicion(partidos,arbitros,estadios);	            	
	            	break;
	            case 8:
	            	crearPartidos(partidos,equipos,arbitros);
	            	
	            	break;
	            case 9:
   	
	            	ponerAlineacion(entrenadores);
	            	break;
	            case 10:
	            	
	            	break;
	            default:
	                System.out.println("Valor introducido incorrecto.");
	                break;
	            }
	        }
	        while( opcionElegida != 10 );
	        
	        sc.close();
	    }


		

}
