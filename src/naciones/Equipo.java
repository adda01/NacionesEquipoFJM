package naciones;

import java.util.ArrayList;
import java.util.Collections;

public class Equipo {
	  private Enum nombreNacion;
	    private int partidosGanados;
	    private int partidosJugados;
	    private int partidosPerdidos;
	    private int partidosEmpatados;
	    public int getPartidosEmpatados() {
			return partidosEmpatados;
		}



		public void setPartidosEmpatados(int partidosEmpatados) {
			this.partidosEmpatados = partidosEmpatados;
		}




		private int media;
	    private String nombre;
		private ArrayList<Jugador> jugadores;
	    private ArrayList<Entrenador> entrenadores;
	    private ArrayList<Jugador> alineacion;
	    
	    public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


	    public Equipo() {
	        jugadores = new ArrayList<>();
	        entrenadores = new ArrayList<>();
	        partidosGanados = 0;
	        partidosJugados = 0;
	        partidosPerdidos = 0;
	    }

	   

	    public Equipo(Enum nombreNacion, int partidosGanados, int partidosJugados, int partidosPerdidos,  ArrayList<Jugador> jugadores, ArrayList<Entrenador> entrenadores) {
	        this.nombreNacion = nombreNacion;
	        this.partidosGanados = partidosGanados;
	        this.partidosJugados = partidosJugados;
	        this.partidosPerdidos = partidosPerdidos;
	        this.jugadores = jugadores;
	        this.entrenadores = entrenadores;
	    }

	    public Enum getNombreNacion() {
	        return nombreNacion;
	    }

	    public void setNombreNacion(Enum nombreNacion) {
	        this.nombreNacion = nombreNacion;
	    }

	    public int getPartidosGanados() {
	        return partidosGanados;
	    }

	    public void setPartidosGanados(int partidosGanados) {
	        this.partidosGanados = partidosGanados;
	    }

	    public int getPartidosJugados() {
	        return partidosJugados;
	    }

	    public void setPartidosJugados(int partidosJugados) {
	        this.partidosJugados = partidosJugados;
	    }

	    public int getPartidosPerdidos() {
	        return partidosPerdidos;
	    }

	    public int getMedia() {
	    	
	    	int mediatotal = 0;
	    	
			for (int i = 0; i < alineacion.size(); i++) {
				
				mediatotal += alineacion.get(i).getMedia();
				
			}
			
			return mediatotal / alineacion.size();
		}


		public void setMedia(int media) {
			this.media = media;
		}



		public void setPartidosPerdidos(int partidosPerdidos) {
	        this.partidosPerdidos = partidosPerdidos;
	    }
	    
	    public ArrayList<Jugador> getJugadores() {
	        return jugadores;
	    }
	    

	    public void setJugadores(ArrayList<Jugador> jugadores) {
	        this.jugadores = jugadores;
	    }
	    public ArrayList<Jugador> getAlineacion() {
			return alineacion;
		}



		public void setAlineacion(ArrayList<Jugador> alineacion) {
			this.alineacion = alineacion;
		}
	    public void addJugador (Jugador jugador) {
	    	this.jugadores.add(jugador);
	    }

	    public ArrayList<Entrenador> getEntrenadores() {
	        return entrenadores;
	    }

	    public void setEntrenadores(ArrayList<Entrenador> entrenadores) {
	        this.entrenadores = entrenadores;
	    }
	    public void addEntrenador (Entrenador entrenador) {
	    	this.entrenadores.add(entrenador);
	    }
	    @Override
	    public String toString() {
	        return "Equipo{" + "partidos perdidos=" + partidosPerdidos + ", partidosGanados=" + partidosGanados + "partidos empatados: " + partidosEmpatados + "alineacion" +alineacion + ", jugadores=" + jugadores  + "media" + media  + '}';
	    }


	    //Metodos

	    public void addGanado() {
	        partidosGanados++;
	    }

	    public void addEmpate() {
	        partidosEmpatados++;
	    }

	    public void addPerdido() {
	        partidosPerdidos++;
	    }

	    public void addPartidoJugado() {
	        partidosJugados++;
	    }
	



		public void entrenar() {
			
			// TODO Auto-generated method stub
			
		}


}
