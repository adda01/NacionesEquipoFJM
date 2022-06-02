package naciones;

public class Arbitro extends Persona{
	
	 private int precision;

	    public Arbitro() {
	        super();
	        precision = 0;
	    }

	    public Arbitro(Arbitro arbitro) {
	        super(arbitro);
	        precision = arbitro.precision;
	    }

	    public Arbitro(String nombre, String apellidos, String nombreCompleto, double peso, int precision) {
	    	super(nombre, peso);
	        this.precision = precision;
	    }

	    public int getprecision() {
	        return precision;
	    }

	    public void setprecision(int precision) {
	        this.precision = precision;
	    }

	    @Override

	    public String toString() {
	        return "Arbitro{" + "precision=" + precision + '}';
	    }

	    //METODO EMPEZAR PARTIDO
	    
	    public void empezarPartido() {
	    	
	    	System.out.println("El arbitro pita el comienzo");
	    
	    }
	    public void finalPartido() {
	    
	    	System.out.println("El arbitro pita el final");
	    	
	    }

}
