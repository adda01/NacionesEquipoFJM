package naciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Entrenador extends Persona{
	private Equipo equipo;
	private int experiencia;
    private String nombre;
    private String apellidos;
	
   
    public Entrenador() {
        experiencia = 0;
    }

    public Entrenador(Entrenador entrenador) {
        experiencia = entrenador.experiencia;
    }

    public Entrenador(String nombre, String apellidos, String nombreCompleto, double peso, int experiencia) {
    	super(nombreCompleto, peso);
    	this.nombre = nombre;
    	this.apellidos = apellidos;
        this.experiencia = experiencia;
    }
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public Equipo GetEquipo () {
    	return equipo;
    }
  	public void setEquipo(Equipo equipo) {
		this.equipo =equipo;
		// TODO Auto-generated method stub
		
	}
    public void ponerAlineacion (){
    		
	    	Collections.sort(equipo.getJugadores());
	    	ArrayList<Jugador> aux = new ArrayList<Jugador>();
	    	for (int i = 0; i < 15; i++) {
	    		aux.add(equipo.getJugadores().get(i));
			}
	    	
	    	equipo.setAlineacion(aux);
	    }
  
  	
  	
    @Override
    public String toString() {
        return "Entrenador{" + "equipo=" + equipo +"nombre=" + nombre +"apellidos=" + apellidos+'}';
    }


    


}
