package naciones;



public class Jugador extends Persona implements Comparable<Jugador>{
	
	   	private Equipo equipo;
	    private int velocidad;
	    private int fuerza;
	    private int resistencia;
	    private int media;
	    private String nombre;
	    private String apellidos;
	    

	    public Jugador() {
	        super();
	        equipo = null;
	        velocidad = 0;
	        fuerza = 0;
	        resistencia = 0;
	        media = 0;
	    }

	   
	    public Jugador(String nombre, String apellidos, String nombreCompleto, double peso, int velocidad, int fuerza, int resistencia,int media) {
	        super(nombreCompleto, peso);
	        this.nombre = nombre;
	        this.media = media;
	        this.apellidos = apellidos;
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
	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    public String getApellido() {
	        return apellidos;
	    }

	    public void setApellido(String apellidos) {
	        this.apellidos = apellidos;
	    }
	 
	    public int getMedia() {
			return media;
		}


		public void setMedia(int media) {
			this.media = media;
		}


		public String getApellidos() {
			return apellidos;
		}


		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}


		@Override
	    public String toString() {
	        return 
	        		
	        		"Jugador{" +
	        		", nombre=" + nombre +
	        		", apellidos=" + apellidos+
	                ", velocidad=" + velocidad +
	                ", fuerza=" + fuerza +
	                ", resistencia=" + resistencia +
	                ", media=" + media+super.toString() +
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


