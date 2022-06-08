package naciones;



public class Jugador implements Comparable<Jugador>{
	
	   	private Equipo equipo;
	    private int velocidad;
	    private int fuerza;
	    private int resistencia;
	    private int media;
	    private String nombreJ;
	    private String apellidosJ;
	    private double peso;
	    

	    public double getPeso() {
			return peso;
		}


		public void setPeso(double peso) {
			this.peso = peso;
		}


		

	   
	    public Jugador(String nombreJ, String apellidosJ,String nombre, double peso, int velocidad, int fuerza, int resistencia,int media) {
	    	super();
	        this.nombreJ = nombreJ;
	        this.media = media;
	        this.apellidosJ = apellidosJ;
	        this.velocidad = velocidad;
	        this.fuerza = fuerza;
	        this.resistencia = resistencia;
	    }

	    public Equipo getEquipo() {
	        return equipo;
	    }

	    public void setEquipo(Equipo equipo) {
	        this.equipo = equipo;
	    }

	    public int getVelocidad() {
	        return velocidad;
	    }

	    public void setVelocidad(int velocidad) {
	        this.velocidad = velocidad;
	    }

	    public int getFuerza() {
	        return fuerza;
	    }

	    public void setFuerza(int fuerza) {
	        this.fuerza = fuerza;
	    }

	    public int getResistencia() {
	        return resistencia;
	    }

	    public void setResistencia(int resistencia) {
	        this.resistencia = resistencia;
	    }
	    public String getNombreJ() {
	        return nombreJ;
	    }

	    public void setNombreJ(String nombre) {
	        this.nombreJ = nombre;
	    }
	    public String getApellidoJ() {
	        return apellidosJ;
	    }

	    public void setApellidoJ(String apellido) {
	        this.apellidosJ = apellido;
	    }
	 
	    public int getMedia() {
			return media;
		}


		public void setMedia(int media) {
			this.media = media;
		}


		public String getApellidosJ() {
			return apellidosJ;
		}


		public void setApellidosJ(String apellidos) {
			this.apellidosJ = apellidos;
		}


		@Override
	    public String toString() {
	        return 
	        		
	        		"Jugador{" +
	        		", nombre=" + nombreJ +
	        		", apellidos=" + apellidosJ+
	                ", velocidad=" + velocidad +
	                ", fuerza=" + fuerza +
	                ", resistencia=" + resistencia +
	                ", media=" + media +
	                ", peso=" + peso +
	                '}';
	    }
	    public int compareTo(Jugador jugador) {

	        int media = (this.velocidad + this.fuerza + this.resistencia) / 3;
	        int mediaJugador = (jugador.velocidad + jugador.fuerza + jugador.resistencia) / 3;

	        if (media < mediaJugador)
	            return 1;
	        else if (media > mediaJugador)
	            return -1;
	        else
	            return 0;
	       
	    }
	}


