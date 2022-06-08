package naciones;

import java.util.ArrayList;
import java.util.Collections;


public class Entrenador{
	private Equipo equipo;
	private int experiencia;
    private String nombreE;
    private String apellidosE;
    private double peso;
	
   
    

    public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Entrenador(Entrenador entrenador) {
        experiencia = entrenador.experiencia;
    }

    public Entrenador(String nombreE, String apellidosE,String nombre,double peso, int experiencia) {
    	this.nombreE = nombreE;
    	this.apellidosE = apellidosE;
        this.experiencia = experiencia;
        this.peso = peso;
    }
    public String getNombreE() {
		return nombreE;
	}

	public void setNombreE(String nombre) {
		this.nombreE = nombre;
	}

	public String getApellidosE() {
		return apellidosE;
	}

	public void setApellidosE(String apellidos) {
		this.apellidosE = apellidos;
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
        return "Entrenador{" + "equipo=" + equipo +"nombre=" + nombreE +"apellidos=" + apellidosE+ "peso= " + peso +'}';
    }


    


}
