package naciones;

public class Persona {
	 private String nombreCompleto;
	    private double peso;

	    //constructor por defecto

	    public Persona() {
	        nombreCompleto = "";
	        peso = 0;
	        
	    }

	    //constructor de copia
	    public Persona(Persona persona) {
	        this.nombreCompleto = persona.nombreCompleto;
	        this.peso = persona.peso;

	    }

	    //constructor con parametros
	    public Persona(String nombreCompleto, double peso) {
	        this.nombreCompleto = nombreCompleto;
	        this.peso = peso;
	    }

	    public String getNombreCompleto() {
	        return nombreCompleto;
	    }

	    public void setNombreCompleto(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	    }

	    public double getPeso() {
	        return peso;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    //toString
	    
	    public String toString() {
	        return "Persona{" + "nombreCompleto=" + nombreCompleto + ", peso=" + peso +'}';
	    }

	


}
